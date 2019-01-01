package com.server.utils;

import com.server.config.SkillConfig;
import com.server.config.cache.GameSkillCache;
import com.server.game.skills.AISkill;

public class SkillUtils {
	
	
	public static AISkill combineSkill(AISkill skill) {
		AISkill lifecycle = new AISkill();
		SkillConfig skillConfig = GameSkillCache.getSkill(skill.getSkillid());

		lifecycle.setValue(skill.getValue() + skillConfig.getValue());
		
		return lifecycle;
		
	}

}
