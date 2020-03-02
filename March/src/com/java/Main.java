package com.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        DataReverse dr = new DataReverse();
        int[] dfdf = dr.dataReverse(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(Arrays.toString(dfdf));
    }
}
