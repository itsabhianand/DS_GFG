package com.dsa.sheet.arrays;

// Program to find Longest contiguous Sub-Array Sum: This is Kadane's Algo. Improvised approach
// Refers gfg approach for this

public class KadanesAlgorithm {
	
	public static int maximumContiguousArray(int array[], int length) {
		// 1,2,3,-2,5
		int current_max = array[0];
		int max_so_far = array[0];
		for(int i=1; i < length; i++) {
			current_max = Math.max(array[i], current_max + array[i]);
			max_so_far = Math.max(max_so_far, current_max);
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[] = new int[] {1,2,3,-2,5};
	      int length = array.length;
	      int maximumSum = KadanesAlgorithm.maximumContiguousArray(array, length);
	      System.out.println(" Max Sum is : " + maximumSum);
	}

}
