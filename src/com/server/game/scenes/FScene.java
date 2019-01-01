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
	 * ս����ʼ
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
	 * ƴװ��ǰս����Ӧ���ݰ�
	 * @param gfuck
	 */
	public void putPaketGFuk(GFuck gfuck) {
		paketList.add(gfuck);
	}

	/**
	 * ��ȡ��ǰս���غ���Ӧ���ݰ�
	 * @return
	 */
	public List<GFuck> getPaketList() {
		return paketList;
	}

	
}
