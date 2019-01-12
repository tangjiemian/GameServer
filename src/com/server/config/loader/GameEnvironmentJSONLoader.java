package com.server.config.loader;

import java.util.Map;

import com.common.beans.EMagic;
import com.common.beans.ENpc;
import com.common.beans.ERace;
import com.common.beans.EScene;
import com.common.utils.GsonLoaderJsonUtil;
import com.google.gson.reflect.TypeToken;
import com.server.handsomegame.GameEnvironmentContent;

public class GameEnvironmentJSONLoader {


	//	https://www.oschina.net/p/grpc-swagger

	/**
	 * ����ϵͳ����
	 */
	public static void loaderSysScene() {
		GameEnvironmentContent.eSceneSett = GsonLoaderJsonUtil.<EScene>loaderJsonToMap(new TypeToken<Map<String, EScene>>() {}.getType(),"EScene.json");
		System.out.println(GameEnvironmentContent.eSceneSett.get("100").getId());
	}
	
	/**
	 * ����ϵͳ����
	 */
	public static void loaderSysRace() {
		GameEnvironmentContent.eRaceSett = GsonLoaderJsonUtil.<ERace>loaderJsonToMap(new TypeToken<Map<String, ERace>>() {}.getType(),"ERace.json");
		System.out.println(GameEnvironmentContent.eRaceSett.get("1001").getRaceid());
	}
	
	/**
	 * ����ϵͳNpc
	 */
	public static void loaderSysNpc() {
		GameEnvironmentContent.eNpcSett = GsonLoaderJsonUtil.<ENpc>loaderJsonToMap(new TypeToken<Map<String, ENpc>>() {}.getType(),"ENpc.json");
		System.out.println(GameEnvironmentContent.eNpcSett.get("NPC1001").getName());
	}


	/**
	 * ����ϵͳ����
	 */
	public static void loaderSysMagic() {
		GameEnvironmentContent.eEMagicSett = GsonLoaderJsonUtil.<EMagic>loaderJsonToMap(new TypeToken<Map<String, EMagic>>() {}.getType(),"EMagic.json");
		System.out.println(GameEnvironmentContent.eEMagicSett.get("MC1001").getName());
		
		
	}

	
	/**
	 * ����װ��ǿ������
	 */
	public static void loaderEquipmentPromoteSett() {

	}

	/**
	 * ���ؼ���ǿ������
	 */
	public static void loaderSkillPromoteSett() {

	}
	
	
	public static void main(String[] args) {
		//loaderSysRace();
		loaderSysScene();
		loaderSysNpc();
		loaderSysMagic();

	}

}
