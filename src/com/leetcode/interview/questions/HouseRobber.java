package com.leetcode.interview.questions;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nums[] = {5,10,2,15,20};
         int result = maxAmountMoney(nums);
         System.out.println(result);
	}

	private static int maxAmountMoney(int[] nums) {
		// TODO Auto-generated method stub
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		int dp[] = new int[nums.length + 1];
		return houseRobberUtil(nums, 0, dp);
	}

	private static int houseRobberUtil(int[] nums, int curr, int[] dp) {
		// TODO Auto-generated method stub
		if(curr >= nums.length)
			return 0;
		
		if(dp[curr] != 0)
			return dp[curr];
		
		int stealHouse = nums[curr] + houseRobberUtil(nums, curr + 2, dp);
		int skipHouse = houseRobberUtil(nums, curr + 1, dp);
		
		dp[curr] = Math.max(stealHouse, skipHouse);
		
		return dp[curr];
		
	}

}
