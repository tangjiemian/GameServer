package com.server.handsomegame.scripts.common;

import com.server.calendarenet.packet.request.FuckPaket;
import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.heros.group.GameFight;
import com.server.handsomegame.scripts.AScript;

public class ScriptCommonFight extends AScript{
	
	public void excute(AHero fromHero) {
		FuckPaket fuckPaket = fromHero.getHeroFightControl().getFuckPaket(); //取攻击包
		AHero target = fromHero.getHeroGameSceneControl().getnScene().getHeroKing(fuckPaket.getTargetid()); //取当前场景攻击对象
		if(null != target) {
			GameFight gameFight = new GameFight();
			fromHero.getHeroFightControl().fuckTarget(gameFight);
			target.getHeroFightControl().forceFuckTarget(gameFight);
		}
	}


}
