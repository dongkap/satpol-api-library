package com.dongkap.dto.master;

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
public class ParameterGroupDto extends BaseAuditDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8125190677227153892L;
	protected String parameterGroupId;
	protected String parameterGroupCode;
	protected String parameterGroupName;

}