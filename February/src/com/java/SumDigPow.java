package com.java;

import java.util.ArrayList;
import java.util.List;

public class SumDigPow {
	
	public static List<Long> sumDigPow(long a, long b) {
		// your code
		// 3456 -->  3¹ + 4² + 5³ + 6⁴ == 3456 ? "Eureka" : "Eureka";
		
		List<Long> eurekaList = new ArrayList<>();
		
		long sum = 0;
		long n = 0;
		String s = "";
		while(a <= b){
			
			s = String.valueOf(a);
			for(int i = 0; i < s.length(); i++){
				n = Character.getNumericValue(s.charAt(i));
				sum += Math.pow(n, i + 1);
			}
			
			if(a == sum){
				eurekaList.add(a);
			}
			a++;
			sum = 0;
			
		}
		return eurekaList;
	}
	
}
