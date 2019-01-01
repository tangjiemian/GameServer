package com.server.config.cache;

import java.util.HashMap;
import java.util.Map;

import com.server.config.SkillConfig;

public class GameSkillCache {
	
	private static Map<String,SkillConfig> skills = new HashMap<String,SkillConfig>();
	
	
	public static void regditSkill(SkillConfig config) {
		
		skills.put(config.getSkillid(), config);
		
	}
	
	public  static void removeRegditSkill(SkillConfig config) {
		skills.remove(config.getSkillid());
	}
	
	public static void removeRegditSkill(String skillid) {
		skills.remove(skillid);
	}
	
	
	public static SkillConfig getSkill(String skillid) {
		 return skills.get(skillid);
	}
	
	
	public static boolean checkSkill(String skillid) {
		
		return skills.containsKey(skillid);
	}

}
