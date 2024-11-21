package com.first_negative_in_a_window;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAllFirstNegativeIntegersInASlidingWindow {

	public long[] printAllFirstNegativeIntegersInSlidingWindowOfSizeK(long[] arr, int arrSize, int winSize) {

		int i = 0;
		int j = 0;
		Queue<Long> q = new LinkedList<>();
		long[] result = new long[arrSize - winSize + 1];
		
		int index = 0;

		while (j < arrSize) {
	
			if (arr[j] < 0)
				q.add(arr[j]);

			if (j - i + 1 < winSize)
				j++;

			if (j - i + 1 == winSize) {
						
				if (q.size() == 0) {
					result[index] = 0;
					index++;
				} else {
									
					result[index] = q.peek();
					index++;
					
					if (arr[i] == q.peek())
						q.poll();

				}
				
				i++;
     			j++;

			}

		}

		return result;
	}


/*	
   public long[] printFirstNegativeInteger(long A[], int N, int K) {

		int i = 0, j = 0;
		Queue<Long> q = new LinkedList<>();
		long result[] = new long[N - K + 1];
		int idx = 0;

		while (j < N) {

			if (A[j] < 0)
				q.add(A[j]);

			if (j - i + 1 == K) {

				if (q.size() == 0) {

					result[idx++] = 0;

				} else {

					result[idx++] = q.peek();

					if (A[i] == q.peek()) {

						q.poll();
					}

				}
				i++;

			}

			j++;

		}

		return result;

	}
	
*/	

}
