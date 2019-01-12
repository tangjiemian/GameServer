package com.server.handsomegame.heros.controls;

import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.heros.group.FightGroup;
import com.server.handsomegame.heros.group.MoveGroup;

public class HeroGroupControl {
	
	private AHero owner;
	
	private FightGroup fightGroup; //战斗组
	
	private MoveGroup moveGroup; //普通组

	private int atIndex = -1; 
	
	
	public AHero getOwner() {
		return owner;
	}

	public int getAtIndex() {
		return atIndex;
	}

	public void setAtIndex(int atIndex) {
		this.atIndex = atIndex;
	}

	public FightGroup getFightGroup() {
		return fightGroup;
	}

	public MoveGroup getMoveGroup() {
		return moveGroup;
	}

	public HeroGroupControl(AHero owner) {
		this.owner = owner;
	}


	/**
	 * 创建普通组
	 * @return
	 */
	public boolean crateMoveGroup() {
		this.moveGroup = new MoveGroup(owner);
		return true;
	}
	
	/**
	 * 加入普通组
	 * @param moveGroup
	 * @return
	 */
	public boolean gotoMoveGroup(MoveGroup moveGroup) {
		
		return true;
	}
	
	/**
	 * 创建战斗组
	 * @return
	 */
	public boolean crateFightGroup() {
		if(null == fightGroup) {
			fightGroup = new FightGroup();
		}
		if(null == moveGroup) {
			this.gotoFightGroup(fightGroup);
		}else {
			for(AHero hero:moveGroup.getList()) {
				hero.getHeroGroupControl().gotoFightGroup(fightGroup);
			}
		}
		return true;
	}
	
	/**
	 * 加入战斗组
	 * @param tgroup
	 * @return
	 */
	public boolean gotoFightGroup(FightGroup fightGroup) {
		this.fightGroup = fightGroup;
		return this.fightGroup.addHero(owner);
	}
	
}
