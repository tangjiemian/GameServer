package com.server.game.heros.controls;

import com.server.game.heros.AIHero;

public class HeroMessageControl {
	
	private AIHero owner;
	
	public HeroMessageControl(AIHero owner) {
		this.owner = owner;
	}

	public AIHero getOwner() {
		return owner;
	}
	
	

}
