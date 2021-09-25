package com.leetcode.interview.questions.set2;

// Refer Prakash shukla
public class MaximumSumSquareSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
		        {1, 1, 1, 1, 1},
		        {2, 2, 2, 2, 2},
		        {3, 8, 6, 7, 3},
		        {4, 4, 4, 4, 4},
		        {5, 5, 5, 5, 5}
		       };
		
		int b = 3;
		int res = findMaximumSum(a, b);
		System.out.println(res);
	}

	private static int findMaximumSum(int[][] a, int b) {
		// TODO Auto-generated method stub
		int row = a.length;
		int col = a[0].length;
		
		int maxSum = Integer.MIN_VALUE;
		
		int dp[][] = new int[row + 1][col + 1];
		
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[0].length; j++) {
				
				dp[i][j] = a[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
			}
		}
		
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[0].length; j++) {
				
				int sum = Integer.MIN_VALUE;
				if(i-b >= 0 && j-b >= 0) {
					sum = dp[i][j] - dp[i-b][j] - dp[i][j-b] + dp[i-b][j-b];
					maxSum = Math.max(sum, maxSum);
				}
				
			}
		}
		
		return maxSum;
	}
}
