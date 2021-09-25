package com.sde.sheet.dynamic_programming.lcs;

// This will return length of longest common sub-sequence.
public class LongestCommonSubSequenceMemoized {
	
	public static int lcs(String a, String b, int n, int m) {
		int dp[][] = new int[n+1][m+1];

		 char x[] = a.toCharArray();
		 char y[] = b.toCharArray();
		return lcsUtility(x, y, n,m, dp);
		
	}
	
	
	public static int lcsUtility(char x[], char y[], int n, int m, int dp[][]) {
		    // Base condition check.
			if(n == 0 || m == 0) {
				return 0;
			}
			
			// Memoized code
			if(dp[n][m] != 0) {
				return dp[n][m];
			}
		    // choice diagram code
		  else {
				if(x[n-1] == y[m-1]) {
					return dp[n][m] = 1 + lcsUtility(x, y, n-1, m-1, dp);
				}
				else {
					return dp[n][m] = Math.max(lcsUtility(x,y,n, m-1, dp), lcsUtility(x,y,n-1, m, dp));
				}
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a = "abcdgh";
       String b = "abedfhr";
       int n = a.length();
       int m = b.length();
       int count  = lcs(a,b,n,m);
       System.out.println("Longest common sub-sequence is : " + count);
	}

}
