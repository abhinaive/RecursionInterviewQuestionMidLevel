package com.find_all_subsequences;

public class FindAllSubsequencesInString {
	
	public static void printAllPossibleSubsequencesOfAGivenString(String str, int index, String newString) {
		
		if(index == str.length()) {
			System.out.println(newString);
			return;
		}
					
		char currChar = str.charAt(index);
		
		// if curr char decided to go with current string
		printAllPossibleSubsequencesOfAGivenString(str, index+1, newString+currChar);
		
		//if curr char decided not to go with current string
		printAllPossibleSubsequencesOfAGivenString(str, index+1, newString);
		
	}

	public static void main(String[] args) {
		
		String str = "abc";
		printAllPossibleSubsequencesOfAGivenString(str, 0, "");
		
	}

}

/*     Output
abc ab ac a bc b c ___ */

/* time complexity = (tot. num of subsequences) = 2(pow n)
 * 2(pow n) + 2(pow n-1) ..... 1 (n+1 terms) = 2(pow n+1) -1 ~ 2(pow n)
*/