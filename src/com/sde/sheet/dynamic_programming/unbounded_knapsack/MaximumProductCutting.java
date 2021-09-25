package com.sde.sheet.dynamic_programming.unbounded_knapsack;

// Given a rope of length n meters, cut the rope in different parts of integer lengths in a way that maximizes product of lengths of all parts. 
// Assume that the length of rope is more than 2 meters.
// We can assume that the rod of length 'i' has price 'i' associated with it.

// Not unbounded type, just placed here
public class MaximumProductCutting {
	
	 public static int findMaxProfit(int n)
	    {
	        // `T[i]` stores the maximum profit achieved from the rod of length `i`.
	        int[] T = new int[n + 1];
	 
	        // A rod of length `i` has at least cost `i`
	        for (int i = 0; i <= n; i++) { // Making array of 1 to n.
	            T[i] = i;
	        }
	 
	        // consider rod of length `i`
	        for (int i = 2; i <= n; i++) // Because rod of length 0(no rod) will have profit 0 and rod of length 1 will have only 1 possible case because we can't cut it further.
	        {
	            // divide the rod of length `i` into two rods of length `j`
	            // and `i-j` each and take maximum
	        	
	            for (int j = 0; j < i; j++) {
	                T[i] = Math.max(T[i], j * T[i - j]);
	            }
	        }
	 
	        // `T[n]` stores the maximum profit achieved from the rod of length `n`
	        return T[n];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 3;
       System.out.println("The maximum profit is " + findMaxProfit(n));
	}

}
