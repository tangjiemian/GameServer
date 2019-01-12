package com.server.handsomegame.heros.controls;

import java.util.HashMap;
import java.util.Map;

import com.common.gamebeans.GameHeroMagicBean;
import com.server.handsomegame.heros.AHero;

public class HeroMagicControl {
	
	private AHero owner;
	
	private Map<String,GameHeroMagicBean> magics = new HashMap<String,GameHeroMagicBean>();//ע�Ἴ��
	
	public HeroMagicControl(AHero owner) {
		this.owner = owner;
	}
	

	public AHero getOwner() {
		return owner;
	}


	/**
	 * ע�Ἴ��
	 * @param skill
	 */
	public void regditEMagic(GameHeroMagicBean magic) {
		magics.put(magic.getMagicid(), magic);
	}
	
	/**
	 * �Ƴ�����
	 * @param skillid
	 */
	public void removeRegditEMagic(String magicid) {
		magics.remove(magicid);
	}
	
	
	/**
	 * ��ȡһ����������
	 * @param skillid
	 * @return
	 */
	public GameHeroMagicBean getHeroEMagic(String magicid) {
		 return magics.get(magicid);
	}
	
	
	/**
	 * ��֤�����Ƿ����
	 * @param skillid
	 * @return
	 */
	public boolean checkMagic(String magicid) {
		
		return magics.containsKey(magicid);
	}
	
	
}
