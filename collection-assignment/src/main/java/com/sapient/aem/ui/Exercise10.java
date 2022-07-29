package com.sapient.aem.ui;

import java.util.Arrays;

public class Exercise10 {
	
	public static int[] sortArray(int a[]) {
		
		int n = a.length;
		int t[]=new int[n+1];
		for(int i=0;i<n;i++) {
			t[i] = a[i];
		}
		Arrays.sort(t);
		return t;
	}
}
