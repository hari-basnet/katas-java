package com.java;

public class GiveMeADiamond {
	
	public static String print(int n){
		if ((n % 2) == 0 || n <= 0) return "cannot print diamond";
		StringBuilder diamond = new StringBuilder();
		
		// upper part of the diamond
		for (int i = 1; i < n; i += 2) {
			for (int j = 0; j < (n - i) / 2; j++) diamond.append(" ");
			for (int k = 0; k < i; k++) diamond.append("*");
			diamond.append("\n");
		}
		
		// lower part of the diamond
		for (int i = n; i > 0; i -= 2) {
			for (int j = 0; j < (n - i) / 2; j++) diamond.append(" ");
			for (int k = 0; k < i; k++) diamond.append("*");
			diamond.append("\n");
		}
		return diamond.toString();
	}
	
	
	public static String printUsingTwoForLoop(int n) {
		if (n < 0 || n % 2 == 0) return null;
		String shape = "";
		int midRow = n/2 + 1;
		for (int i = midRow; i <= n*2 - midRow; i++) {
			for (int j = 1; j <= n - Math.abs(n - i); j++) {
				if (j <= Math.abs(n - i))
					shape += " ";
				else
					shape += "*";
			}
			shape += "\n";
		}
		return shape;
	}
	
	
	public static String printUsingHelperMethod(int n) {
		if (n % 2 == 0 || n < 0) {
			return null;
		}
		StringBuilder diamond = new StringBuilder();
		for (int i = 1; i <= n; i+=2) {
			appendLine(diamond, i, n);
		}
		for (int i = n-2; i > 0; i-=2) {
			appendLine(diamond, i, n);
		}
		return diamond.toString();
	}
	
	private static void appendLine(StringBuilder diamond, int size, int totalSize) {
		int spaces = (totalSize-size)/2;
		for (int j = 0; j < spaces; j++) {
			diamond.append(" ");
		}
		for (int j = 0; j < size; j++) {
			diamond.append("*");
		}
		diamond.append("\n");
	}
}
