package com.server.handsomegame.heros;

import java.util.HashMap;
import java.util.Map;

public class GamePlayer {
	
	private HeroKing currentKing;
	
	private Map<String,HeroKing> kings = new HashMap<String,HeroKing>();

	public void putHeroKing(HeroKing value) {
		kings.put(value.getId(), value);
	}
	
	
	public HeroKing getCurrentKing() {
		return currentKing;
	}


	public void setCurrentKing(HeroKing currentKing) {
		this.currentKing = currentKing;
	}


	public void removeHeroKing(String key) {
		kings.remove(key);
	}
	
	
}
