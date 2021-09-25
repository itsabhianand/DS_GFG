package com.leetcode.interview.questions;

import java.util.Arrays;

public class SingleNumberII {
	
	public static int findSingleNumberII(int nums[]) {
		
		if(nums == null || nums.length == 0) {
			return -1;
		}
		
		int res = 0;
		Arrays.sort(nums);
		// If first element after sorting is single Number.
		if(nums[0] != nums[1]) {
			return nums[0];
		}
		// If last element after sorting is single Number.
		if(nums[nums.length - 1] != nums[nums.length - 2]) {
			return nums[nums.length - 1];
		}
		
		// If single number is present in between.
		int i = 1;
		while(i < nums.length) {
			if(nums[i-1] == nums[i]) {
				i = i + 3;
			}
			else {
				res = nums[i-1];
				break;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {2,2,4,2,3,4,4};
        int res = findSingleNumberII(nums);
        System.out.println(res);
	}

}
