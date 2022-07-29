package com.sapient.aem.ui;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise9 {
	
	public HashMap<String,Integer> wordCount(ArrayList<String> a){
		

		HashMap<String,Integer> hm=new HashMap<>(); 
		String[] s1=new String[a.size()];
		for(int i=0;i<a.size();i++) {
			s1[i]=a.get(i);
		}
		for(int i=0;i<s1.length;i++) {
			if(hm.containsKey(s1[i])) {
				int count=hm.get(s1[i]);
				hm.put(s1[i], count+1);
			}
			else {
				hm.put(s1[i], 1);
			}
		}
		return hm;
	}
}

