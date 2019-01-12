package com.server.handsomegame.heros;

import java.util.HashMap;
import java.util.Map;



public class HeroKing extends AHero{
	
	private String id;
	
	private String kingname;
	
	private HeroBaby carrentBaby;
	
	private Map<String,HeroBaby> babys = new HashMap<String,HeroBaby>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKingname() {
		return kingname;
	}

	public void setKingname(String kingname) {
		this.kingname = kingname;
	}

	public HeroBaby getCarrentBaby() {
		return carrentBaby;
	}

	public void setCarrentBaby(HeroBaby carrentBaby) {
		this.carrentBaby = carrentBaby;
	}


	public void putHeroBaby(HeroBaby heroBaby) {
		
		babys.put(heroBaby.getId(), heroBaby);
	
	}
	
	
	public void removeHeroBaby(String key) {
		babys.remove(key);
	}
	
	public void changeSetCarrentBaby(String key) {
		HeroBaby  get = babys.get(key);
		if(null != get) {
			carrentBaby = get;
		}
	}
	
	
}
