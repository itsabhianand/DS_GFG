package com.dsa.sheet.arrays;

// Program to cyclically rotate an array by one means Shifting array elements right side.
import java.util.Arrays;

public class CyclicallyRotateAnArray {
	
	public static void cyclicRotationOfArray(int array[], int length) {
		int temp;
		temp= array[length - 1];
		
		for(int i=length-1; i>0; i--) {
			array[i] = array[i-1];
		}
		
		array[0] = temp;
		System.out.println("Final Rotated Array is : " + Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = new int[] {1,2,3,4,5,8,7};
        int length = array.length;
        CyclicallyRotateAnArray.cyclicRotationOfArray(array, length);
	}

}
