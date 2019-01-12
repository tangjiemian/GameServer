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

	public static Map<String, EScene> eSceneSett = new HashMap<String, EScene>();//ע��ϵͳ����
	
	public static Map<String, ERace> eRaceSett = new HashMap<String, ERace>();//ע��ϵͳ��ɫ����
	
	
	public static Map<String, ENpc> eNpcSett = new HashMap<String, ENpc>();//ע��ϵͳNpc
	
	public static Map<String, EMagic> eEMagicSett = new HashMap<String, EMagic>();//ע��ϵͳħ��
	
	public static Map<String, EQuipment> eQuipmentSett = new HashMap<String, EQuipment>();//ע��ϵͳ������װ��
	
	
	
	public static Map<String,GamePlayer>  onLineGamePlayer = new ConcurrentHashMap<String,GamePlayer>();
	
	
	public static Map<Class,AScript>  gameScripts = new ConcurrentHashMap<Class,AScript>();
	
	
	//ע��ϵͳ����
	
	//ע��ϵͳ����ֲ�
	
	
	//ע��ϵͳ������װ������
	
	
	//ע��ϵͳ��������
	
	
	//ע��ϵͳװ����������
	
	//ע��ϵͳװ���ϳ�����
	
	//ע��ϵͳװ��ǿ������
	
	//ע��ϵͳNPC�ֲ�
	
	

	
	
}
