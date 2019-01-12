package com.server.calendarenet.packet.mod2;

import java.util.ArrayList;
import java.util.List;

public class Fuck {
	
	public String hid = "0";
	
	public String sid = "0";
	
	public List<Target> tList;
	
	
	public void addAction(String __hid,String __sid,Target __target) {
		this.hid = __hid;
		this.sid = __sid;
		if(null != __target) {
			if(null == tList) {
				tList = new ArrayList<Target>();
			}
			tList.add(__target);
		}
	}

	public void addAction(String __hid,String __sid,List<Target> __tList) {
		this.hid = __hid;
		this.sid = __sid;
		if(null != __tList && __tList.size()>0) {
			tList = __tList;
		}
	}
}
