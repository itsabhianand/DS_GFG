package com.dsa.sheet.array2;

import java.util.HashMap;
import java.util.Map;

// Refer take u forward code for more explaination

public class LargestSubArrayWithSumZero {
	
	
	public static int countLargestSubArrayLength(int array[], int length) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int max = 0;
		for(int i=0; i<length; i++) {
			sum = sum + array[i];
			if(sum == 0) {
				max = i + 1;
			}
			else {
				if(map.containsKey(sum)) {
					max = Math.max(max, i - max);
				
				}
				else {
					map.put(sum, 1);
				}
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int array[] = {1,-1,3,2,-2,-8,1,7,10,23};
     int length = array.length;
     int count = LargestSubArrayWithSumZero.countLargestSubArrayLength(array, length);
     System.out.println("Length of longest sub-Array is :" + count);
	}

}
