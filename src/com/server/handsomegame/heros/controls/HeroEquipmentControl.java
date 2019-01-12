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
	 * ��װ��
	 * @param equipmentBean
	 * @return
	 */
	public GameEquipmentBean putEquipmentBean(GameEquipmentBean equipmentBean) {
		
		return null;
	}
	
	/**
	 * ��װ��
	 * @param equipmentType
	 * @return
	 */
	public GameEquipmentBean shutDownEquipmentBean(int equipmentType) {
		GameEquipmentBean tempBean = equipments.get(equipmentType);
		equipments.remove(equipmentType);
		return tempBean;
	}
	
	/**
	 * ��ȡһ��װ����Ϣ
	 * @param equipmentType
	 * @return
	 */
	public GameEquipmentBean getEquipmentBean(int equipmentType) {
		GameEquipmentBean tempBean = equipments.get(equipmentType);
		return tempBean;
	}
	
}
