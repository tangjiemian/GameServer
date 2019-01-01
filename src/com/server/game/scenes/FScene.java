package com.server.game.scenes;

import java.util.ArrayList;
import java.util.List;

import com.server.game.heros.AIHero;
import com.server.game.heros.group.FGroup;
import com.server.net.packet.mod2.GFuck;
import com.server.utils.FightUtils;

public class FScene {
	
	private FGroup formGroup ;
	
	private FGroup targetGroup ;
	
	private List<GFuck> paketList = new ArrayList<GFuck>();
	
	private byte over = 0;
	
	/**
	 * 战斗开始
	 */
	public void startFire() {
		while(over == 0) {
			AIHero currentHero = FightUtils.FGROUPUTILS.getFightCurrentAction(formGroup, targetGroup);
			if(null == currentHero) {
				over = 1;
			}else {
				currentHero.getHeroControl().useSkill();
			}
		}
	}
	
	/**
	 * 拼装当前战斗响应数据包
	 * @param gfuck
	 */
	public void putPaketGFuk(GFuck gfuck) {
		paketList.add(gfuck);
	}

	/**
	 * 获取当前战斗回合响应数据包
	 * @return
	 */
	public List<GFuck> getPaketList() {
		return paketList;
	}

	
}
