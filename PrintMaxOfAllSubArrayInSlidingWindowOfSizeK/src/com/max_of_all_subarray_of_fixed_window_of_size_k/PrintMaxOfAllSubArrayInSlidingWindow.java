package com.max_of_all_subarray_of_fixed_window_of_size_k;

import java.util.LinkedList;
import java.util.Queue;

public class PrintMaxOfAllSubArrayInSlidingWindow {

	public long[] printMaxOfAllSubArrayInSlidingWindow(long[] arr, int arrSize, int winSize) {

		int i = 0;
		int j = 0;
		Queue<Long> q = new LinkedList<>();
		long[] result = new long[6];
		
		int index = 0;

		while (j < arrSize) {
					
			while(q.size()>0 && q.peek()<arr[j]) {
				q.poll();
			}
			
			q.add(arr[j]);
			

			if (j - i + 1 < winSize)
				j++;

			if (j - i + 1 == winSize) {
						
				result[index] = q.peek();
				index++;
				
				if(arr[i] == q.peek())
				  q.poll();	
				
				i++;
     			j++;

			}

		}

		return result;
	}


}
