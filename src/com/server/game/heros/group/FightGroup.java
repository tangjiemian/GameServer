package com.server.game.heros.group;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.server.game.heros.AIHero;
import com.server.game.skills.AISkill;

public class FightGroup {
	
	private List<AIHero> list = new ArrayList<AIHero>();
	
	private Map<String,AISkill> bufferList = new HashMap<String,AISkill>();//ע��ս��buffer����
	
	
	
	
	public List<AIHero> getList() {
		return list;
	}
	

	public boolean addHero(AIHero hero) {
		list.add(hero);
		
		return true;
	}
	
	public void remove(AIHero hero) {
		list.remove(hero);
	}
	

	/**
	 * ע��buffer
	 * @param skill
	 */
	public void registerFightBuffer(AISkill skill) {
		bufferList.put(skill.getSkillid(), skill);
	}

	/**
	 * ��ȡbuffer
	 * @param skillid
	 * @return
	 */
	public AISkill getFightBuffer(String skillid) {
		
		return bufferList.get(skillid);
	}
	
	/**
	 * ��ȡ��ǰս���������buffer����
	 * @return
	 */
	public List<AISkill> getFightBufferList(){
		 Collection<AISkill> valueCollection = bufferList.values();
		 return  new ArrayList<AISkill>(valueCollection);
	}

}
