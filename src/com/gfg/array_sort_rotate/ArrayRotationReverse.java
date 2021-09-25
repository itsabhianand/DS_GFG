package com.gfg.array_sort_rotate;

// This solution has Time complexity : O(n)
// with no extra space. Thus, best solution
// Cyclically Rotate an array is rotating clockwise means shifting right.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {1,2,3,4,5};
		int l = a.length;
		
		System.out.println("Please enter count by which array needs to be rotated");
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		
		System.out.println("Reverse first part of Array :");
		
		String array1 = Arrays.toString(arrayRotateReverse(a, 0, l-1)); // 5,4,3,2,1
		
		System.out.println(array1);
		System.out.println("Reverse second part of Array :");
		String array2 = Arrays.toString(arrayRotateReverse(a, 0, d-1)); // 4,5,3,2,1
		System.out.println(array2);
		
		System.out.println("Reverse Resultant Rotated Array is :");
		String array3 = Arrays.toString(arrayRotateReverse(a, d, l-1)); // 4,5,1,2,3
		
		System.out.println("So final array is :" + array3);
		
	}
	public static int[] arrayRotateReverse(int arr[], int start, int end)
	{
		while(start < end) {
			int temp=arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

}

// 5,4,3,2,1  n =5 and d =2
		   