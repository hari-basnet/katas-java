package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.CORBA.INTERNAL;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import sun.security.jgss.GSSUtil;

public class Main {
    
    public static String stringSolution(String str){
        return new StringBuilder(str).reverse().toString();
    }
    
    public static String mySolution(String str){
        String invertedString = "";
        for(int i = str.length() -1; i >= 0; i--){
            invertedString += str.charAt(i);
        }
        return invertedString;
    }
    
    public static String even_or_odd(int number) {
      return number % 2 == 0 ? "Even" : "Odd";
    }
    
    // given two string find only the unique string
    public static String longest (String s1, String s2) {
        // your code
        String s = s1 + s2;
        return s.chars().distinct().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());
    }
    
    public static int[] countPositivesSumNegatives(int[] input) {
//        if (input == null || input.length == 0) return new int[] {};
//        int count = 0,sum = 0;
//        for (int i : input) {
//            if (i > 0) count ++;
//            if (i < 0) sum += i;
//        }
//        return new int[] {count,sum};
        if( input == null || input.length == 0){
            return new int[] {};
        }

        int sum = 0;
        int count = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] < 0){
                sum += input[i];
            }
            else  if (input[i] > 0){
                count++;
            }
        }
        return new int[] {count, sum}; //return an array with count of positives and sum of negatives
    
    }
    
    
    public static void main(String[] args) {
	// write your code here
        
        int[] intArray = new int[] {1,4,-99,-58,1,7,6,2,8};
    
        System.out.println(mySolution("hari"));
        System.out.println(stringSolution("dipesh kumar"));
        System.out.println(mySolution("ramesh prasad"));
        System.out.println(even_or_odd(5));
        System.out.println(longest("hari", "basnet"));
        System.out.println(Arrays.toString(countPositivesSumNegatives(intArray)));
        
        
        // recursion practice
        
        NthSeries nn = new NthSeries();
    
        System.out.println(nn.seriesSum(1));
        
        // Find vowels
        FindVowels fv = new FindVowels();
        System.out.println(fv.getCount("A2-4399 migrate call sites in room-monitor/data-provider"));;
        
        // printing a diamond
        GiveMeADiamond stardiamond = new GiveMeADiamond();
        System.out.println(stardiamond.print(2));
        
        // calculate interest 
        Money interestMoney = new Money();
        int totalYearsToGetThatAmount = interestMoney.calculateYears(10000, 0.20, 0.01, 1500);
    
        int totalYearsToGetThatAmount2 = interestMoney.calculateYearsTwo(1000, 0.20, 0.01, 1500);
        System.out.println(totalYearsToGetThatAmount + " years.");
        System.out.println(totalYearsToGetThatAmount2 + " years.");
        
        // arithmetic function 
        ArithmeticFunction af = new ArithmeticFunction();
        System.out.println(af.arithmetic(2,2,"add"));
    }
}
