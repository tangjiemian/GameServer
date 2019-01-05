package com.server.game.heros.controls;

import com.server.game.heros.AIHero;
import com.server.game.heros.group.FightGroup;
import com.server.game.heros.group.MoveGroup;

public class HeroGroupControl {
	
	private AIHero owner;
	
	private FightGroup fightGroup; //战斗组
	
	private MoveGroup moveGroup; //普通组

	private int atIndex = -1; 
	
	public HeroGroupControl(AIHero owner) {
		this.owner = owner;
	}
	
	
	
	public AIHero getOwner() {
		return owner;
	}


	
	

	public int getAtIndex() {
		return atIndex;
	}



	public void setAtIndex(int atIndex) {
		this.atIndex = atIndex;
	}



	/**
	 * 加入组
	 * @param tgroup
	 * @return
	 */
	public boolean gotoTGroup(FightGroup fightGroup) {
		this.fightGroup = fightGroup;
		return this.fightGroup.addHero(owner);
	}
	
	/**
	 * 创建组
	 * @return
	 */
	public boolean crateMoveGroup() {
		this.moveGroup = new MoveGroup(owner);
		return true;
	}
	
	
}
