package com.java;

public class HelpTheBookSeller {
	
	public static String countBooks(String[] lstOfArt, String[] lstOf1stLetter){
		
		String returnValue = "";
		
		if(lstOfArt.length != 0 && lstOf1stLetter.length != 0){
			
			for(int i = 0; i < lstOf1stLetter.length; i++){
				
				String currentLetter = lstOf1stLetter[i];
				int count = 0;
				
				for(int j = 0; j < lstOfArt.length; j++ ){
					
					String currentArt = lstOfArt[j];
					
					if(currentArt.substring(0,1).equals(currentLetter)){
						String[] artValues = currentArt.split(" "); // "ACDE 55" separates to ["ACDE" "55"]
						count += Integer.parseInt(artValues[1]);
					}
				}
				
				String resultingString = "(" + currentLetter + " : " +  count + ")";
				if(i != lstOf1stLetter.length - 1){
					returnValue += resultingString + " - ";
				}else{
					returnValue += resultingString;
				}
			}
			
		}
		
		return returnValue;
	}
	
}
