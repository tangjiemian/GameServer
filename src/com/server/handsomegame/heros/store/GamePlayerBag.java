package com.server.handsomegame.heros.store;

import java.util.ArrayList;
import java.util.List;

import com.common.beans.EQuipment;
import com.common.gamebeans.GameEquipmentBean;
import com.server.handsomegame.GameEnvironmentContent;

public class GamePlayerBag {

	private static final int groupSize = 99;
	
	private int thisListSize = 0;

	private List<GameEquipmentBean> bagList = new ArrayList<GameEquipmentBean>();

	public GamePlayerBag() {
		this(50);
	}

	public GamePlayerBag(int size) {
		this.thisListSize = size;
		for (int i = 0; i < thisListSize; i++) {
			bagList.add(null);
		}
	}

	public void addChild(GameEquipmentBean bean, int number) {
			
	}
	
	public void addChild(String original, int number) {
		EQuipment eQuipment = GameEnvironmentContent.eQuipmentSett.get(original);
		if(eQuipment.getGroup() == 0) {
			
		}else if(eQuipment.getGroup() == 0) {
			int n =  0;
			for(GameEquipmentBean bean:bagList) {
				if(null != bean) {
					if(bean.getOriginid().equals(original)) {
						n = bean.getNumber();
						
						if(groupSize - n >= number) {
							bean.setNumber(number);
						}
					}
				}
			}
		}else {}
		
	}
	
	

	public void remove(String id, int number) {

	}

	public void delete(String id, int number) {

	}

	public void move(String id, int targetIndex) {

	}

	public void remove(GameEquipmentBean bean, int number) {

	}
}
