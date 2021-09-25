package com.dsa.sheet.array2;

// refer Code Library
//Use Sliding window concept 
// This should return length of minimum sub-Array whose sum is greater than value x
public class SmallestSubArrayWithGivenValue {
	
	public static int smallestSubArray(int array[], int length, int x) {
		// 1,4,45,6,0,19
		int sum = 0;
		int i=0, j=0;
		int minimum = Integer.MAX_VALUE;
		while(i<=j && j< length) {
			if(sum <=x) {
				sum = sum + array[j];
				j++;
			}
			else {
				minimum = Math.min(minimum, j-i);
				sum = sum - array[i];
				i++;
			}
		}
		return minimum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {1,4,45,6,0,19};
       int length = array.length;
       int x = 51;
       int minumiumlength = SmallestSubArrayWithGivenValue.smallestSubArray(array, length, x);
       System.out.println("Minimum Sub-Array length equal to given value is :" + minumiumlength);
	}

}
