package com.server.game.scenes;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.server.game.heros.HeroKing;
import com.server.game.heros.HeroNPC;

public class NScene {
	
	private Map<String,HeroKing> mHeros = new ConcurrentHashMap<String,HeroKing>();
	
	private Map<String,HeroNPC> npcHeros = new ConcurrentHashMap<String,HeroNPC>();
	
	public NScene() {
		
	}
	
	public void putMHero(HeroKing hero) {
		mHeros.put(hero.getIds(), hero);
	}
	
	public void removeMHero(HeroKing hero) {
		mHeros.remove(hero.getIds());
	}
	
	public void putNPCHero(HeroNPC hero) {
		npcHeros.put(hero.getIds(), hero);
	}
	
	public void removeNPCHero(HeroNPC hero) {
		npcHeros.remove(hero.getIds());
	}
	

}
