package com.sapient.aem.ui;

import java.util.HashMap;
import java.util.Map;

public class Exercise6 {
	
	public HashMap<String,String> getStatesAsMap(String a[]){
		Map<String,String> hm = new HashMap<String,String>();
		for(String s:a) {
			hm.put(s.substring(0,3).toUpperCase(), s);
		}
		return  (HashMap<String, String>) hm;
	}

}
