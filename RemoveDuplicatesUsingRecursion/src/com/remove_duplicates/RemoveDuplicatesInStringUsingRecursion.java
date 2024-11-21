package com.remove_duplicates;

public class RemoveDuplicatesInStringUsingRecursion {
	
	private static boolean [] alphabetMap;
	private static String newString;
	
	static {		
		alphabetMap = new boolean[26];
		newString = "";
	}
	
	public static void removeDuplicates(String str, int index, String newString) {
		
		if(index == str.length()) {
			System.out.println(newString);
			return;	
		}
			
			
		char currChar = str.charAt(index);
		
		if(alphabetMap[currChar - 'a'] == true) { 
			removeDuplicates(str, index+1, newString);
		}	
		else {
			newString += currChar;
			alphabetMap[currChar - 'a'] = true;
			removeDuplicates(str, index+1, newString);		    
		}					
		
	}
	
	public static void main(String[] args) {
		
       String str = "abacadefaghiajdkelmdnocp";
       removeDuplicates(str, 0, newString);
       
	}

}
