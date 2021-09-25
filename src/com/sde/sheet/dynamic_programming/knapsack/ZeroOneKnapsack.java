package com.sde.sheet.dynamic_programming.knapsack;

// given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated 
// with n items respectively. Also given an integer W which represents knapsack capacity, 
// find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
public class ZeroOneKnapsack {
	
	
	public static int knapSackMemoization(int wt[], int val[], int W, int N) {
		int[][] dp = new int[N + 1][W + 1];
		
		return knapSackRecMemoization(wt, val, W, N, dp);
	}
	
	// Using recursion + Memoization
	public static int knapSackRecMemoization(int wt[], int val[], int W, int N, int dp[][]) {
		
		// Base condition (If we dont have any items or we have no capacity left in knapsack)
		if(N == 0 || W == 0) {
			return 0;
		}
		
		// Used for memoization
		if(dp[N][W] != 0) {
			return dp[N][W]; // if at any grid, -1 is not stored, just return that value.
		}
		
		// If item in weight array to be included or not condition., choice diagram logic
		if(wt[N-1] > W) {
			return dp[N][W] = knapSackRecMemoization(wt, val, W, N-1, dp);
		}
		else {
			return dp[N][W] = Math.max(val[N-1] + knapSackRecMemoization(wt, val, W - wt[N-1], N-1, dp), knapSackRecMemoization(wt, val, W, N-1, dp));
		}
	}
    
	// For Top down approach , we will not use recursion. 
	public static int knapSackTopDown(int wt[], int val[], int W, int N) {
		int[][] t = new int[N + 1][W + 1];
		
		for(int i = 0; i < N + 1; i++) {
			for(int j = 0; j < W + 1; j++) {
				if(i == 0 || j == 0) { // equivalent to (n == 0 || W == 0)
					t[i][j] = 0;
				}
				
			}
		}
		
		return knapSackTopDownIterative(wt, val, W, N, t);
	}
	
	// Using Top-down DP Iterative.
	// // Clue is just replace N by i and W by j.
    public static int knapSackTopDownIterative(int wt[], int val[], int W, int N, int t[][]) {
		
        for(int i = 1; i < N + 1; i++) {
        	for(int j = 1; j < W + 1; j++) {
        		// If item in weight array to be included or not condition.
        		if(wt[i-1] > j) {
        		t[i][j] = t[i-1][j];		
        		}
        		else {
        	    t[i][j] = Math.max(val[i-1] + t[i-1][j - wt[i-1]], t[i-1][j]);
        		}
        	}
        }
        return t[N][W];
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int wt[] = {10, 20, 30};
        int val[] = {120, 100, 50};
        int W = 50;
        int N = wt.length;
        int maxProfit = knapSackMemoization(wt, val, W, N);
        System.out.println("Max Profit using memoization is : " + maxProfit);
        int maxProfit2 = knapSackTopDown(wt, val, W, N);
        System.out.println("Max Profit using top-down is : " + maxProfit2);
	}

}
