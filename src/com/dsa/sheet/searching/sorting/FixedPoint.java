package com.dsa.sheet.searching.sorting;

// Program to find a point in array where array[i] equals i+1

public class FixedPoint {
	
	public static void fixedPoint(int array[], int length) {
		for(int i=0; i< length; i++) {
			if(array[i] == i+1) {
				System.out.println("Element found is : " + array[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {15,2,45,4,12,17};
       int length = array.length;
       FixedPoint.fixedPoint(array, length);
	}

}
