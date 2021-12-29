package com.dongkap.dto.master;

import com.dongkap.dto.common.BaseAuditDto;
import com.dongkap.dto.security.CorporateDto;

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
public class AssetDto extends BaseAuditDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8874124628846019913L;
	private String id;
	private String assetName;
	private String assetCondition;
	private Integer quantity;
	private String description;
	private BusinessPartnerDto businessPartner;
	private CorporateDto corporate;

}