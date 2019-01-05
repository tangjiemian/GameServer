package com.server.game.heros.controls;

import java.util.HashMap;
import java.util.Map;

import com.server.game.beans.EquipmentBean;
import com.server.game.heros.AIHero;

public class HeroEquipmentControl {
	
	private AIHero owner;

	private Map<Integer,EquipmentBean> equipments = new HashMap<Integer,EquipmentBean>();
	
	
	
	public HeroEquipmentControl(AIHero owner) {
		this.owner = owner;
	}
	

	public AIHero getOwner() {
		return owner;
	}

	/**
	 * ��װ��
	 * @param equipmentBean
	 * @return
	 */
	public EquipmentBean putEquipmentBean(EquipmentBean equipmentBean) {
		EquipmentBean tempBean = equipments.get(equipmentBean.getEquipmentType());
		equipments.put(equipmentBean.getEquipmentType(), equipmentBean);
		return tempBean;
	}
	
	/**
	 * ��װ��
	 * @param equipmentType
	 * @return
	 */
	public EquipmentBean shutDownEquipmentBean(int equipmentType) {
		EquipmentBean tempBean = equipments.get(equipmentType);
		equipments.remove(equipmentType);
		return tempBean;
	}
	
	/**
	 * ��ȡһ��װ����Ϣ
	 * @param equipmentType
	 * @return
	 */
	public EquipmentBean getEquipmentBean(int equipmentType) {
		EquipmentBean tempBean = equipments.get(equipmentType);
		return tempBean;
	}
	
}
