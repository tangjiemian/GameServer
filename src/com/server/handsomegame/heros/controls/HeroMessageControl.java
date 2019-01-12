package com.server.handsomegame.heros.controls;

import com.server.handsomegame.heros.AHero;

public class HeroMessageControl {
	
	private AHero owner;
	
	public HeroMessageControl(AHero owner) {
		this.owner = owner;
	}

	public AHero getOwner() {
		return owner;
	}
	
	

}
