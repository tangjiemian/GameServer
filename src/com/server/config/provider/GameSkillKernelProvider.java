package com.server.config.provider;

import java.util.HashMap;
import java.util.Map;

import com.server.config.KernelSkillConfig;

public class GameSkillKernelProvider {
	
	private static Map<String,KernelSkillConfig> skills = new HashMap<String,KernelSkillConfig>();
	
	
	public static void regditSkill(KernelSkillConfig config) {
		skills.put(config.getId(), config);
	}
	
	public  static void removeRegditSkill(KernelSkillConfig config) {
		skills.remove(config.getId());
	}
	
	public static void removeRegditSkill(String skillid) {
		skills.remove(skillid);
	}
	
	
	public static KernelSkillConfig getSkill(String skillid) {
		 return skills.get(skillid);
	}
	
	
	public static boolean checkSkill(String skillid) {
		
		return skills.containsKey(skillid);
	}

}
