package com.dongkap.feign.decoder;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import com.dongkap.common.exceptions.FeignAuthException;
import com.dongkap.common.exceptions.FeignThrowException;
import com.dongkap.common.utils.ErrorCode;
import com.dongkap.dto.common.ApiBaseResponse;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;

@Component
public class FeignErrorDecoder implements ErrorDecoder {

	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public Decoder springDecoder;

	@Override
	public Exception decode(String methodKey, Response response) {
		ApiBaseResponse errorResponse = new ApiBaseResponse();
		errorResponse.setRespStatusCode(ErrorCode.ERR_SYS0500.name());
		LOGGER.error("Error took place when using Feign client to send HTTP Request");
		LOGGER.error("Status code 	: {}", response.status());
		LOGGER.error("URL 		: {}", response.request().url());
		switch (response.status()) {
			case 401:
			case 403:
			case 407:
				return new FeignAuthException(HttpStatus.valueOf(response.status()));
			case 404:
				LOGGER.error("Reason		: {}", response.reason());
				return new ResponseStatusException(HttpStatus.valueOf(response.status()), response.reason());
			default:
				try {
					errorResponse = (ApiBaseResponse) springDecoder.decode(response, ApiBaseResponse.class);
					LOGGER.error("Reason 		: {}", errorResponse.toString());
				} catch (DecodeException e) {
					LOGGER.error("Reason 		: {}", e.getMessage());
					e.printStackTrace();
				} catch (FeignException e) {
					LOGGER.error("Reason 		: {}", e.getMessage());
					e.printStackTrace();
				} catch (IOException e) {
					LOGGER.error("Reason 		: {}", e.getMessage());
					e.printStackTrace();
				}
				break;
		}
		return new FeignThrowException(errorResponse, HttpStatus.valueOf(response.status()));
	}

}
