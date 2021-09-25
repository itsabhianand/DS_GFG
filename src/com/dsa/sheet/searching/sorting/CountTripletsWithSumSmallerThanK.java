package com.dsa.sheet.searching.sorting;

import java.util.Arrays;

public class CountTripletsWithSumSmallerThanK {
     // 5,1,3,4,7
	// Triplets are : 1,3,5 and 1,4,5 and 1,3,4 and 1,3,7
	   
	public static int tripletsSumLessThanK(int array[], int length, int k) {
		int count = 0;
		Arrays.sort(array, 0, length); // 1,3,4,5,7
		
		for(int i=0; i < length ; i++) {
		int x = array[i];
		int left = i+1;;
		int right = length - 1;
		while(left < right) {
			if(x + array[left] + array[right] < k) {
				count = count + (right - left); // Doing this bcz since array is sorted so triplets considering before last element is also considered.
				left++;
			}
			else {
				right--;
			}
		}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[] = {5,1,3,4,7};
         int length = array.length;
         int k =12;
         int count = tripletsSumLessThanK(array, length, k);
         System.out.println("Triplets sum less than given sum is :" + count);
	}

}
