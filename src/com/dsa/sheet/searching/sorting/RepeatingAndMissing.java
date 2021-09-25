package com.dsa.sheet.searching.sorting;

// Refer Code Library code.

// For this code, only one number has to be repeated and one should be missed else it will not work.
//There is only one repeated number in nums, return this repeated number.
public class RepeatingAndMissing {
	
	public static void repeatingAndMissing(int array[], int length) {
		int repeat = 0;
		int miss = 0;
		
		// Logic for Repeating element
		// 2,4,1,2,2,5
		for(int i=0; i < length; i++) {
			if(array[Math.abs(array[i]) - 1] < 0) {
				repeat = Math.abs(array[i]);
			}
			else {
				array[Math.abs(array[i]) - 1] = -array[Math.abs(array[i]) - 1];
				
			}
		}
		// Logic for Missing element
		for(int j=0; j < array.length; j++) {
			if(array[j] > 0) {
				miss = j + 1;
				break;
			}
		}
		
		System.out.println("Repeated element is :" + repeat);
		System.out.println("Missing element is :" + miss);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = {2,4,2,2,1,5};
        int length = array.length;
        RepeatingAndMissing.repeatingAndMissing(array, length);
	}

}
