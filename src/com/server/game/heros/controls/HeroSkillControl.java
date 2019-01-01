package com.server.game.heros.controls;

import java.util.HashMap;
import java.util.Map;

import com.server.game.skills.AISkill;
import com.server.utils.SkillUtils;

public class HeroSkillControl {
	
	private Map<String,AISkill> skils = new HashMap<String,AISkill>();
	
	
	public void regditSkill(AISkill skill) {
		
		skils.put(skill.getSkillid(), skill);
		
	}
	
	public void removeRegditSkill(AISkill skill) {
		skils.remove(skill.getSkillid());
	}
	
	public void removeRegditSkill(String skillid) {
		skils.remove(skillid);
	}
	
	
	public AISkill getOriginalSkill(String skillid) {
		 return skils.get(skillid);
	}
	
	
	public AISkill getCombineSkillWithCofnigSkill(String skillid) {
		return SkillUtils.combineSkill(skils.get(skillid));
	}
	
	public boolean checkSkill(String skillid) {
		
		return skils.containsKey(skillid);
	}
	
	
	
	
	
	
}
