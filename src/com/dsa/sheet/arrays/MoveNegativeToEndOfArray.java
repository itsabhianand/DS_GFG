package com.dsa.sheet.arrays;

import java.util.Arrays;

// Program to move negative first followed by positive.

public class MoveNegativeToEndOfArray {
	
	public static void moveNegativeToEnd(int arr[], int n) {
		int length = n;
		int left = 0;
		int right = 0;
		while(left < length && right < length) {
			if(arr[right] < 0) {
				right++;
			}
			else {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				left++;
				right++;
			}
		}
		System.out.println("Final Resultant array is : " + Arrays.toString(arr));
	}
	
	// Using PJ Approach
	public static void moveNegativeToEndSecondApproach(int array[], int n) {
		int left=0;
		int right = n-1;
		while(left < right) {
			if(array[left] > 0) {
				left++;
			}
			else {
				if(array[right] < 0) {
					right--;
				}
				else {
					int temp = array[right];
					array[right] = array[left];
					array[left] = temp;
					left++;
					right--;
				}
			}
		}
		
		System.out.println("Second Resultant Array is : " + Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = new int[] {10, 20, 15, -10, -34, -45, -67, 54, 21};
       int length = array.length;
       //MoveNegativeToEndOfArray.moveNegativeToEnd(array, length);
       moveNegativeToEndSecondApproach(array, length);
	}

}
