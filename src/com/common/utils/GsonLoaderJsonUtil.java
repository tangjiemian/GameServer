package com.common.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonLoaderJsonUtil <T extends Object>{

	
	public static <T> ArrayList<T> asList(T... a) {
        ArrayList<T> arrLt = new ArrayList<>();
        for(T t : a) {
            arrLt.add(t);
        }
        return arrLt;
		//ArrayList<String> arrLt = GsonLoaderJsonUtil.<String>asList("B", "X", "A", "M", "F", "W", "O");
		//System.out.println(arrLt);
    }

	 /**
	  * Ω‚ŒˆMap<String,T>
	  * @param mtype
	  * @param filename
	  * @return
	  */
	 public static  <T extends Object> Map<String, T> loaderJsonToMap(Type mtype,String filename) {
		 FileInputStream in = null;
			Reader reader = null;
			Map<String, T> retMap = null;
			try {
				in = new FileInputStream(CommonFileUtils.getJSONSourcePath(filename));
				reader = new InputStreamReader(in, "UTF-8");
				Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
				retMap = gson.fromJson(reader, mtype);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(null != in) {
						in.close();
						in = null;
					}
					if(null != reader) {
						reader.close();
						reader = null;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return retMap;
	}
	
	
	 public static  <T extends Object> Map<String,Map<String, T>> loaderJsonToMapLinkMap(Type mtype,String filename) {
		 FileInputStream in = null;
			Reader reader = null;
			Map<String, Map<String, T>> retMap = null;
			try {
				in = new FileInputStream(CommonFileUtils.getJSONSourcePath(filename));
				reader = new InputStreamReader(in, "UTF-8");
				Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
				retMap = gson.fromJson(reader, mtype);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(null != in) {
						in.close();
						in = null;
					}
					if(null != reader) {
						reader.close();
						reader = null;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return retMap;
	}
	
}
