package com.common.utils;

import java.net.URL;

public class CommonFileUtils {
	
	public static String getJSONSourcePath(String jsonFile) {
		
		
		
		return CommonFileUtils.class.getResource("/JSON").getPath() + "/" + jsonFile;
	}
	
	
	public static URL getFMXLSourcePath(String jsonFile) {
		
		URL url = CommonFileUtils.class.getResource("/FXML/" + jsonFile);
		
		System.out.println("getFMXLSourcePath" + url);
		
		return url;
		
		//return CommonFileUtils.class.getResource("/FXML").getPath() + "/" + jsonFile;
	}

}
