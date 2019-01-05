package com.server.game.scripts;

import java.util.HashMap;
import java.util.Map;

import com.server.game.scenes.FScene;

public class SkillScriptDispatch {
	
	private static Map<String,AIScript> scripts   = new HashMap<String,AIScript>();

	public static Map<String, AIScript> getScripts() {
		return scripts;
	}
	
	
	public static void dispatch() {
		
		
	}

}
