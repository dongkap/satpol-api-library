package com.dongkap.dto.security;

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
public class EducationDto extends BaseAuditDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2442773369159964802L;
	private String id;
	private String educationalLevel;
	private String educationalLevelCode;
	private String schoolName;
	private String degree;
	private String study;
	private String grade;
	private int startYear;
	private int endYear;

}
