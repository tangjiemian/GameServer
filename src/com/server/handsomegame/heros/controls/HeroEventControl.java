package com.server.handsomegame.heros.controls;

import com.server.handsomegame.heros.AHero;

public class HeroEventControl {
	
	private AHero owner;
	
	public HeroEventControl(AHero owner) {
		this.owner = owner;
	}

	public AHero getOwner() {
		return owner;
	}
	
	
}
