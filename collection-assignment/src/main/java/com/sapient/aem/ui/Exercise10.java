package com.sapient.aem.ui;

import java.util.Arrays;

public class Exercise10 {
	
	public static int[] sortArray(int a[]) {
		
		int n = a.length;
		int t[]=new int[n+1];
		for(int i=0;i<n;i++) {
			t[i] = a[i];
		}
		return t;
	}
	
	public static int getMax(int a[]) {
		
		int n = a.length;
		Arrays.sort(a);
		return a[n-1];
		
	}
}
