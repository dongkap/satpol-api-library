package com.dongkap.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CommonMessageDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5084710113051457542L;
	private String topic;
	private String status;
	private List<Object> datas = new ArrayList<Object>();

}
