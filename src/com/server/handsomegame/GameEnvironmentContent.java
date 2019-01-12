package com.server.handsomegame;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.common.beans.EMagic;
import com.common.beans.ENpc;
import com.common.beans.EQuipment;
import com.common.beans.ERace;
import com.common.beans.EScene;
import com.server.handsomegame.heros.GamePlayer;
import com.server.handsomegame.scripts.AScript;

public class GameEnvironmentContent {
	
	public static Map<Integer,Map<String,Object>> gameHeroSetting = new HashMap<Integer,Map<String,Object>>();
	
	public static Map<Integer,Map<String,Object>> gameSkillSetting = new HashMap<Integer,Map<String,Object>>();

	public static Map<String, EScene> eSceneSett = new HashMap<String, EScene>();//注册系统场景
	
	public static Map<String, ERace> eRaceSett = new HashMap<String, ERace>();//注册系统角色种族
	
	
	public static Map<String, ENpc> eNpcSett = new HashMap<String, ENpc>();//注册系统Npc
	
	public static Map<String, EMagic> eEMagicSett = new HashMap<String, EMagic>();//注册系统魔法
	
	public static Map<String, EQuipment> eQuipmentSett = new HashMap<String, EQuipment>();//注册系统道具与装备
	
	
	
	public static Map<String,GamePlayer>  onLineGamePlayer = new ConcurrentHashMap<String,GamePlayer>();
	
	
	public static Map<Class,AScript>  gameScripts = new ConcurrentHashMap<Class,AScript>();
	
	
	//注册系统怪物
	
	//注册系统怪物分布
	
	
	//注册系统道具与装备数据
	
	
	//注册系统技能数据
	
	
	//注册系统装备煅造设置
	
	//注册系统装备合成设置
	
	//注册系统装备强化设置
	
	//注册系统NPC分布
	
	

	
	
}
