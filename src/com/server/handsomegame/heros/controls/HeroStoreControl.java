package com.server.handsomegame.heros.controls;

import com.server.handsomegame.heros.AHero;

/**
 * �洢������ (����,�ֿ�)
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
