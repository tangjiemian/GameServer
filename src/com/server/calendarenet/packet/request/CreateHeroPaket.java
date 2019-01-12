package com.server.calendarenet.packet.request;

public class CreateHeroPaket extends ClientPaket{

	private String orhid;
	
	private String name;

	public String getOrhid() {
		return orhid;
	}

	public void setOrhid(String orhid) {
		this.orhid = orhid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
