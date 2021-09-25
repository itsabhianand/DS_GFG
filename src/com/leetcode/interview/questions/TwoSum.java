package com.leetcode.interview.questions;

import java.util.Arrays;
// Return indexes of Pair.
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	// TC : O(n) and SC : O(n)
	public static void twoSumHashing(int nums[], int target) {
	    if(nums == null || nums.length == 0) {
	    	System.out.println("Pair not found");
	    }
	    // 2,11,7,15
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i < nums.length; i++) {
	    	int compliment = target - nums[i];
	    	if(map.containsKey(compliment)) {
	    		System.out.println("Pairs found : " + " " + map.get(compliment) + " " + i);
	    	}
	    	map.put(nums[i], i);
	    }
	    
	}
	
	// This will just find pairs but will not return correct index of original Array.
	public static void twoSumSortTwoPointers(int nums[], int target) {
		Arrays.sort(nums); // 2,7,11,15
		
		int left = 0;
		int right = nums.length - 1;
		while(left < right) {
			if(nums[left] + nums[right] == target) {
				System.out.println("Pairs found is : " + " " +left + " " + right);
				left++;
				right--;
			}
			else if(nums[left] + nums[right] < target) {
				left++;
			}
			else {
				right--;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int nums[] = {2,11,7,15};
      int target = 9;
      twoSumHashing(nums, target);
      twoSumSortTwoPointers(nums, target);
	}

}
