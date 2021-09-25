package com.leetcode.interview.questions;

import java.util.Arrays;

public class FindDigitsSumWithoutLoops {
	
	public static void findSumUtil(int [] nums) {
		int i = 0;
		int j = nums.length - 1;
		int result[] = findSum(nums, i, j);
		System.out.println(Arrays.toString(result));
	}
     
	public static int[] findSum(int []nums, int i, int j) {
		if(i > j) {
			return nums;
		}
		int sum = 0;
		while(nums[i]%10 != 0 || nums[i] != 0) {
			sum = sum +  nums[i]%10;
			nums[i] = nums[i]/10;
		}
		nums[i] = sum;
		return findSum(nums, ++i, j);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int nums[] = {23,56,78,102, 999};
      findSumUtil(nums);
	}

}
