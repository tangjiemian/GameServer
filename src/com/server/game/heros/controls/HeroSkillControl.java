package com.server.game.heros.controls;

import java.util.HashMap;
import java.util.Map;

import com.server.game.beans.HeroSkillBean;
import com.server.game.heros.AIHero;

public class HeroSkillControl {
	
	private AIHero owner;
	
	private Map<String,HeroSkillBean> skils = new HashMap<String,HeroSkillBean>();//ע�Ἴ��
	
	public HeroSkillControl(AIHero owner) {
		this.owner = owner;
	}
	

	public AIHero getOwner() {
		return owner;
	}


	/**
	 * ע�Ἴ��
	 * @param skill
	 */
	public void regditSkill(HeroSkillBean skill) {
		skils.put(skill.getSkillid(), skill);
	}
	
	/**
	 * �Ƴ�����
	 * @param skillid
	 */
	public void removeRegditSkill(String skillid) {
		skils.remove(skillid);
	}
	
	
	/**
	 * ��ȡһ����������
	 * @param skillid
	 * @return
	 */
	public HeroSkillBean getHeroSkillBean(String skillid) {
		 return skils.get(skillid);
	}
	
	
	/**
	 * ��֤�����Ƿ����
	 * @param skillid
	 * @return
	 */
	public boolean checkSkill(String skillid) {
		
		return skils.containsKey(skillid);
	}
	
	
}
