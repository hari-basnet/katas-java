package com.java;

public class PlayWithNumbers {
	
	public static long digPow(int n, int p) {
		// your code
		long temp = 0;
		String[] value = String.valueOf(n).split("");
		
		// power of the each digits and their sum and store to the temp
		for (int i = 0; i < value.length; i++) {
			temp += Math.pow(Double.parseDouble(value[i]), (p + i));
		}
		return temp % n == 0 ? temp / n : -1;
	}
}
