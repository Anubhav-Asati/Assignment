package com.sapient.aem.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Exercise3 {
	
	public List checkPerfectCouple(Map<Integer,String> map) {
		List l = new ArrayList<>();
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			String s[] = m.getValue().split("-");
			char[] first = s[0].toCharArray();
			char[] second = s[1].toCharArray();
			Arrays.sort(first);
			Arrays.sort(second);
			if(Arrays.equals(first, second)) l.add(m.getKey());
		}
		return l;
	}
	
	
	

}
