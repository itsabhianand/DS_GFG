package com.sde.sheet.dynamic_programming.lcs;

public class LongestCommonSubSequenceTopDown {
	
	public static int lcs(String a, String b, int n , int m) {
		int t[][] = new int[n+1][m+1];
		
		// Initialization
		for(int i = 0; i < n + 1; i++) {
			for(int j =0 ; j < m + 1; j++) {
				if(i == 0 || j == 0) {
					t[i][j] = 0;
				}
			}
		}
		
		char x[] = a.toCharArray();
		char y[] = b.toCharArray();
		
		return lcsUtility(x, y, n, m, t);
	}
   
	public static int lcsUtility(char x[], char y[], int n, int m, int t[][]) {
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < m + 1; j++) {
				if(x[i-1] == y[j-1]) {
					t[i][j] =  1 + t[i-1][j-1];
				}
				else {
					t[i][j] =  Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		
		return t[n][m];
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
