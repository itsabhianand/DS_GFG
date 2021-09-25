package com.leetcode.interview.questions;

// codebix
//Recursion + memoize. 
public class ClimbingStairs {
	
	public static int climbStairs(int n) {
		
		int dp[] = new int[n+1];
		if(n<=2) {
			return n;
		}
		if(n == 3) {
			return n + 1;
		}
		if(dp[n] != 0)
			return dp[n];
		
		 dp[n] =  climbStairs(n-1) + climbStairs(n-2) + climbStairs(n-3);
		 return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 4; // 1+1+1+1, 2+2, 1+1+2, 1+2+1, 2+1+1, 1+3, 3+1
        int stairs  = climbStairs(n);
        System.out.println(stairs);
	}

}
