package com.server.net.packet.mod2;

import java.util.ArrayList;
import java.util.List;

public class ActionNode {
	
	private List<Fuck> fuckList;
	
	public void addFuck(Fuck fuck) {
		if(null == fuckList) {
			fuckList = new ArrayList<Fuck>();
		}
		fuckList.add(fuck);
	}
}
