package com.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

class Settstuff{
	private int mt; 		//主类型
	private int ct; 		//子类型
	private int nm; 		//数量
	private int star;		//星级
	
	public int getMt() {
		return mt;
	}
	
	public void setMt(int mt) {
		this.mt = mt;
	}
	
	public int getCt() {
		return ct;
	}
	
	public void setCt(int ct) {
		this.ct = ct;
	}
	
	public int getNm() {
		return nm;
	}
	
	public void setNm(int nm) {
		this.nm = nm;
	}
	
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	
	@Override
	public String toString() {
		return "Settstuff [mt=" + mt + ", ct=" + ct + ", nm=" + nm + "]";
	}
	
	
}

public class ZJosnTest {

	public static void main(String[] args) throws Exception {
		String str = "{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}"; 
		String d ="{\r\n" + 
				"  \"1001\":{\r\n" + 
				"    \"stuff\": [{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    }]\r\n" + 
				"  },\r\n" + 
				"  \"1002\":{\r\n" + 
				"    \"stuff\": [{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    }]\r\n" + 
				"  }\r\n" + 
				"}";
		String d2 = "{\r\n" + 
				"  \"1001\":{\r\n" + 
				"     \"1\": [{\r\n" + 
				"       \"mt\": 2,\r\n" + 
				"       \"ct\": 100,\r\n" + 
				"       \"nm\": 10\r\n" + 
				"     },{\r\n" + 
				"       \"mt\": 2,\r\n" + 
				"       \"ct\": 1,\r\n" + 
				"       \"nm\": 10\r\n" + 
				"     },{\r\n" + 
				"       \"mt\": 2,\r\n" + 
				"       \"ct\": 1,\r\n" + 
				"       \"nm\": 10\r\n" + 
				"     }],\r\n" + 
				"    \"2\": [{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    }]\r\n" + 
				"  },\r\n" + 
				"  \"1002\":{\r\n" + 
				"    \"1\": [{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    }],\r\n" + 
				"    \"2\": [{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    },{\r\n" + 
				"      \"mt\": 2,\r\n" + 
				"      \"ct\": 1,\r\n" + 
				"      \"nm\": 10\r\n" + 
				"    }]\r\n" + 
				"  }\r\n" + 
				"}";
		/*
		 * @SuppressWarnings("unchecked") Map<String,Object> maps =(Map<String, Object>)
		 * JSON.parse(d2); System.out.println("这个是用JSON类来解析JSON字符串!!!"); for (Object map
		 * : maps.entrySet()){ System.out.println(((Map.Entry)map).getKey()+"     " +
		 * ((Map.Entry)map).getValue()); }
		 */
		 
		//--------------------------------
		
		FileInputStream in = new FileInputStream("F:\\eclipse-workspace\\GameServer\\sources\\JSON\\EquipmentJson.json");
        Reader reader = new InputStreamReader(in, "UTF-8");
		
		 Type mtype = new TypeToken<Map<String, Map<String,List<Settstuff>>>>() {}.getType();
		 Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		 
		 Map<String, Map<String,List<Settstuff>>> retMap = gson.fromJson(reader, mtype);
		 
		 //Map<String, Map<String,List<Settstuff>>> retMap = gson.fromJson(d2, mtype);
		 Map<String,List<Settstuff>> innerMap = retMap.get("1001");
		 
		 List<Settstuff> list = innerMap.get("1");
		 System.out.println(list.get(0).getCt());
		 System.out.println(list);
		 
		 for (Map.Entry<String,Map<String,List<Settstuff>>> obj : retMap.entrySet()) {
			 System.out.println("key ==" + obj.getKey() + " , " + "value==" + obj.getValue());
		 }
	}
	
}
