package com.server.game;

import java.util.HashMap;
import java.util.Map;

public class GameEnvironment {
	
	public static Map<Integer,Map<String,Object>> gameHeroSetting = new HashMap<Integer,Map<String,Object>>();
	
	public static Map<Integer,Map<String,Object>> gameSkillSetting = new HashMap<Integer,Map<String,Object>>();
	
	//public static Map<String,KernelSkillConfig> kernelSkillConfig = new HashMap<String,KernelSkillConfig>();
	
	
	public static void main(String[] args) {
		
		GameEnvironmentLoader.loader();
		
	}

}
