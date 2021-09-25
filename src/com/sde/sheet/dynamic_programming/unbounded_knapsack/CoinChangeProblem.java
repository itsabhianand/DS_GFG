package com.sde.sheet.dynamic_programming.unbounded_knapsack;

// Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins. 
// how many ways can we make the change? The order of coins doesn’t matter

public class CoinChangeProblem {
	
	public static int coinChange(int coins[], int sum) {
		int N = coins.length;
		int t[][] = new int[N + 1][sum + 1];
		
		// Initialization : make sure to initialize 1 for i == 0 and j == 0 and if j == 0
		for(int i = 0; i < N + 1; i++) {
			for(int j = 0; j < sum + 1; j++) {
				if(i == 0 && j == 0) {
					t[i][j] = 1;
				}
				else if(i == 0) {
					t[i][j] = 0;
				}
				else if(j == 0) {
					t[i][j] = 1;
				}
			}
		}
		
		return coinChangeIterativeBottomUp(coins, sum, N, t);
	}
	
	public static int coinChangeIterativeBottomUp(int coins[], int sum, int N, int t[][]) {
		for(int i = 1; i < N + 1; i++) {
			for(int j = 1; j < sum + 1; j++) {
				if(coins[i - 1] > j) {
					t[i][j] = t[i-1][j];
				}
				
				else {
					t[i][j] = t[i-1][j] + t[i][j - coins[i-1]];
				}
			}
		}
		
		return t[N][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int coins[] = {1,2,3};
        int sum = 4;
        int result = coinChange(coins, sum);
        System.out.println("No of ways : " + result);
        // Possible ways :  {1,1,1,1},{1,1,2},{2,2},{1,3}
	}

}
