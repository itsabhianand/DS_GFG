package com.dsa.sheet.arrays;

// Program to find Longest contiguous Sub-Array: This is Kadane's Algo.
// NOTE : This does not work if all elements in an array is -ve., Refers gfg approach for this

public class LongestContiguousArray {
	
	public static int maximumContiguousArray(int array[], int length) {
		int max_so_far = 0;
		int max_till_here = 0;
		
		for(int i=0; i < length; i++) {
			
			max_till_here = max_till_here + array[i];
			
			if(max_till_here < 0) {
				max_till_here = 0;
			}
			else if(max_till_here > max_so_far) {
				max_so_far = max_till_here;
			}
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = new int[] {1,2,3,-2,5};
      int length = array.length;
      int maximumSum = LongestContiguousArray.maximumContiguousArray(array, length);
      System.out.println(" Max Sum is : " + maximumSum);
	}

}
