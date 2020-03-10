package com.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        DataReverse dr = new DataReverse();
        int[] dfdf = dr.dataReverse(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(Arrays.toString(dfdf));
        
        // find the difference between the strings inside two arrays 
        MaxDiffLength ndf = new MaxDiffLength();
    
        System.out.println(ndf.findDifferenceOfTwoString(new String[]{"dfadf", "asdfa", "fasdfa"}, new String[]{"aserg", "sdf", "a", "asdfasdfadf"}));;
        
        String[] sample = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String[] letters = {"A", "B", "C", "W"};
        // help the book seller 
        HelpTheBookSeller hlpbs = new HelpTheBookSeller();
        String calculatedResult = hlpbs.countBooks(sample, letters);
        System.out.println(calculatedResult);
        
    }
}
