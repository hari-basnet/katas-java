package com.java;

public class ReplaceVowels {
	
	public static String filterVowels(String s){
		
		return s.replaceAll("(?i)[aeiou]", "");
	}
}
