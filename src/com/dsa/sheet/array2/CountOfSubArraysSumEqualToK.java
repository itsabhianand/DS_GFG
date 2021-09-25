package com.dsa.sheet.array2;

import java.util.HashMap;
import java.util.Map;

// Program to find count of Sub-Arrays whose sum is equal to given value as K.

public class CountOfSubArraysSumEqualToK {
	
	public static int countOfSubArrays(int array[], int length, int key) {
		int current_sum = 0; // Taken as a prefix sum
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i < array.length; i++) {
			current_sum = current_sum + array[i];
			if(current_sum == array[i]) {
				count++;
			}
			
			else if(map.containsKey(current_sum - key)) {
				count = count + map.get(current_sum - key); // To check all possible sub Arrays
				map.put(current_sum, map.getOrDefault(current_sum, 0) + 1);
			}
			else {
				map.put(current_sum, 1);
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int array[] = {3,4,7,2,-3,1,4,2};
         int length = array.length;
         int key = 7;
        int count =  CountOfSubArraysSumEqualToK.countOfSubArrays(array, length, key);
         System.out.println("Count of Sub-Arrays whose sum is equal to K is :" + count);
	}

}
