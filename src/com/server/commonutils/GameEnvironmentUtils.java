package com.server.commonutils;

import java.util.Map;

import com.server.config.provider.GameNSceneKernelProvider;
import com.server.handsomegame.scenes.NScene;

public class GameEnvironmentUtils {

	/**
	 * 初始化世界场景npc数据
	 * @param nScenes
	 * @param nSceneConfig
	 */
	public  static void setInitNScene(Map<String,NScene> nScenes,GameNSceneKernelProvider nSceneConfig) {
		
	}
	
	public static void updateNScene(Map<String,NScene> nScenes,GameNSceneKernelProvider nSceneConfig) {
		
	}
	
	public static void removeNScene(Map<String,NScene> nScenes,GameNSceneKernelProvider nSceneConfig) {
		
	}
	
	public static NScene getOneNScene(Map<String,NScene> nScenes,String nsceneid) {
		
		return nScenes.get(nsceneid);
	}
	
}
