package com.dongkap.common.utils;

public enum QueryOperator {
	
	OBJECT_SPACE_CONSTANT(" obj"),
	OBJECT_POINT_CONSTANT("obj."),

	BLANK(""),
	SPACE(" "),
	COMA_BOTH_SIDE_SPACE(" , "),
	
	FROM(" FROM "),
	WHERE(" WHERE "),
	OR(" OR "),
	AND(" AND "),
	ILIKE("~* %s"),
	EQUAL("%s"), 
	LESS(" < %s"), 
	LESS_EQUAL(" < %s"), 
	GREATER(" > %s"), 
	GREATER_EQUAL(" >= %s"),
	NOT_EQUAL(" <> %s"),

	FIELD_IS_NULL(" IS NULL %s"),
	FIELD_IS_NOT_NULL(" IS NOT NULL %s"),

	FIELD_IN(" IN "),
	FIELD_NOT_IN(" NOT IN "),

	BETWEEN(" BETWEEN %s AND %s"),
	LIKE_BOTH_SIDE("%%%s%%"),
	LIKE_SIDE_RIGHT("%%%s"),
	LIKE_SIDE_LEFT("%s%%"),
	NOT_LIKE_BOTH_SIDE("%%%s%%"),
	NOT_LIKE_SIDE_RIGHT("%%%s"),
	NOT_LIKE_SIDE_LEFT("%s%%"),
	SORT(" ORDER BY "),
	ASC(" ASC"),
	DESC(" DESC");
	
	private String operator;
	
	private QueryOperator(String operator){
		this.operator = operator ;
	}
		
	public String getOperator() {
		return operator;
	}

	@Override
	public String toString() {
		return operator;
	}

}
