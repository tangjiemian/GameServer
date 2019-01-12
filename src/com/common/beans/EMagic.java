package com.common.beans;

public class EMagic {
	
	private String id; 			//技能编号
	
	private String name;		//魔法名称
	
	private byte type; 			//技能类型
	
	private int studyT; 		//学习种族
	
	private int valueN; 		//基础数值
	
	private int targetT; 		//目标类型
	
	private int targetN; 		//目标数量
	
	private int continualN; 	//持续回合数
	
	private String script;

	
	

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

	public int getStudyT() {
		return studyT;
	}

	public void setStudyT(int studyT) {
		this.studyT = studyT;
	}

	public int getValueN() {
		return valueN;
	}

	public void setValueN(int valueN) {
		this.valueN = valueN;
	}

	public int getTargetT() {
		return targetT;
	}

	public void setTargetT(int targetT) {
		this.targetT = targetT;
	}

	public int getTargetN() {
		return targetN;
	}

	public void setTargetN(int targetN) {
		this.targetN = targetN;
	}

	public int getContinualN() {
		return continualN;
	}

	public void setContinualN(int continualN) {
		this.continualN = continualN;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}
	
	
}
