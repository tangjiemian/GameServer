package com.common.factory;

import java.util.ArrayList;
import java.util.List;

import com.common.beans.EQuipment;
import com.common.gamebeans.GameEquipmentBean;
import com.server.handsomegame.GameEnvironmentContent;

public class GameEquipmentProduction {
	
	/*
	 * public static EQuipment productionOne(String original) { EQuipment eQuipment
	 * = null; if(GameEnvironmentContent.eQuipmentSett.containsKey(original)) {
	 * eQuipment = GameEnvironmentContent.eQuipmentSett.get(original); //beanCopy
	 * 
	 * 
	 * } return eQuipment; }
	 * 
	 * public static List<EQuipment> productionMore(String original) {
	 * if(GameEnvironmentContent.eQuipmentSett.containsKey(original)) {
	 * 
	 * }
	 * 
	 * return null; }
	 */
	
	
	
	public static GameEquipmentBean productionGameEquipmentBeanSimpleOne(String original,String ownerPlayerid) {
		GameEquipmentBean gameEquipmentBean = null;
		if(GameEnvironmentContent.eQuipmentSett.containsKey(original)) {
			EQuipment eQuipment = GameEnvironmentContent.eQuipmentSett.get(original);
			gameEquipmentBean = new GameEquipmentBean();
			gameEquipmentBean.setValueByEQuipment(eQuipment);
			if(null != ownerPlayerid) {
				gameEquipmentBean.setPlayerid(ownerPlayerid);
			}
		}
		return gameEquipmentBean;
	}
	
	/**
	 * 生产多个简单属性道具
	 * @param original
	 * @param number
	 * @param ownerPlayerid
	 * @return
	 */
	public static List<GameEquipmentBean> productionSimpleMore(String original,int number,String ownerPlayerid) {
		List<GameEquipmentBean> list = null;
		if(GameEnvironmentContent.eQuipmentSett.containsKey(original)) {
			list = new ArrayList<GameEquipmentBean>();
			GameEquipmentBean gameEquipmentBean = null;
			for(int i =0;i<number;i++) {
				EQuipment eQuipment = GameEnvironmentContent.eQuipmentSett.get(original);
				gameEquipmentBean = new GameEquipmentBean();
				gameEquipmentBean.setValueByEQuipment(eQuipment);
				if(null != ownerPlayerid) {
					gameEquipmentBean.setPlayerid(ownerPlayerid);
				}
				list.add(gameEquipmentBean);
			}
		}
		return list;
	}
	
	/**
	 * 数据源获取一个道具实例
	 * @param original
	 * @return
	 */
	public static EQuipment getGameEnvironmentContentEQuipmentSettOne(String original) {
		EQuipment eQuipment = null;
		if(GameEnvironmentContent.eQuipmentSett.containsKey(original)) {
			eQuipment = GameEnvironmentContent.eQuipmentSett.get(original);
		}
		return eQuipment;
	}
	
	
	
	

}
