package com.server.handsomegame.heros.controls;

import java.util.HashMap;
import java.util.Map;

import com.common.gamebeans.GameEquipmentBean;
import com.server.handsomegame.heros.AHero;

public class HeroEquipmentControl {
	
	private AHero owner;

	private Map<Integer,GameEquipmentBean> equipments = new HashMap<Integer,GameEquipmentBean>();
	
	
	
	public HeroEquipmentControl(AHero owner) {
		this.owner = owner;
	}
	

	public AHero getOwner() {
		return owner;
	}

	/**
	 * 穿装备
	 * @param equipmentBean
	 * @return
	 */
	public GameEquipmentBean putEquipmentBean(GameEquipmentBean equipmentBean) {
		
		return null;
	}
	
	/**
	 * 下装备
	 * @param equipmentType
	 * @return
	 */
	public GameEquipmentBean shutDownEquipmentBean(int equipmentType) {
		GameEquipmentBean tempBean = equipments.get(equipmentType);
		equipments.remove(equipmentType);
		return tempBean;
	}
	
	/**
	 * 获取一个装备信息
	 * @param equipmentType
	 * @return
	 */
	public GameEquipmentBean getEquipmentBean(int equipmentType) {
		GameEquipmentBean tempBean = equipments.get(equipmentType);
		return tempBean;
	}
	
}
