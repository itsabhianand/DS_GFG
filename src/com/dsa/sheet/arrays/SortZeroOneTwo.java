package com.dsa.sheet.arrays;

// Program to find Sort or arrange 0,1 and 2 sequentially
import java.util.Arrays;

public class SortZeroOneTwo {
	
	
	public static void sortNumbers(int array[], int length) {
		
		int count1 = 0, count2 = 0, count3 = 0;
		for(int i=0; i < length; i++) {
			if(array[i] == 0)
				count1++; // Tracking count of 0 element.
			else if(array[i] == 1)
				count2++; // Tracking count of 1 element.
			else if(array[i] == 2)
				count3++; // Tracking count of 2 element.
		}
		int k = 0;
		for(int i=0; i < count1; i++) {
			array[k++] = 0;
		}
		for(int i=0; i < count2; i++) {
			array[k++] = 1;
		}
		for(int i=0; i < count3; i++) {
			array[k++] = 2;
		}
		
		System.out.println("Final Array formed is : " + Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = new int[] {0,1,1,1,1,0,0,0,0,2,2,2};
       int len = array.length;
       SortZeroOneTwo.sortNumbers(array, len);
	}

}
