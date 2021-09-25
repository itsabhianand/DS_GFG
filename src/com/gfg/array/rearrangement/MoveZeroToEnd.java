package com.gfg.array.rearrangement;

import java.util.Arrays;

// Program to move 0's to end of an array

public class MoveZeroToEnd {
	
	public static void moveZerosToEnd(int[] array, int length) {
		int left = 0;
		int right = 0;
		while(right < length && left < length) {
			if(array[right] != 0) {
				int temp = array[right];
				array[right] = array[left];
				array[left] = temp;
				right++;
				left++;
			}
			else {
				right ++;
			}
		}
		System.out.println("Resultant Array is :" + Arrays.toString(array));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {0,1,2,3,0,4,5};
        int l = arr.length;
        MoveZeroToEnd.moveZerosToEnd(arr, l);
	}

}
