package com.dsa.sheet.searching.sorting;

// Refer Code Library
// Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. Solve it without division operator in O(n) time.

import java.util.Arrays;

public class ProductArrayPuzzle {
	
	public static void productPuzzle(int array[], int length) {
		// 10,3,5,6,2
		int left[] = new int[length];
		int right[] = new int[length];
		left[0] = 1;
		right[length - 1] = 1;
		for(int i=1; i < length; i++) {
			left[i] = left[i-1] * array[i-1]; // left : 1,10,30,150,900 
		}
		
		for(int j=length-2; j>=0; j--) {
			right[j] = right[j+1] * array[j+1];// right : [180, 60, 12, 2, 1]
		}
		
		for(int k=0; k < length; k++) {
			array[k] = left[k] * right[k];
		}
		
		System.out.println("Final Product array is :" + Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {10,3,5,6,2};
       int length = array.length;
       ProductArrayPuzzle.productPuzzle(array, length);
	}

}
