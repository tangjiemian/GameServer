package com.server.commonutils;

import java.util.Map;

import com.server.config.provider.GameNSceneKernelProvider;
import com.server.handsomegame.scenes.NScene;

public class GameEnvironmentUtils {

	/**
	 * ��ʼ�����糡��npc����
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
