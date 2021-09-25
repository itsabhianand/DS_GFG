package com.sde.sheet.dynamic_programming.mcm;

public class MCMMemoization {
	
	public static int mcmUtilization(int[] nums, int i, int j) {
		
		int dp[][] = new int[i+1][j+1];
		
		if(i >= j) {
			return 0;
		}
		
		if(dp[i][j] != 0) {
			return dp[i][j];
		}
		
		int min = Integer.MAX_VALUE;
		for(int k=i; k <= j-1; k++) {
			int tempanswer = mcmUtilization(nums, i , k) + mcmUtilization(nums, k+1, j) + (nums[i-1] * nums[k] * nums[j]);
			if(tempanswer < min) {
				min = tempanswer;
			}
		}
		
		return dp[i][j] = min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {40, 20, 30, 10, 30};
		 int i = 1; // because of above formula : a[i] = a[i-1] * a[i]
	     int j = nums.length - 1;
	     int result =  mcmUtilization(nums, i, j);
	     System.out.println(result);
	}

}
