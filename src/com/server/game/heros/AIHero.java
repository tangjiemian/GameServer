package com.server.game.heros;

import com.server.game.heros.controls.HeroControl;
import com.server.game.heros.controls.HeroRequestControl;
import com.server.game.heros.controls.HeroSkillControl;

public abstract class AIHero {
	
	private String ids;
	private HeroControl heroControl = new HeroControl();
	private HeroSkillControl heroSkillControl = new HeroSkillControl();
	private HeroRequestControl heroRequestControl = new HeroRequestControl();
	
	private int atIndex;
	
	private int isAttack = 0;
	
	public String getIds() {
		return ids;
	}

	
	
	public HeroControl getHeroControl() {
		return heroControl;
	}



	public HeroSkillControl getHeroSkillControl() {
		return heroSkillControl;
	}



	public HeroRequestControl getHeroRequestControl() {
		return heroRequestControl;
	}



	public int getAtIndex() {
		return atIndex;
	}



	public void setAtIndex(int atIndex) {
		this.atIndex = atIndex;
	}



	public int getIsAttack() {
		return isAttack;
	}



	public void setIsAttack(int isAttack) {
		this.isAttack = isAttack;
	}

	
}
