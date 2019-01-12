package com.server.handsomegame.heros.group;

import com.server.handsomegame.heros.AHero;

public class GameFight {

	private FightGroup firstViewGroup;
	
	private FightGroup TowtViewGroup;
	
	//观战玩家
	//战斗全局Buffer计算处理

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
	 * 获取当前战斗敏最快的单位
	 * @return
	 */
	public AHero getCurrentFightFirstSpTarget(){
		
		
		return null;
	}
	
	/**
	 * 获取当前战斗攻击最高的单位
	 * @return
	 */
	public AHero getCurrentFightFirstApTarget(){
		
		
		return null;
	}
	
	
	
}
