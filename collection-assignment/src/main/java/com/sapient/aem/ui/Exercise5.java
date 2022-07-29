package com.sapient.aem.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	
	public static int[] getSorted(int [] a) {
		
		int sort[] = new int[a.length];
		int index = 0;
		for(Integer num:a) {
			String s = num.toString();
			StringBuilder sb=new StringBuilder(s);
		    String s1=sb.reverse().toString();
			sort[index] = Integer.parseInt(s1);
			index++;
		}
		Arrays.sort(sort);
		return sort;
		
	}
}