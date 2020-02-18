package com.java;

public class FindVowels {
	
	public static int getCount(String str) {
		int vowelsCount = 0;
		// your code here
		vowelsCount = str.replaceAll("(?i)[^aeiou]", "").length();
		return vowelsCount;
	}
	
	public static int getCountUsingForLoop(String str) {
		int vowelsCount = 0;
		
		for(char c : str.toCharArray())
			vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
		
		return vowelsCount;
	}
	
	public static int getCountUsingFilter(String str) {
		return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
	}
	
	public static int getCountUsingForAndSwitch(String str) {
		int vowelsCount = 0;
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowelsCount++;
			}
		}
		return vowelsCount;
	}
}
