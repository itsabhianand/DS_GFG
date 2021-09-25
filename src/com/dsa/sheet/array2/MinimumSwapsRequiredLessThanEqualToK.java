package com.dsa.sheet.array2;

// Program to find minimum swaps required to bring elements less than or equal to k together.
//Make use of sliding Window technique., Refer code Library

public class MinimumSwapsRequiredLessThanEqualToK {
	
	public static int minimumSwaps(int array[], int length, int key) {
		// 2,1,5,6,3
		int good = 0; // This variable is used for maintaining sliding window.
		for(int i=0; i<array.length; i++) {
			if(array[i] <= key) {
				good++;
			}
		}
		 int bad = 0; // This is used for tracking down elements greater than k or minimum swaps required.
		 // Finding bad for first sliding window that is for first 3 elements.
		for(int k=0; k<good; k++) {
			if(array[k] > key) {
				bad++;
			}
		}
		
		 if(bad == 0) {
			return 0;
		  }
		int m =0;
		int j = good - 1;
		int mi = Integer.MAX_VALUE;
		while(j < array.length) {// To traverse till last element.
			mi = Math.min(mi, bad);
			j++;
			if(j < array.length && array[j] > key) {
				bad++;
			}
			if(array[m] > key) {
				bad--;
			}
			m++;
		}
		
		return mi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {2,1,5,6,3};
       int length = array.length;
       int key = 3;
       int minimumSwaps = MinimumSwapsRequiredLessThanEqualToK.minimumSwaps(array, length, key);
       System.out.println("Minimum swaps required is : " + minimumSwaps);
	}

}
