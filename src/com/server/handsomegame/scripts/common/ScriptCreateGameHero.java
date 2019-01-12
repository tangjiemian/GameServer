package com.server.handsomegame.scripts.common;

import java.util.UUID;

import com.common.utils.CommonBeanUtils;
import com.server.calendarenet.packet.request.ClientPaket;
import com.server.calendarenet.packet.request.CreateHeroPaket;
import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.heros.GamePlayer;
import com.server.handsomegame.heros.HeroKing;
import com.server.handsomegame.scripts.AScript;

public class ScriptCreateGameHero extends AScript{

	@Override
	public void excute(AHero from) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excute(GamePlayer player, ClientPaket clientPaket) {
		if(CommonBeanUtils.isNull(player)) {
			CreateHeroPaket createHeroPaket = (CreateHeroPaket)clientPaket;
			String orhid = createHeroPaket.getOrhid();
			HeroKing king = new HeroKing();
			king.setId(UUID.randomUUID().toString());
			king.setOrid(orhid);
			king.setKingname(createHeroPaket.getName());
			player.putHeroKing(king);
			player.setCurrentKing(king);
		}
		
		
		
	}

	
	
	
}
