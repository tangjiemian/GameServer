package com.server.net.packet.mod2;

class Action{
	private String hid;
	private String skillid;
	private String targetid;

	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getSkillid() {
		return skillid;
	}
	public void setSkillid(String skillid) {
		this.skillid = skillid;
	}
	public String getTargetid() {
		return targetid;
	}
	public void setTargetid(String targetid) {
		this.targetid = targetid;
	}
	
	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Action(String hid, String skillid, String targetid) {
		super();
		this.hid = hid;
		this.skillid = skillid;
		this.targetid = targetid;
	}
	@Override
	public String toString() {
		return "Action [hid=" + hid + ", skillid=" + skillid + ", targetid=" + targetid + "]";
	}
}


public class FAction {
	
	private Action heroAction;
	
	private Action babyAction;
	
	public Action getHeroAction() {
		return heroAction;
	}

	public void setHeroAction(Action heroAction) {
		this.heroAction = heroAction;
	}

	public Action getBabyAction() {
		return babyAction;
	}

	public void setBabyAction(Action babyAction) {
		this.babyAction = babyAction;
	}

	public void addHeroAction(String hid,String skillid,String targetid) {
		heroAction = new Action(hid,skillid,targetid);
	}
	
	public void addBabyAction(String hid,String skillid,String targetid) {
		babyAction = new Action(hid,skillid,targetid);
	}

	@Override
	public String toString() {
		return "FAction [heroAction=" + heroAction + ", babyAction=" + babyAction + "]";
	}
	
    
}
