package com.leetcode.interview.questions;

import java.util.Arrays;

public class PlusOne {
	
public static int[] plusOne(int[] nums) {
		
		for(int i=nums.length-1;i>=0;i--) {
			
			if(nums[i]<9) {
				nums[i] = nums[i] + 1;
				return nums;
			}
			else {
				nums[i]=0;
			}
		}
		
		int result [] = new int[nums.length + 1];
		result[0] = 1;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {9,8,9};
		int result[] = plusOne(nums);
		System.out.println(Arrays.toString(result));
	}

}
