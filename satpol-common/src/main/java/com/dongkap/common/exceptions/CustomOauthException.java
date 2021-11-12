package com.dongkap.common.exceptions;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = CustomOauthExceptionSerializer.class)
public class CustomOauthException extends OAuth2Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6956862312103005998L;
	private String oAuth2ErrorCode;

	public CustomOauthException(String msg) {
        super(msg);
    }

	public CustomOauthException(String msg, String oAuth2ErrorCode) {
		super(msg);
		this.oAuth2ErrorCode = oAuth2ErrorCode;
	}
	
	public String getOAuth2ErrorCode() {
		return this.oAuth2ErrorCode;
	}
}