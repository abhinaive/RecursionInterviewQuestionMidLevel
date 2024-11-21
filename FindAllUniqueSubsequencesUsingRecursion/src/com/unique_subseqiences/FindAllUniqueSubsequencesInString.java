package com.unique_subseqiences;

import java.util.HashSet;

public class FindAllUniqueSubsequencesInString {

	private static void printAllUniqueSubsequencesOfGivenString(String str, int index, String newString,
			HashSet<String> set) {

		if (index == str.length()) {
			if (set.contains(newString)) {
				return;
			}		
			else {				
				System.out.println(newString);
				set.add(newString);
		    	return;
			}	    
		}

		char currChar = str.charAt(index);

		printAllUniqueSubsequencesOfGivenString(str, index + 1, newString+currChar, set);

		printAllUniqueSubsequencesOfGivenString(str, index + 1, newString, set);

	}

	public static void main(String[] args) {

	  //String str = "aab";
		String str = "aaa";
		HashSet<String> set = new HashSet<>();

		printAllUniqueSubsequencesOfGivenString(str, 0, "", set);

	}

}


/*   Output 
 * aaa aa a ___
*/   
