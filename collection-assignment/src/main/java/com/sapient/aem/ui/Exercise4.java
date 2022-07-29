package com.sapient.aem.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise4 {
	
	public static int[] modifyArray(int[] a) {
		
		Set<Integer> s = new TreeSet<>();
		for(int i:a) {
			s.add(i);
		}
		int c[]=s.stream().mapToInt((m)->(int)m).toArray();
		return c;	
	}
}
	
	