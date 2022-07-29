package com.sapient.aem.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
	
    public static char[] mergeData(List<Character> c1,List<Character> c2) {
    	
    	List<Character> a1=new ArrayList<>();
    	List<Character> a2=new ArrayList<>();
    	a1.addAll(a2);
    	Collections.sort(a1);
    	char[] chars = a1.toString().toCharArray();
    	return chars;
    	
    }
}