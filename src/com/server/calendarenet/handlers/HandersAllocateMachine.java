package com.server.calendarenet.handlers;

import java.util.HashMap;
import java.util.Map;

import com.server.calendarenet.handlers.interf.Hander;
import com.server.calendarenet.packet.request.ClientPaket;

public class HandersAllocateMachine {
	
	private static Map<String,Hander>  handers = new HashMap<String,Hander>();
	
	/**
	 * 数据包处理调度
	 * @param paket
	 */
	public static void dispatch(ClientPaket paket) {
		Hander hander = handers.get(paket.paketid);
		if(null != hander) {
			hander.chanelHanderProcessor();
		}
	}
	
	
	public static void putHander(String key,Hander hander) {
		handers.put(key, hander);
	}
	
	
	public static void removeHander(String key) {
		handers.remove(key);
	}
	
}
