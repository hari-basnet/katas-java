package com.java;

public class NeedleInHaystack {
	
	public static String findNeedle(Object[] haystack) {
		
		for(int i = 0; i < haystack.length; i++) {
			if(haystack[i] == "needle") {
				return "found the needle at position " + i;
			}
		}
		return "not found";
	}
	
	// alternate better solutions
	
	public static String findNeedle2(Object[] haystack) {
		return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
	}

}
