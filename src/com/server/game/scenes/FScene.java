package com.server.game.scenes;

import java.util.ArrayList;
import java.util.List;

import com.server.game.heros.AIHero;
import com.server.game.heros.group.FightGroup;
import com.server.net.packet.mod2.ActionNode;
import com.server.utils.GameFightGroupUtils;

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
			AIHero currentHero = GameFightGroupUtils.getFightCurrentAction(formGroup, targetGroup);
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
