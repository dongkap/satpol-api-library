package com.dongkap.dto.security;

import java.util.ArrayList;
import java.util.List;

import com.dongkap.dto.common.BaseAuditDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class UserDto extends BaseAuditDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1742415621743889509L;
	private String id;
	private String username;
	private String email;
	private String password;
	private String provider;
	private String verificationCode;
	private String raw;
	private String authorityDefault;
	private List<RoleDto> roles = new ArrayList<RoleDto>();
	private String corporates;
	private String contactUser;
	private String settings;
	private Boolean enabled;
	private Boolean accountNonExpired;
	private Boolean accountNonLocked;
	private Boolean credentialsNonExpired;
	private String verificationExpired;
	private String confirmPassword;
	private String fullname;

}