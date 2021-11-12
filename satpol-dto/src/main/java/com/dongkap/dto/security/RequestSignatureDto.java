package com.dongkap.dto.security;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class RequestSignatureDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String path;
	private String accessToken;

}