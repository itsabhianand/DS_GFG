package com.dsa.sheet.arrays;

import java.util.Arrays;

// Program to find Union of 2 Arrays that is unsorted, we sort those 2 arrays first and then find union that is present in sorted manner.

public class UnionofTwoArrays {
	
	// We are passing sorted Array1 and Array2.
	public static void unionArray(int arr1[], int arr2[], int n, int m) {
		int i=0;
		int j=0;
		
		while(i < n-1 && j < m-1) {
			
			if(arr1[i] == arr1[i+1]) {
				i++;
			}
			if(arr2[j] == arr2[j+1]) {
				j++;
			}
			
			if(arr1[i] < arr2[j]) {
				System.out.println(arr1[i]);
				i++;
			}
			else if(arr1[i] >arr2[j]){
				System.out.println(arr2[j]);
				j++;
			}
			else {   // This is when element in both array is common so we take any one of them.
				System.out.println(arr2[j]);
				j++;
				i++;
			}
		}
		while(i < n) {   // Checking if array1 still has elements and array2 is exhausted.
			System.out.println(arr1[i]);
			i++;
		}
		while(j < m) {
			System.out.println(arr2[j]);
			j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int array1[] = {1,2,2,3,3,4,5};
         int array2[] = {3,3,7,8};
         int length1 = array1.length;
         int length2 = array2.length;
         Arrays.sort(array1, 0, length1);
         Arrays.sort(array2, 0, length2);
         UnionofTwoArrays.unionArray(array1, array2, length1, length2);
	}

	

}
