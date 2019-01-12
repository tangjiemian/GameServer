package com.server.handsomegame.heros.controls;

import com.common.gamebeans.GameHeroBean;
import com.common.gamebeans.GameHeroButeBean;
import com.server.handsomegame.heros.AHero;

public class HeroBeanControl {
	private AHero owner ;
	
	private GameHeroBean heroBean; //基础信息
	
	private GameHeroButeBean heroButeBean;//属性
	
	
	public HeroBeanControl(AHero owner) {
		this.owner = owner;
	}
	
	
	public AHero getOwner() {
		return owner;
	}


	public GameHeroBean getHeroBean() {
		return heroBean;
	}

	public void setHeroBean(GameHeroBean heroBean) {
		this.heroBean = heroBean;
	}

	public GameHeroButeBean getHeroButeBean() {
		return heroButeBean;
	}

	public void setHeroButeBean(GameHeroButeBean heroButeBean) {
		this.heroButeBean = heroButeBean;
	}
	
	
	
	
	
}
