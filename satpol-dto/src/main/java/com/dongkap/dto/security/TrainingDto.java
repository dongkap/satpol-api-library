package com.dongkap.dto.security;

import java.util.Date;

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
public class TrainingDto extends BaseAuditDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2442773369159964802L;
	
	private String id;
	private String code;
	private String name;
	private Date startDate;
	private Date endDate;

}