package com.server.net.packet.mod2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class Test {
	
	public static void main(String[] args) {
		
		Fuck fk = new Fuck();
		
		fk.addAction("A001", "B0002", new Target());
		
		String json = JSON.toJSONString(fk);
		
		System.out.println(json);
		
		
		FAction faction = new FAction();
	
		faction.addHeroAction("001", "s00333", "t003");
		faction.addBabyAction("bb001", "bs00333", "bt003");
		
		String json2 = JSON.toJSONString(faction);
		System.out.println(json2);
		
		//String jstr = "{\"heroAction\":{\"hid\":\"001\",\"skillid\":\"s002\",\"targetid\":\"t003\"}}";
		
		FAction a = JSON.parseObject(json2,  new TypeReference<FAction>() {});
		
		System.out.println(a);
		
		
	}

}
