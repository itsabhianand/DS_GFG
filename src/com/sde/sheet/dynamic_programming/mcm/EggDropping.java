package com.sde.sheet.dynamic_programming.mcm;

public class EggDropping {
	
	public static int eggDropping(int e, int f) {
		
		int low = 0;
		int high = 0;
		int dp[][] = new int[e + 1][f + 1];
		
		if(f == 0 || f == 1) {
			return f;
		}
		
		if(e == 1) {
			return f;
		}
		
		if(dp[e][f] != 0) {
			return dp[e][f];
		}
		int min= Integer.MAX_VALUE;
		// Optimized memoization for sub-Recursive call just like above.
		for(int k = 1; k<=f; k++) {
			if(dp[e-1][k-1] != 0) {
			    low = dp[e-1][k-1];
			}
			else {
				low = eggDropping(e-1, k-1);
				dp[e-1][k-1] = low;
			}
			
			if(dp[e][f-k] != 0) {
				high = dp[e][f-k];
			}
			
			else {
				high = eggDropping(e, f-k);
				dp[e][f-k] = high;
			}
			
			int temp = 1 + Math.max(low, high); // worst case so we have taken max.
			
			 min = Math.min(min, temp);
		}
		
		return dp[e][f] = min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int eggs = 2;
        int floor = 10;
        int result = eggDropping(eggs, floor);
        System.out.println(result);
	}

}
