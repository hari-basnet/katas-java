package com.java;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.List;

public class ReverseWordsKata {
	
	public static String reverseSingleWord(final String original){
		
		return new StringBuilder(original).reverse().toString();
	}
	
	public static String reverseMultipleWords(final String original){
		
//		List<String> splitted = Arrays.asList(original.split("(?<=\\s) | (?=\\s)"));
//		
//		splitted.stream()
//			.map(str -> new StringBuilder(str).reverse().toString())
//			.collect(joining());
		
		return stream(original.split("(?<=\\s) | (?=\\s)")).map(str -> new StringBuilder(str).reverse().toString()).collect(joining());
	}
	
}
