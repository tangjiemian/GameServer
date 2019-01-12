package com.server.handsomegame.scripts.magic;

import com.common.gamebeans.GameHeroMagicBean;
import com.server.calendarenet.packet.request.FuckPaket;
import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.scripts.AScript;

public class ScriptHeroRZHR extends AScript{

	
	public void useMagic(AHero from) {
		//技能基础属性
		
		FuckPaket fuckPaket = from.getHeroFightControl().getFuckPaket();
		
		GameHeroMagicBean gameHeroMagicBean = from.getHeroMagicControl().getHeroEMagic(fuckPaket.getMagicid());
		
		
		gameHeroMagicBean.getMagicid();
		
	
		//统计装备对该技能的加强
		
		//获取目标数组
		
		//
	}

	@Override
	public void excute(AHero from) {
		// TODO Auto-generated method stub
		
	}
	
}
