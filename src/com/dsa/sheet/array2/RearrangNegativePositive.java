package com.dsa.sheet.array2;


import java.util.Arrays;

// Refer Code Library , Two Pointers approach.


public class RearrangNegativePositive {
	
	public static void rearrangeNumbers(int array[], int length) {
		int i = 0;
		int j = length -1;
		// Fisrt segregate arrays into positive, negative values in array and then swap postive to negative at even position
		while(i < j) {
			if(array[i] > 0) {
				i++;
			}
			else {
				if(array[j] < 0) {
					j--;
				}
				else {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
					i++;
					j--;
				}
			}
		}
		
		System.out.println("Printing Segregated array : " + Arrays.toString(array));
		
		for(int k=0;k<array.length;k=k+2) {

			if(i<array.length) { // i will be starting from negative element starting index
				int tmp = array[k];
				array[k] = array[i];
				array[i] = tmp;

				i++;
			}
		}
		System.out.println("Final array is :" +  Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {2,3,-4,-1,6,-9};
       int length = array.length;
       RearrangNegativePositive.rearrangeNumbers(array, length);
	}

}
