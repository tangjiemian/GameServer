package com.server.game;

import com.feature.utils.ReadExcelUitl;

public class GameEnvironmentLoader {
	
	
	public static void loader() {
		loaderGameHeroSetting();
		loaderGameSkillSetting();
	}
	
	public static void loaderGameHeroSetting() {
		GameEnvironment.gameHeroSetting = 	new ReadExcelUitl("excel","1111.xls").init().indexSheet(0).getRowsCellsForMap();
		
	}
	
	public static void loaderGameSkillSetting() {
		GameEnvironment.gameSkillSetting = 	new ReadExcelUitl("excel","1111.xls").init().indexSheet(3).getRowsCellsForMap();
	}

}
