package com.server.game.heros.group;

import java.util.ArrayList;
import java.util.List;

import com.server.game.heros.AIHero;
import com.server.net.packet.mod2.GFuck;
import com.server.utils.FightUtils;

public class FGroup {
	
	private List<AIHero> list = new ArrayList<AIHero>();
	
	private List<AIHero> listSpCache = new ArrayList<AIHero>();
	
	
	
	
	
	
	public List<AIHero> getList() {
		return list;
	}
	

	public void put(AIHero hero) {
		list.add(hero);
	}
	
	public void remove(AIHero hero) {
		list.remove(hero);
	}
	
	/**
	 * 维护按敏序排列的组成员，如果有事件影响到敏序则更新
	 */
	public void updateListSpCache() {
		
		
	}
	

	

}
