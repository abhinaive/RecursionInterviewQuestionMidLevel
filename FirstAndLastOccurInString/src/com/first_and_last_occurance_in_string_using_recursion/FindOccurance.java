package com.first_and_last_occurance_in_string_using_recursion;

public class FindOccurance {

	private static int firstOccur;
	private static int lastOccur;

	static {
		firstOccur = -1;
		lastOccur = -1;
	}

	public static void firstAndlastOcurranceInStringWithoutRecursion(String str, int length, char c) {

		for (int i = 0; i <= length; i++) {
			if (str.charAt(i) == c) {
				if (firstOccur == -1) {
					firstOccur = i;
					lastOccur = i;
					i++;
				//	System.out.println(firstOccur);
				} else {
					lastOccur = i;
					i++;
				//	System.out.println(lastOccur);
				}

			}
		}
		
		System.out.println(firstOccur + " " + lastOccur);
	}
	
	
	public static void firstAndlastOcurranceInStringWithRecursion(String str, int index, char c) {
		
		if(index == str.length()) {
			System.out.println(firstOccur + " " + lastOccur);		
			return;
		}
		
		char currChar = str.charAt(index);
		if(currChar==c) {
			if(firstOccur == -1)
				firstOccur = index;
			else
				lastOccur =  index;
		}  
		
		firstAndlastOcurranceInStringWithRecursion(str, index+1, c);
		
	}
	
	
	public static void main(String[] args) {

		String str = "abcdefahdmna";
		char c = 'a';
		
		System.out.println("firstAndlastOcurranceInStringWithoutRecursion");
		firstAndlastOcurranceInStringWithoutRecursion(str, str.length() - 1, c);
		
		System.out.println("firstAndlastOcurranceInStringWithRecursion");
		firstAndlastOcurranceInStringWithRecursion(str,0,c);

	}

}
