package com.server.handsomegame.heros.group;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.magic.AISkill;


/**
 * 战斗组
 * @author pc
 *
 */
public class FightGroup {
	
	private List<AHero> list = new ArrayList<AHero>();
	
	private Map<String,AISkill> bufferList = new HashMap<String,AISkill>();//注册战斗组buffer技能
	
	
	public List<AHero> getList() {
		return list;
	}
	

	public boolean addHero(AHero hero) {
		list.add(hero);
		
		return true;
	}
	
	public void remove(AHero hero) {
		list.remove(hero);
	}
	

	/**
	 * 注册buffer
	 * @param skill
	 */
	public void registerFightBuffer(AISkill skill) {
		bufferList.put(skill.getSkillid(), skill);
	}

	/**
	 * 获取buffer
	 * @param skillid
	 * @return
	 */
	public AISkill getFightBuffer(String skillid) {
		
		return bufferList.get(skillid);
	}
	
	/**
	 * 获取当前战斗组的所有buffer技能
	 * @return
	 */
	public List<AISkill> getFightBufferList(){
		 Collection<AISkill> valueCollection = bufferList.values();
		 return  new ArrayList<AISkill>(valueCollection);
	}
	
	/**
	 * 按速度取获多个单位
	 * @param number
	 * @return
	 */
	public List<AHero> getHeroListOrderBySp(int number){
		return null;
	}
	
	/**
	 * 按速度获取一个单位
	 * @return
	 */
	public AHero getHeroOrderBySp(){
		return null;
	}

	/**
	 * 按攻击力取获多个单位
	 * @param number
	 * @return
	 */
	public List<AHero> getHeroListOrderByAp(int number){
		return null;
	}
	
	/**
	 * 按攻击力获取一个单位
	 * @return
	 */
	public AHero getHeroOrderByAp(){
		return null;
	}
	
	/**
	 * 按血量取获多个单位
	 * @param number
	 * @return
	 */
	public List<AHero> getHeroListOrderByHp(int number){
		return null;
	}
	
	/**
	 * 按血量获取一个单位
	 * @return
	 */
	public AHero getHeroOrderByHp(){
		return null;
	}
	
	/**
	 * 按蓝量取获多个单位
	 * @param number
	 * @return
	 */
	public List<AHero> getHeroListOrderByMp(int number){
		return null;
	}
	
	/**
	 * 按蓝量获取一个单位
	 * @return
	 */
	public AHero getHeroOrderByMp(){
		return null;
	}
	
	/**
	 * 按位置获取相连的两个单位
	 * @param index
	 * @return
	 */
	public List<AHero> getTwoHeroWithBetweenLocation(int index){
		
		return null;
	}
	
	/**
	 * 按位置获取同排的随机N个单位
	 * @param index
	 * @return
	 */
	public List<AHero> getHeroListWithBetweenLocationOnLine(int index){
		
		return null;
	}
	
	/**
	 * 按位置获取不同排的随机N个单位
	 * @param index
	 * @return
	 */
	public List<AHero> getHeroListWithBetweenLocationNotOnLine(int index){
		
		return null;
	}
	
}
