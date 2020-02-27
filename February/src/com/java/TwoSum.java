package com.java;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	// indices of the items of the pair that result to the target 
	// should be returned 
	
	public static int[] twoSum(int[] numbers, int target)
	{
		// Do your magic!
		if(numbers.length < 2 ){
			return new int[]{};
		}
		
		for(int i = 0; i < numbers.length; i++){
			
			for(int j = i +1; j < numbers.length; j++){
				
				if(numbers[i] + numbers[j] == target){
					return new int[] { i, j };
					
				}
			}
		}
		return new int[]{};
	}
	
	public static int[] twoSumUsingMap(int[] numbers, int target) {
		Map<Integer, Integer> numToIndexMapping = new HashMap<>(numbers.length);
		for(int i = 0; i < numbers.length; i++) {
			if(numToIndexMapping.containsKey(target - numbers[i])) {
				return new int[] { i, numToIndexMapping.get(target - numbers[i]) };
			} else {
				numToIndexMapping.put(numbers[i], i);
			}
		}
		return new int[0];
	}
	
}
