package com.server.handsomegame.heros.controls;

import java.util.HashMap;
import java.util.Map;

import com.common.gamebeans.GameHeroMagicBean;
import com.server.handsomegame.heros.AHero;

public class HeroMagicControl {
	
	private AHero owner;
	
	private Map<String,GameHeroMagicBean> magics = new HashMap<String,GameHeroMagicBean>();//注册技能
	
	public HeroMagicControl(AHero owner) {
		this.owner = owner;
	}
	

	public AHero getOwner() {
		return owner;
	}


	/**
	 * 注册技能
	 * @param skill
	 */
	public void regditEMagic(GameHeroMagicBean magic) {
		magics.put(magic.getMagicid(), magic);
	}
	
	/**
	 * 移除技能
	 * @param skillid
	 */
	public void removeRegditEMagic(String magicid) {
		magics.remove(magicid);
	}
	
	
	/**
	 * 获取一个技能属性
	 * @param skillid
	 * @return
	 */
	public GameHeroMagicBean getHeroEMagic(String magicid) {
		 return magics.get(magicid);
	}
	
	
	/**
	 * 验证技能是否存在
	 * @param skillid
	 * @return
	 */
	public boolean checkMagic(String magicid) {
		
		return magics.containsKey(magicid);
	}
	
	
}
