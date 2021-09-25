package com.dsa.sheet.arrays;

// Program to find all Overlapping  merged Intervals
// Refer take u forward videos for more explanation

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	
	public static int[][] mergeOverLappingIntervals(final int arr[][], int length){
		List<int []> resultList = new ArrayList<int []>();
		if(length == 0 || arr == null) {
			return resultList.toArray(new int[0][]);
		}
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);    
		int start = arr[0][0];
		int end = arr[0][1];
		
		for(int subArray[] : arr) { // {{1,9}, {2,4}, {4,7}, {6,8}, {11,12}}
			if(subArray[0] <= end) {
				end = Math.max(end, subArray[1]);
			}
			else {
				resultList.add(new int[] {start, end});
				start = subArray[0];
				end = subArray[1];
			}
		}
		
		resultList.add(new int[] {start, end});
		return resultList.toArray(new int[0][]);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[][] = { {6,8}, {1,9}, {2,4}, {4,7}, {11,12}};
        int length = array.length;
        int finalArray[][] = MergeIntervals.mergeOverLappingIntervals(array, length);
        System.out.println("Final Merged overlap Intervals are : " + Arrays.deepToString(finalArray));
	}

}
  