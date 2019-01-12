package com.server.handsomegame.heros.controls;

import com.server.handsomegame.heros.AHero;

/**
 * ´æ´¢¿ØÖÆÆ÷ (±³°ü,²Ö¿â)
 * @author pc
 *
 */
public class HeroStoreControl {
	
	private AHero owner;
	
	public HeroStoreControl(AHero owner) {
		this.owner = owner;
	}

	public AHero getOwner() {
		return owner;
	}
	
	
}
