package com.server.calendarenet.packet.request;

public class FuckPaket extends ClientPaket{

	private String magicid;
	
	private String goodid;
	
	private String targetid;



	public String getMagicid() {
		return magicid;
	}

	public void setMagicid(String magicid) {
		this.magicid = magicid;
	}

	public String getGoodid() {
		return goodid;
	}

	public void setGoodid(String goodid) {
		this.goodid = goodid;
	}

	public String getTargetid() {
		return targetid;
	}

	public void setTargetid(String targetid) {
		this.targetid = targetid;
	}
	
	
	
}
