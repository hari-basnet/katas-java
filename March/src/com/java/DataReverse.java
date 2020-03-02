package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataReverse {
	public static int[] dataReverse(int[] data) {
		
		for(int i = 0; i < data.length / 2; i++)
		{
			int temp = data[i];
			data[i] = data[data.length - i - 1];
			data[data.length - i - 1] = temp;
		}
		
		return data;
	}
	
}
