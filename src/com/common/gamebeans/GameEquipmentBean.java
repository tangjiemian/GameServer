package com.common.gamebeans;

import com.common.beans.EQuipment;

public class GameEquipmentBean extends EQuipment {

	private String id;
	
	private String playerid;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlayerid() {
		return playerid;
	}

	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}

	public void setValueByEQuipment(EQuipment eQuipment) {
		this.setOriginid(eQuipment.getOriginid());
	}
	

	
	
	
}
