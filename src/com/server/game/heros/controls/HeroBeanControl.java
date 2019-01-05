package com.server.game.heros.controls;

import com.server.game.beans.HeroBean;
import com.server.game.beans.HeroButeBean;
import com.server.game.heros.AIHero;

public class HeroBeanControl {
	private AIHero owner ;
	
	private HeroBean heroBean; //基础信息
	
	private HeroButeBean heroButeBean;//属性
	
	
	public HeroBeanControl(AIHero owner) {
		this.owner = owner;
	}
	
	
	public AIHero getOwner() {
		return owner;
	}


	public HeroBean getHeroBean() {
		return heroBean;
	}

	public void setHeroBean(HeroBean heroBean) {
		this.heroBean = heroBean;
	}

	public HeroButeBean getHeroButeBean() {
		return heroButeBean;
	}

	public void setHeroButeBean(HeroButeBean heroButeBean) {
		this.heroButeBean = heroButeBean;
	}
	
	
	
	
	
}
