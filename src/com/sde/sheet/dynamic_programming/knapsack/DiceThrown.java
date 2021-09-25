package com.sde.sheet.dynamic_programming.knapsack;

// Refer Kashish Mehndiratta
// Bottom-Up Approach

// Find no of ways n dice can be rolled such that sum of their face values is equal to a given Sum : x.
public class DiceThrown {
	
	
    // f : faces on each dice.
	// d : Number of dices.
	// x : Total sum (target)
	// For recursive we have : Summation of func(d - 1, target - k) from k = 1 to k = f
	public static int findWays(int f, int d, int x) {
		int dp[][] = new int[d + 1][x + 1];
		
		for(int i = 0; i < d + 1; i++) {
			for(int j = 0; j < x + 1; j++) {
				if(i == 0 && j == 0) { // same like base condition (d == 0 && target(x) == 0)
					 dp[i][j] = 1;       
				}
				else if(i == 0 || j == 0) { 
					dp[i][j] = 0;
				}
				
			}
		}
		
		for(int i = 1; i <= f && i <= x; i++) // Initialization for one dice having f faces.
            dp[1][i] = 1;
		 
		  for(int i = 2; i < d + 1; i++) { // so, Initialized i from 2 as above already initialized.
			  for(int j =1 ; j < x + 1; j++) {
				  int count = 0;
					for(int k = 1; k <=f && k < j ; k++) { // This loop is for all values of faces of a dice.
						count = count + dp[i - 1][j - k];
						dp[i][j] = count;
					}
					
				}
		}
		
		return dp[d][x];
	}
	
	// Top-Down
	static int t[][] = new int[4][7];
	public static int diceUtil(int f, int d, int s) {
		
		return diceThrown(f,d,s,t);
	}
	public static int diceThrown(int f,int d,int s, int[][] t){
		
		   if(d == 0 && s == 0)
		     return 1;
		    
		   if(d == 0 || s <= 0)
		      return 0;
			  
		   if(t[d][s] != 0)
		      return t[d][s];
			  
		    int count = 0;
			
			for(int i=1; i <= f; i++){
			  count = count + diceThrown(f,d-1,s-i,t); 
			}
			return t[d][s] = count;
		}
	
	public static void main(String args[]) {
		//int count = findWays(3,3,4);
		int count1 = diceUtil(3,3,4);
		System.out.println(count1);
		//System.out.println("Total number of ways : " + count);
	}
}
