package com.server.config;

import java.util.List;
import java.util.Map;

/**
 * ���������趨
 * @author pc
 *
 */
class Capacity{
	
	public int leven;
	
	public int enablecounter;
	
	public int enableHeroLeven;	
}

/**
 * ������ֵ�趨
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

	public String id; // ���ܱ��
	
	public String name; //��������
	
	public byte type; //��������
	
	public byte race;//��������
	
	public Map<Integer,Capacity> capacity; //���������趨
	
	public Map<Integer,Values> values; //���ܵȼ����ս����ֵ
	

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
