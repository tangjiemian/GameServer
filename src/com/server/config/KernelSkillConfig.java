package com.server.config;

import java.util.List;
import java.util.Map;

/**
 * 技能升级设定
 * @author pc
 *
 */
class Capacity{
	
	public int leven;
	
	public int enablecounter;
	
	public int enableHeroLeven;	
}

/**
 * 技能数值设定
 * @author pc
 *
 */
class Values{
	
	public int leven;
	
	public int value;
	
	public int target;
	
	public int keep;
}



public class KernelSkillConfig {

	public String id; // 技能编号
	
	public String name; //技能名称
	
	public byte type; //技能类型
	
	public byte race;//技能种族
	
	public Map<Integer,Capacity> capacity; //技能升级设定
	
	public Map<Integer,Values> values; //技能等级配对战斗数值
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public byte getRace() {
		return race;
	}

	public void setRace(byte race) {
		this.race = race;
	}

	public Map<Integer, Capacity> getCapacity() {
		return capacity;
	}

	public void setCapacity(Map<Integer, Capacity> capacity) {
		this.capacity = capacity;
	}

	public Map<Integer, Values> getValues() {
		return values;
	}

	public void setValues(Map<Integer, Values> values) {
		this.values = values;
	}
	
	
	

}
