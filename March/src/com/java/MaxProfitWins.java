package com.java;

import java.util.Arrays;

public class MaxProfitWins {
	
	public static int[] minMax(int[] arr) {
		// find min and max using Arrays.stream
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		
		return new int[]{min, max};
		
	}
}
