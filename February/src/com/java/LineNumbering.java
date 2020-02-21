package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LineNumbering {
	
	public static List<String> putLineNumbers(List<String> lines){
		
		List<String> result = new ArrayList<String>();
		
		// value of i starts from 1 because we dont want to put numbering 
		// starting from 0
		for(int i = 1; i < lines.size() + 1 ; i++){
			result.add(String.valueOf(i)+": " + lines.get(i -1));
		}
		
		return result;
	}
	
	public static List<String> putLineNumbersUsingMap(List<String> lines){
		
				Map<Integer, String> result = new HashMap<>();

		for(int i = 0; i <= lines.size(); i++ ){
			result.put(i, lines.get(i));
		}

		List<String> myList = new ArrayList<>();

		for(Map.Entry<Integer, String> entry : result.entrySet()){
			myList.add(String.format("\"%s: %s\",", entry.getKey(), entry.getValue()));
		}

		return myList;
		
	}
	
	static List<String> putLineNumberSimpleMethod(List<String> lines) {
		ArrayList<String> result = new ArrayList();
		int i = 0;
		for (String s : lines) {
			result.add(++i + ": " + s);
		}
		return result;
	}
	
	static List<String> putLineNumberUsingStream(List<String> lines) {
		if (lines.size() == 0) return lines;
		return IntStream.range(0, lines.size())
			.mapToObj(n -> String.format("%d: %s", n+1, lines.get(n)))
			.collect(Collectors.toList());
	}
	
}
