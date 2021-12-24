package com.dongkap.common.stream;

import java.lang.reflect.Method;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.stream.ObjectRecord;
import org.springframework.data.redis.connection.stream.StreamRecords;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Component;

import com.dongkap.dto.common.CommonStreamMessageDto;

@Aspect
@Component
public class PublishDataAspect {

	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ReactiveRedisOperations<String, CommonStreamMessageDto> reactiveRedisTemplate;
	
	@Around("execution(java.util.List *(..)) && "
			+ "@annotation(com.dongkap.common.stream.PublishStream)")
    public void doPublish(ProceedingJoinPoint pjp) throws Throwable {
		List<Object> datas = extracted(pjp);
		try {
			final Signature signature = pjp.getSignature();
		    if(signature instanceof MethodSignature){
		        final MethodSignature ms = (MethodSignature) signature;
		        final Method method = ms.getMethod();
				String streamKey = method.getAnnotation(PublishStream.class).key();
				String status = method.getAnnotation(PublishStream.class).status();				
				if(datas != null) {
					if(datas.size() > 0) {
						CommonStreamMessageDto message = new CommonStreamMessageDto(streamKey, status, datas);
						ObjectRecord<String, CommonStreamMessageDto> record = StreamRecords.newRecord()
								.in(streamKey)
		                        .ofObject(message);
				        this.reactiveRedisTemplate
				                .opsForStream()
				                .add(record)
				                .subscribe();	
					}
				}
		    }
		} catch (Exception e) {
			LOGGER.warn(e.getMessage(), e);
		}
    }

	@SuppressWarnings("unchecked")
	private List<Object> extracted(ProceedingJoinPoint pjp) throws Throwable {
		return (List<Object>)pjp.proceed();
	}

}
