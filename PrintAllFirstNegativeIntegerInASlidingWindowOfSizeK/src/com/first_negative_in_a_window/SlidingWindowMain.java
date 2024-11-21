package com.first_negative_in_a_window;

public class SlidingWindowMain {

	public static void main(String[] args) {
		
		long [] arr = {12 , -1, -7, 8, -15, 30, 16, 28}; 
		int k = 3;
		PrintAllFirstNegativeIntegersInASlidingWindow p = new PrintAllFirstNegativeIntegersInASlidingWindow();	
		long [] res = p.printAllFirstNegativeIntegersInSlidingWindowOfSizeK(arr, arr.length, k);
		
		System.out.print("[" + " ");
		for(int i = 0; i< res.length; i++)
		System.out.print(res[i] + ", ");
		System.out.print("]");

	}

}

/* Output 
[ -1, -1, -15, -15, -15, 0, ] ----coming
[ -1, -1, -7, -15, -15, 0, ]  ----needed
*/
		
		