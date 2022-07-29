package com.sapient.aem.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise7 {
	
	public static String[] getKeys(HashMap<String,String> hm,String s1){
		
		
		List<String> l1=new ArrayList<>();
		for(Map.Entry<String,String> m1:hm.entrySet()) {
			if(m1.getValue().equals(s1)) {
				l1.add(m1.getKey());
			}
			
		}
		String[] st=new String[l1.size()];
		for(int i=0;i<l1.size();i++) {
			st[i]=l1.get(i);
		}
		return st;
	}
	
	public static void main(String[] args) {
		
		HashMap<String,String> hm=new HashMap<>();
		hm.put("ram", "hari");
		hm.put("cisco", "barfi");
		hm.put("honeywell", "cs");
		hm.put("cts", "hari");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String[] arr=getKeys(hm,st);
		Arrays.stream(arr).forEach(System.out::println);
	
		
	}
}
