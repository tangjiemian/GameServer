package com.server.handsomegame.scripts;

import com.server.calendarenet.packet.request.ClientPaket;
import com.server.calendarenet.packet.request.FuckPaket;
import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.heros.GamePlayer;

public abstract class AScript {
	
	public void packetValidatorLinkDispatch(AHero from) {
		FuckPaket fuckPaket = from.getHeroFightControl().getFuckPaket();
		if(fuckPaket.getMagicid() == "道具") {
			useMagicProp(from);
		}else {
			userMaigc(from);
		}
	}
	
	public void userMaigc(AHero from) {
		
	}
	
	public  void  excute(AHero from) {};
	
	public abstract void  excute(GamePlayer gamePlayer,ClientPaket clientPaket);
	
	/**
	 * 使用道具
	 * @param from
	 */
	public void useMagicProp(AHero from) {
		FuckPaket fuckPaket = from.getHeroFightControl().getFuckPaket();
		
	}

}
