package com.gfg.array_sort_rotate;

import java.util.Arrays;

// Pair in sorted Array closest to Zero , Here we take 2 variables min_left and min_right just to keep track of pair with minimum sum.
//Timecomplexity : O(nlogn)

public class PairInSortedArrayClosesttoZero {
	
	public static void pairInSortedArray(int array[], int n) {
		
		int sum;
		int l=0;
		int r = n-1;
		int minimum_left = l;
		int minimum_right = r;
		Arrays.sort(array, 0, n); // Sorting below given unsorted array at this stage
		int minimum_sum = array[0] + array[1];
		while(l < r) {
			sum = array[l] + array[r];
			if(Math.abs(minimum_sum) > Math.abs(sum)) {
				minimum_sum = sum;
				minimum_left = l;
				minimum_right = r;
			}
			if(sum < 0) {
				l++;
			}
			else {
				r--;
			}
		}
		System.out.println("Pair of elements whose sum is closest to zero are : " + array[minimum_left] + " " + "and " + array[minimum_right]); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int array[] = new int[] {1,30,-5,70,-8,20,-40,60}; // unsorted Array
		int length = array.length;
		PairInSortedArrayClosesttoZero.pairInSortedArray(array, length);
	}

}
