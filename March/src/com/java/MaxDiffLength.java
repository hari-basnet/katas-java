package com.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaxDiffLength {
	
	public static int findDifferenceOfTwoString(String[] a1, String[] a2){
		
		if (a1.length < 1 || a2.length < 1) {
			return -1;
		}
		
		String s1 = Arrays.stream(a1).collect(Collectors.joining());
		String s2 = Arrays.stream(a2).collect(Collectors.joining());
		
		return s1.length() - s2.length();
	}
	
}
