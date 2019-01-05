package com.server.config;

import java.util.Map;

class Npc {
	//	{"id":"npc_id_01","name":"����","x":100,"y":200,"scriptId":"script_npc_id_001"},
	public String id;
	
	public String name;
	
	public String x;
	
	public String y;
	
	public String scriptId;
	
}

public class KernelSceneConfig {

	/**
	 * "id":"n_id_01",
		"name":"�������",
		"npcList":[
			{"id":"npc_id_01","name":"����","x":100,"y":200,"scriptId":"script_npc_id_001"},
			{"id":"npc_id_02","name":"����","x":100,"y":200,"scriptId":"script_npc_id_001"},
			{"id":"npc_id_03","name":"����","x":100,"y":200,"scriptId":"script_npc_id_001"},
		]
	 * 
	 */
	
	public String id;
	
	public String name;
	
	public Map<String,Npc> npcList;
	
	
}
