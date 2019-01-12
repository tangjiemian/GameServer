package com.server.handsomegame.scenes;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.heros.HeroKing;
import com.server.handsomegame.heros.HeroNPC;

public class NScene {
	
	private Map<String,HeroKing> mHeros = new ConcurrentHashMap<String,HeroKing>();
	
	private Map<String,HeroNPC> npcHeros = new ConcurrentHashMap<String,HeroNPC>();
	
	public NScene() {
		
	}
	
	public void putMHero(HeroKing hero) {
		mHeros.put(hero.getId(), hero);
	}
	
	public void removeMHero(HeroKing hero) {
		mHeros.remove(hero.getId());
	}
	
	public void putNPCHero(HeroNPC hero) {
		npcHeros.put(hero.getIds(), hero);
	}
	
	public void removeNPCHero(HeroNPC hero) {
		npcHeros.remove(hero.getIds());
	}
	
	public AHero getHeroKing(String heroid) {
		
		return mHeros.get(heroid);
		
	}
	

}
