package com.dongkap.common.utils;

public final class RibbonContext {

	public static final String APP = "satpol";
	public static final String BASE_PATH = "/api";
	
	public static final String SECURITY = "security";
	public static final String MASTER = "master";
	public static final String ACTIVITY = "activity";
	public static final String NOTIFICATION = "notification";
	public static final String REPORT = "report";
	
	public static final String SECURITY_APP = APP + "-" + SECURITY;
	public static final String MASTER_APP = APP + "-" + MASTER;
	public static final String ACTIVITY_APP = APP + "-" + ACTIVITY;
	public static final String NOTIFICATION_APP = APP + "-" + NOTIFICATION;
	public static final String REPORT_APP = APP + "-" + REPORT;

	public static final String API_SECURITY = BASE_PATH + "/" + SECURITY;
	public static final String API_MASTER = BASE_PATH + "/" + MASTER;
	public static final String API_ACTIVITY = BASE_PATH + "/" + ACTIVITY;
	public static final String API_NOTIFICATION = BASE_PATH + "/" + NOTIFICATION;
	public static final String API_REPORT = BASE_PATH + "/" + REPORT;
}
