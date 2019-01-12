package com.server;

import com.server.calendarenet.packet.request.ClientPaket;
import com.server.config.loader.GameEnvironmentJSONLoader;
import com.server.handsomegame.scripts.GameSysGameScriptRegister;

public class GamServerStart {
	
	public static void main(String[] args) {
		
		
		GameEnvironmentJSONLoader.loaderSysScene();
		GameEnvironmentJSONLoader.loaderSysRace();
		GameEnvironmentJSONLoader.loaderSysNpc();
		GameEnvironmentJSONLoader.loaderSysMagic();
		GameSysGameScriptRegister.loaderScript();
		
		
		ClientPaket clientPaket = new ClientPaket();
		clientPaket.heroid = "1000";
		
		
	}

}
