package com.server.game.heros.controls;

import java.util.HashMap;
import java.util.Map;

import com.server.game.beans.HeroSkillBean;
import com.server.game.heros.AIHero;

public class HeroSkillControl {
	
	private AIHero owner;
	
	private Map<String,HeroSkillBean> skils = new HashMap<String,HeroSkillBean>();//注册技能
	
	public HeroSkillControl(AIHero owner) {
		this.owner = owner;
	}
	

	public AIHero getOwner() {
		return owner;
	}


	/**
	 * 注册技能
	 * @param skill
	 */
	public void regditSkill(HeroSkillBean skill) {
		skils.put(skill.getSkillid(), skill);
	}
	
	/**
	 * 移除技能
	 * @param skillid
	 */
	public void removeRegditSkill(String skillid) {
		skils.remove(skillid);
	}
	
	
	/**
	 * 获取一个技能属性
	 * @param skillid
	 * @return
	 */
	public HeroSkillBean getHeroSkillBean(String skillid) {
		 return skils.get(skillid);
	}
	
	
	/**
	 * 验证技能是否存在
	 * @param skillid
	 * @return
	 */
	public boolean checkSkill(String skillid) {
		
		return skils.containsKey(skillid);
	}
	
	
}
