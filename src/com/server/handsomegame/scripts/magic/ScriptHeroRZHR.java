package com.server.handsomegame.scripts.magic;

import com.common.gamebeans.GameHeroMagicBean;
import com.server.calendarenet.packet.request.FuckPaket;
import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.scripts.AScript;

public class ScriptHeroRZHR extends AScript{

	
	public void useMagic(AHero from) {
		//���ܻ�������
		
		FuckPaket fuckPaket = from.getHeroFightControl().getFuckPaket();
		
		GameHeroMagicBean gameHeroMagicBean = from.getHeroMagicControl().getHeroEMagic(fuckPaket.getMagicid());
		
		
		gameHeroMagicBean.getMagicid();
		
	
		//ͳ��װ���Ըü��ܵļ�ǿ
		
		//��ȡĿ������
		
		//
	}

	@Override
	public void excute(AHero from) {
		// TODO Auto-generated method stub
		
	}
	
}
