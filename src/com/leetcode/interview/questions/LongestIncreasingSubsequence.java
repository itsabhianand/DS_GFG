package com.leetcode.interview.questions;

public class LongestIncreasingSubsequence {
	
	public static int LCS(int nums[]) {
		int dp[] = new int[nums.length + 1];
 		return lcsHelper(-1,0,nums, dp);
	}

	private static int lcsHelper(int prev, int curr, int[] nums, int dp[]) {
		// TODO Auto-generated method stub
		int n = nums.length;
		if(curr == nums.length)
			return 0;
		if(dp[curr] != 0) {
			return dp[curr];
		}
		int opt1 = 0;
		
	    if(prev == -1 || nums[prev] < nums[curr]) {
	    	opt1 =  1 + lcsHelper(curr, curr + 1, nums, dp);
	    }
	    int opt2 = lcsHelper(prev, curr + 1, nums, dp);
		
		dp[n] =  Math.max(opt1, opt2);
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {1,2,9,3,4,5,6};
        int count = LCS(nums);
        System.out.println(count);
	}

}
