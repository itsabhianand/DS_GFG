package com.dsa.sheet.arrays;

// Program to find max and minimum element with minimum no of comparisons in an array
// Here we are making pair and comparing it with max and min and then updating i = i + 2.

public class MaximumMinimumInArray {
	
	public static void maxMinInArray(int arr[], int length) {
		int min, max;
		int i;
		if(length % 2 == 0) { // If array has even no of elements.
			if(arr[0] > arr[1]) {
				max = arr[0];
				min = arr[1];
			}
			else {
				max = arr[1];
				min = arr[0];
			}
			i = 2;
		}
		else { // If array has odd no of elements.
			max = arr[0];
			min = arr[0];
			i = 1;
		}
		   while(i<=length-1) {
			if(arr[i] > arr[i+1]) {
				if(arr[i] > max) {
					max = arr[i];
				}
				if(arr[i + 1] < min) {
					min = arr[i + 1];
				}
			}
			else {
			    if(arr[i + 1] > max) {
			    	max = arr[i + 1];
			    }
			    if(arr[i] < min) {
			    	min = arr[i];
			    }
			}
			i = i + 2;
		}
		System.out.println("Max and Min element is : " + max + " " + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = new int[] {1,5,3,2,4,8,7,0};
        int length = array.length;
        MaximumMinimumInArray.maxMinInArray(array, length);
	}

}
