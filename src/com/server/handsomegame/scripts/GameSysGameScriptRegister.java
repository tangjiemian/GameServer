package com.server.handsomegame.scripts;

import com.server.handsomegame.GameEnvironmentContent;
import com.server.handsomegame.scripts.common.ScriptCommonFight;
import com.server.handsomegame.scripts.common.ScriptCreateGameHero;

public class GameSysGameScriptRegister {
	
	public  static void loaderScript() {
		
		GameEnvironmentContent.gameScripts.put(ScriptCommonFight.class, new ScriptCommonFight());
		
		
		GameEnvironmentContent.gameScripts.put(ScriptCreateGameHero.class, new ScriptCreateGameHero());
		
		
	}
	

}
