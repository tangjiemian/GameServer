package com.server.handsomegame.heros.group;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.magic.AISkill;


/**
 * ս����
 * @author pc
 *
 */
public class FightGroup {
	
	private List<AHero> list = new ArrayList<AHero>();
	
	private Map<String,AISkill> bufferList = new HashMap<String,AISkill>();//ע��ս����buffer����
	
	
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
	
	/**
	 * ���ٶ�ȡ������λ
	 * @param number
	 * @return
	 */
	public List<AHero> getHeroListOrderBySp(int number){
		return null;
	}
	
	/**
	 * ���ٶȻ�ȡһ����λ
	 * @return
	 */
	public AHero getHeroOrderBySp(){
		return null;
	}

	/**
	 * ��������ȡ������λ
	 * @param number
	 * @return
	 */
	public List<AHero> getHeroListOrderByAp(int number){
		return null;
	}
	
	/**
	 * ����������ȡһ����λ
	 * @return
	 */
	public AHero getHeroOrderByAp(){
		return null;
	}
	
	/**
	 * ��Ѫ��ȡ������λ
	 * @param number
	 * @return
	 */
	public List<AHero> getHeroListOrderByHp(int number){
		return null;
	}
	
	/**
	 * ��Ѫ����ȡһ����λ
	 * @return
	 */
	public AHero getHeroOrderByHp(){
		return null;
	}
	
	/**
	 * ������ȡ������λ
	 * @param number
	 * @return
	 */
	public List<AHero> getHeroListOrderByMp(int number){
		return null;
	}
	
	/**
	 * ��������ȡһ����λ
	 * @return
	 */
	public AHero getHeroOrderByMp(){
		return null;
	}
	
	/**
	 * ��λ�û�ȡ������������λ
	 * @param index
	 * @return
	 */
	public List<AHero> getTwoHeroWithBetweenLocation(int index){
		
		return null;
	}
	
	/**
	 * ��λ�û�ȡͬ�ŵ����N����λ
	 * @param index
	 * @return
	 */
	public List<AHero> getHeroListWithBetweenLocationOnLine(int index){
		
		return null;
	}
	
	/**
	 * ��λ�û�ȡ��ͬ�ŵ����N����λ
	 * @param index
	 * @return
	 */
	public List<AHero> getHeroListWithBetweenLocationNotOnLine(int index){
		
		return null;
	}
	
}
