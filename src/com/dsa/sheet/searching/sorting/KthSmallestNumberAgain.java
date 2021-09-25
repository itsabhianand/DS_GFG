package com.dsa.sheet.searching.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Refer Code Library

public class KthSmallestNumberAgain {
	
	public static int kthSmallestNumberAgain(int array[][], int length, int k) {
		List<int []> resultList = new ArrayList<int []>();
		if(length == 0 || null == array) {
			return -1;
		}
		
		Arrays.sort(array, (a,b) -> a[0] - b[0]); // soring of Arrays
		
		// Handling Merge Intervals
		int idx = 0;
		int start = array[0][0];
		int end = array[0][1];
		
		for(int subArray[] : array) {
			if(subArray[0] <= end) {
				end = Math.max(end, subArray[1]);
			}
			else {
				idx++;
				resultList.add(new int[] {start, end});
				start = subArray[0];
				end = subArray[1];
			}
		}
		
		resultList.add(new int[] {start, end});
		int finalArray[][] = resultList.toArray(new int[0][]);
		
		// Finally finding kth Missing element by searching in given merged intervals.
		int answer = 0;
		for(int arr[] : finalArray) {
			if(arr[1] - arr[0] + 1 >= k) {
				answer = arr[0] + k - 1;
			}
			else {
				k = k - (arr[1] - arr[0] + 1);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[][] = {{3,7}, {1,5}, {10,15}};
       int k = 9;
       int length = array.length;
       int result = KthSmallestNumberAgain.kthSmallestNumberAgain(array, length, k);
       System.out.println("Kth Missing Number again is : " + result);
	}

}
