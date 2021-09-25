package com.dsa.sheet.array2;

import java.util.HashMap;
import java.util.Map;

//Program to find max length of Sub-Array whose  sum is equal to 0.
public class LargestSubArraySumEqualsZero {
	
	public static int largestSubArrayEqualsZero(int array[]) {
		int sum = 0;
		int max = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// Traversing array
		for(int i=0; i < array.length; i++) {
			sum = sum + array[i];
			if(sum == 0) {
				max = i + 1;
			}
			else if(map.containsKey(sum)) {
				max = Math.max(max, i - map.get(sum));
			}
			else {
				map.put(sum, i);
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = {1,-1,3,2,-2,-8,1,7,10,23}; // 2,-2,-8,1,7
      int maxcount = LargestSubArraySumEqualsZero.largestSubArrayEqualsZero(array);
      System.out.println("Largest SubArray is : " + maxcount);
	}

}
