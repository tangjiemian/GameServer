package com.server.handsomegame.heros.group;

import com.server.handsomegame.heros.AHero;

public class GameFight {

	private FightGroup firstViewGroup;
	
	private FightGroup TowtViewGroup;
	
	//��ս���
	//ս��ȫ��Buffer���㴦��

	public FightGroup getFirstViewGroup() {
		return firstViewGroup;
	}

	public void setFirstViewGroup(FightGroup firstViewGroup) {
		this.firstViewGroup = firstViewGroup;
	}

	public FightGroup getTowtViewGroup() {
		return TowtViewGroup;
	}

	public void setTowtViewGroup(FightGroup towtViewGroup) {
		TowtViewGroup = towtViewGroup;
	}
	
	
	/**
	 * ��ȡ��ǰս�������ĵ�λ
	 * @return
	 */
	public AHero getCurrentFightFirstSpTarget(){
		
		
		return null;
	}
	
	/**
	 * ��ȡ��ǰս��������ߵĵ�λ
	 * @return
	 */
	public AHero getCurrentFightFirstApTarget(){
		
		
		return null;
	}
	
	
	
}
