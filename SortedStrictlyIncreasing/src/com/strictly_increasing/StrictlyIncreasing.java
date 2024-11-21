package com.strictly_increasing;

public class StrictlyIncreasing {
	
	public static boolean isSorted(int arr[],int index) {
		
		if(index == arr.length-1)
			return true;
		
		if(arr[index] < arr[index+1])
		   return isSorted(arr, index +1);
		else
			return false;
			
	}
	
	public static void main(String[] args) {
		
		int arr [] = {1,3,5,8,10};
		System.out.println(isSorted(arr, 0));		
	}

}
