package com.gfg.array_sort_rotate;

import java.util.Arrays;

// Program to reverse array in sub-groups
// Given sub=-group of length k we need to revrse element in that sub-grp and also other left elements.

public class ReverseArrayInGroup {

	public static void reverseArrayGroup(int array[], int n, int k) {
		
		for(int i=0; i<n ;i = i+k) {
			int start = i;
			int end = Math.min(i + k - 1, n - 1); // when k is not multiple of n, then in this case, we need to check index of last element and avoid indexoutofbound exception
			while(start < end) {
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}
	}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {5,6,7,8,3,2,9,1};
		int k = 5;
		int n = array.length;
		ReverseArrayInGroup.reverseArrayGroup(array, n, k);
		for(int i : array) {
			System.out.println(i + " ");
		}
	}

}
