package com.server.handsomegame.heros.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.common.gamebeans.GameEquipmentBean;

public class GamePalerStore {

	public static final int pageSize = 5;
	
	public static final int size = 50;
	
	private Map<Integer,List<GameEquipmentBean>> storeMap  = new HashMap<Integer,List<GameEquipmentBean>>();
	
	public GamePalerStore(int pageSize) {
		for(int p =0;p<pageSize;p++) {
			List<GameEquipmentBean> list = new ArrayList<GameEquipmentBean>();
			for(int i =0;i<size;i++) {
				list.add(null);
			}
			storeMap.put(p, list);
		}
	}
	
	public void put(GameEquipmentBean bean,int number) {
		
	}
	
	public void remove(String id,int number) {
		
	}
	
	public void delete(String id,int number) {
		
	}
	
	public void move(String id,int targetIndex) {
		
	}
	
	
	public void remove(GameEquipmentBean bean,int number) {
		
	}
	
	public void delete(GameEquipmentBean bean,int number) {
		
	}
	
	
	
}
