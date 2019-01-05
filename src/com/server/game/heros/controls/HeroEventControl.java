package com.server.game.heros.controls;

import com.server.game.heros.AIHero;

public class HeroEventControl {
	
	private AIHero owner;
	
	public HeroEventControl(AIHero owner) {
		this.owner = owner;
	}

	public AIHero getOwner() {
		return owner;
	}
	
	
}
