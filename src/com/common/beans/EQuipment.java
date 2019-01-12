package com.common.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * 装备类型道具
 * @author pc
 *
 */
public class EQuipment extends EQuality{
	
	private String originid; 	//源编号
	private String name; 		//名称
	private int mt; 		//主类型
	private int ct; 		//子类
	private int number = 1;
	private int stick; 			//应用类型
	private byte group = 0;
	//<><><><><>装备条件<><><><><>
	private int onlifye; 
	private int onleva;
	private int ondevlifye; 
	private int ondevleva; 
	private int onhp0;
	private int onmp0;
	private int onap0;
	private int onsp0; 
	//***************装备位置******************
	
	//<><><><><>装备技能 <><><><><>
	private Map<String,EMagic>  magic = new HashMap<String,EMagic>();
	
	public String getOriginid() {
		return originid;
	}
	public void setOriginid(String originid) {
		this.originid = originid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
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
	public byte getGroup() {
		return group;
	}
	public void setGroup(byte group) {
		this.group = group;
	}
	
	
	
}
