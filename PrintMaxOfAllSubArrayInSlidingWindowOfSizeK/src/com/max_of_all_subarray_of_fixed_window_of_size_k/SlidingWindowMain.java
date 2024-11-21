package com.max_of_all_subarray_of_fixed_window_of_size_k;

public class SlidingWindowMain {

	public static void main(String[] args) {
		
		long [] arr = {12 , -1, -7, 8, -15, 30, 16, 28}; 
		int k = 3;
		PrintMaxOfAllSubArrayInSlidingWindow p = new PrintMaxOfAllSubArrayInSlidingWindow();	
		long [] res = p.printMaxOfAllSubArrayInSlidingWindow(arr, arr.length, k);
		
		System.out.print("[" + " ");
		for(int i = 0; i< res.length; i++)
		System.out.print(res[i] + ", ");
		System.out.print("]");

	}

}

/* Output
[ 12, 8, 8, 30, 30, 30, ] ----coming
*/
		
		