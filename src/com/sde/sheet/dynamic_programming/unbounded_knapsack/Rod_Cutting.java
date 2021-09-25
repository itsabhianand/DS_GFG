package com.sde.sheet.dynamic_programming.unbounded_knapsack;

// same code like unbounded Knapsack.

// Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n. 
// Determine the maximum value obtainable by cutting up the rod and selling the pieces. 
// For example, if length of the rod is 8 and the values of different pieces are given as following, then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)
public class Rod_Cutting {
	
	// For Top down approach , we will not use recursion. 
			public static int rodCuttingTopDown(int rodlength[], int price[], int L, int N) {
				int[][] t = new int[N + 1][L + 1];
				
				for(int i = 0; i < N + 1; i++) {
					for(int j = 0; j < L + 1; j++) {
						if(i == 0 || j == 0) { // equivalent to (n == 0 || W == 0)
							t[i][j] = 0;
						}
						
					}
				}
				
				return rodCuttingIterative(rodlength, price, L, N, t);
			}
			
			// Using Top-down DP Iterative.
			// // Clue is just replace N by i and W by j.
		    public static int rodCuttingIterative(int rodlength[], int price[], int L, int N, int t[][]) {
				
		        for(int i = 1; i < N + 1; i++) {
		        	for(int j = 1; j < L + 1; j++) {
		        		// If item in weight array to be included or not condition.
		        		if(rodlength[i-1] > j) {
		        		t[i][j] = t[i-1][j];		
		        		}
		        		else {
		        	    t[i][j] = Math.max(price[i-1] + t[i][j - rodlength[i-1]], t[i-1][j]);
		        		}
		        	}
		        }
		        return t[N][L];
			
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Taken array from GFG.
        int rodlength[] = {1,2,3,4,5,6,7,8};
        int price [] = {7,5,8,9,10,17,17,20};
        int L = 8;
        int N = rodlength.length;
        
        int maxProfit = rodCuttingTopDown(rodlength, price, L, N);
        System.out.println("Max Profit using top-down is : " + maxProfit);
	}

}
