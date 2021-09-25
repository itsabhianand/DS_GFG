package com.gfg.array.rearrangement;

import java.util.Arrays;


// Program to segregate even and odd number that too in sorted order
public class SegregateEvenOdd {
	
	public static void segregateFunction(int array[], int length) {
		int left = 0;
		int right = 0;
		int count = 0;
		while(right < length && left < length) {
			if(array[right] % 2 == 0) {
				int temp = array[right];
				array[right] = array[left];
				array[left] = temp;
				right++;
				left++;
				count++;
			}
			else {
				right ++;
			}
			
		}
		Arrays.sort(array, 0, count);
		Arrays.sort(array, count, length);
		System.out.println("Resultant Array is :" + Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,4,3,7,5,6,9,8, 11, 10};
		int l = arr.length;
		SegregateEvenOdd.segregateFunction(arr, l);		
	}

}
