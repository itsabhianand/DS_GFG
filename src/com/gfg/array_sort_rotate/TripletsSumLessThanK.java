package com.gfg.array_sort_rotate;

import java.util.Arrays;

// Program to count triplets sum less than given value K

public class TripletsSumLessThanK {
	
	public static int tripletsSumLessThanK(int array[], int length, int k) {
		int count = 0;
		Arrays.sort(array, 0, length);
		
		for(int i=0; i < length ; i++) {
		int x = array[i];
		int left = i+1;;
		int right = length - 1;
		while(left < right) {
			if(x + array[left] + array[right] < k) {
				count = count + (right - left);
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
         int count = TripletsSumLessThanK.tripletsSumLessThanK(array, length, k);
         System.out.println("Triplets sum less than given sum is :" + count);
	}

}
