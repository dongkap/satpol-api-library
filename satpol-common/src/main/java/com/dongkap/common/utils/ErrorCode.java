package com.dongkap.common.utils;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

	ERR_XDONGKAPKEY(HttpStatus.UNAUTHORIZED),
	ERR_XDONGKAPTIMESTAMP(HttpStatus.UNAUTHORIZED),
	ERR_XDONGKAPSIGNATURE(HttpStatus.UNAUTHORIZED),
	ERR_UNAUTHORIZED(HttpStatus.UNAUTHORIZED),
	ERR_SYS0411(HttpStatus.UNAUTHORIZED),
	ERR_SYS0412(HttpStatus.UNAUTHORIZED),
	ERR_SYS0413(HttpStatus.UNAUTHORIZED),
	ERR_SYS0414(HttpStatus.UNAUTHORIZED),
	ERR_SYS0401(HttpStatus.FORBIDDEN),

	ERR_SYS0001(HttpStatus.NOT_FOUND),
	ERR_SYS0002(HttpStatus.NOT_FOUND),
	ERR_SYS0003(HttpStatus.NOT_FOUND),
	ERR_SYS0004(HttpStatus.NOT_FOUND),
	ERR_SYS0404(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SYS0405(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SYS0500(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SYS0501(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SYS0502(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SYS0415(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SYS0302(HttpStatus.FOUND),

	ERR_SCR0000(HttpStatus.FORBIDDEN),
	ERR_SCR0001(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0002(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0003(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0004(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0005(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0006(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0007A(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0007B(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0008(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0009(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0010(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0011(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0012(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0013(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0014(HttpStatus.INTERNAL_SERVER_ERROR),
	ERR_SCR0015(HttpStatus.INTERNAL_SERVER_ERROR);

	private final HttpStatus status;

	ErrorCode(HttpStatus status) {
		this.status = status;
	}
	
	public HttpStatus getStatus() {
		return this.status;
	}
	
}
