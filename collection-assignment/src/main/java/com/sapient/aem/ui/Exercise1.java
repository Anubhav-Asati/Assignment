package com.sapient.aem.ui;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
	
	public static List<String> modifyElement(List<String> a,String s) {
		if(s.contains(s)) {
			int index=a.indexOf(s);
			String element = a.get(index);
			a.set(index, s.substring(0,element.length()/2+1).toUpperCase());	
		}
		return a;
	}
}