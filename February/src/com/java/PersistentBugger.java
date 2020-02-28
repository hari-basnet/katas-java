package com.java;

public class PersistentBugger {
	
	public static int findCount(long n){
			int times = 0;
			while (n > 9) {
				n = (n + "").chars().reduce(1, (a, b) -> a * (b - 48));
				times++;
			}
			return times;
		}
	}
