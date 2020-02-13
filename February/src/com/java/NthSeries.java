package com.java;

import static java.util.stream.LongStream.range;

public class NthSeries {
	
	public String seriesSum(int n){
	
//		double sum = 0.0;
//		for (int i = 0; i < n; i++)
//			sum += 1.0 / (1 + 3 * i);
//		return String.format("%.2f", sum);
		
		return String.format("%.2f", range(0, n).mapToDouble(num -> 1. / (num * 3 + 1)).sum());
	}
}
