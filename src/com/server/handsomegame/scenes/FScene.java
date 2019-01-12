package com.server.handsomegame.scenes;

import java.util.ArrayList;
import java.util.List;

import com.server.calendarenet.packet.mod2.ActionNode;
import com.server.commonutils.GameFightGroupUtils;
import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.heros.group.FightGroup;

public class FScene {
	
	private FightGroup formGroup ;
	
	private FightGroup targetGroup ;
	
	private List<ActionNode> responsePaketList = new ArrayList<ActionNode>();
	
	
	
	private byte over = 0;
	
	/**
	 * 战斗开始
	 */
	public void startFire() {
		while(over == 0) {
			AHero currentHero = GameFightGroupUtils.getFightCurrentAction(formGroup, targetGroup);
			if(null == currentHero) {
				over = 1;
			}else {
				
				
				
			}
		}
	}
	
	/**
	 * 拼装当前战斗响应数据包
	 * @param gfuck
	 */
	public void putPaketGFuk(ActionNode actionNode) {
		responsePaketList.add(actionNode);
	}

	/**
	 * 获取当前战斗回合响应数据包
	 * @return
	 */
	public List<ActionNode> getPaketList() {
		return responsePaketList;
	}

	
}
