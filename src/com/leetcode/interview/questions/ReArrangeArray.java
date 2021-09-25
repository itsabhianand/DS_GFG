package com.leetcode.interview.questions;

import java.util.Arrays;

public class ReArrangeArray {
	
	public static void rearrangeArrays(int nums[]) {
		for(int i = 0; i < nums.length ;) {
			if(nums[i] >= 0 && nums[i] != i) {
				int temp = nums[nums[i]];
				nums[nums[i]] = nums[i];
				nums[i] = temp;
			}
			else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
       rearrangeArrays(nums);
	}

}
