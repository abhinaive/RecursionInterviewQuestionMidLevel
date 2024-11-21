package com.move_elements;

public class MoveAllElementsOfSameTypeToEndUsingRecursion {

	private static String newString;
	private static int count;

	static {
		newString = "";
		count = 0;
	}

	public static void moveAllXsToEnd(String str, int index, int count, String newString) {

		if (index == str.length()) {

			for (int i = 0; i < count; i++) {

				newString = newString + 'x';
			}
			System.out.println(newString);
			return;
		}

		char currChar = str.charAt(index);

		if (currChar == 'x') {
			count++;
			moveAllXsToEnd(str, index + 1, count, newString);
		} else {
			newString = newString + str.charAt(index);
			moveAllXsToEnd(str, index + 1, count, newString);
		}

	}

	public static void main(String[] args) {
		String str = "abxabxabxabxabxabx";
		moveAllXsToEnd(str, 0, count,newString);
		
	}

}
