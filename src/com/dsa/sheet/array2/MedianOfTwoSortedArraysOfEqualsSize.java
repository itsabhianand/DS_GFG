package com.dsa.sheet.array2;

import java.util.Arrays;

// Program to find median of 2 sorted Arrays of equal size without any extra space complexity.

public class MedianOfTwoSortedArraysOfEqualsSize {
	
	public static void medianOfTwoArrays(int array1[], int array2[], int length1, int length2) {
		int i = 0, j = 0;
		while(i < length1 && j < length2) {
			if(array1[i] > array2[j]) {
				int temp = array2[j];
				array2[j] = array1[i];
				array1[i] = temp;
				Arrays.sort(array2, 0, length2);
				i++;
			}
		}
		
		 //if 2 arrays are sorted and of unequal size.
           if(array1.length!=array2.length) {
			
			if(array1.length > array2.length) 
				System.out.println("The median of 2 sorted arrays is : " +array1[array1.length - 1]);
			
			else 
				System.out.println("The median of 2 sorted arrays is : " +array2[0]);
			return;
		}
		System.out.println("First array is : " + Arrays.toString(array1));
		System.out.println("Second array is : " + Arrays.toString(array2));
		// If arrays are of equal size.(last element of 1st array and first element of second array).
		int median = (array1[length1 - 1] + array2[0])/2;
		System.out.println(" Median calculated is : "+ median);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array1[] = {2,7,9,14,16};
        int array2[] = {1,5,6,8,12};
        int length1 = array1.length;
        int length2 = array2.length;
        MedianOfTwoSortedArraysOfEqualsSize.medianOfTwoArrays(array1, array2, length1, length2);
	}

}
