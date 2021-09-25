package com.dsa.sheet.array2;

//refer code Library
// This is a type of 2 pointers approach concept.
// Arrange elements < 14 at left, elements > 14 and elements < 20 and elements > 20 at right side.

import java.util.Arrays;

public class ThreeWayPartioning {
	
	// 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32
	public static void threeWayPartioning(int array[], int a, int b) {
		int left = 0;
		int right = array.length - 1;
		int i=0;
		while(i<= right) {
			if(array[i] > b) {
				int temp = array[right];
				array[right] = array[i];
				array[i] = temp;
				right--;
			}
			else if(array[i] < a) {
				int temp = array[left];
				array[left] = array[i];
				array[i] = temp;
				left++;
				i++;
			}
			else {
				i++;
			}
		}
		System.out.println("Resultant Array is :" + Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
       int a = 14;
       int b = 20;
       ThreeWayPartioning.threeWayPartioning(array, a, b);
	}

}
