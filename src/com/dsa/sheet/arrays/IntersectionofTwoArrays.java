package com.dsa.sheet.arrays;


//Program to find Intersection of 2 Arrays that is unsorted, we sort those 2 arrays first and then find intersection
import java.util.Arrays;

public class IntersectionofTwoArrays {
	
	public static void intersectionArray(int[] arr1, int[] arr2, int n, int m) {
		// TODO Auto-generated method stub
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
				i++;
			}
			else if(arr1[i] >arr2[j]){
				j++;
			}
			else {
				System.out.println(arr2[j]);
				j++;
				i++;
			}
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
         IntersectionofTwoArrays.intersectionArray(array1, array2, length1, length2);
	}

}
