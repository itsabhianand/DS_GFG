package com.dsa.sheet.searching.sorting;

// Refer Code Library

// A step array is an array of integer where each element has a difference of at most k with its neighbor. Given a key x, we need to 
//find the index value of x if multiple element exist return the first occurrence of the key.

public class SearchElementInArrayWhereAdjacentDifferAtMostK {
	
	public static int searchElement(int array[], int length, int k, int x) {
		// Ideally, 5,7,9,11,13
		// 5,6,7,9,10,11
		int i = 0;
		int answer = 0;
		while(i < length) {
			if(array[i] == x) {
				answer = i;
				break;
			}
			int y = Math.max(1, Math.abs(array[i] - x)/k); // To keep track of next iterative steps to get x with atmost adjacent difference k.
			i = i + y;
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {5,6,7,9,10,11};
       int length = array.length;
       int k = 2; // at Most Difference between adjacent element
       int x = 11; // key to be found
       int element = SearchElementInArrayWhereAdjacentDifferAtMostK.searchElement(array, length, k, x);
       System.out.println("Element found at index : " +  element);
	} 

}
