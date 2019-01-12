package com.common.utils;

public class CommonBeanUtils {
	
	
	public static <T> boolean isNull(T t) {
		if(null != t) {
			return true;
		}
		return false;
	}
	
	public static  boolean isNullEmpty(String str) {
		if(null != str && !str.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static  boolean isNull(String str) {
		if(null != str) {
			return true;
		}
		return false;
	}

}
