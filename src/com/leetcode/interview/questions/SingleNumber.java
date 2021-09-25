package com.leetcode.interview.questions;

public class SingleNumber {
     
	public static int findSingleNumber(int nums[]) {
		
		if(nums == null || nums.length == 0) {
			return -1;
		}
		
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {1,2,1,2,4};
        int res = findSingleNumber(nums);
        System.out.println(res);
	}

}
