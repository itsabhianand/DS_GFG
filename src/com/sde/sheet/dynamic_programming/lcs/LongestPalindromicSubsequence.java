package com.sde.sheet.dynamic_programming.lcs;

public class LongestPalindromicSubsequence {
	
	public static int lps(String a) {
		int n = a.length();
		char x[] = a.toCharArray();
		String b = reverse(x);
		char y[] = b.toCharArray();
		int m = b.length();
		int t[][] = new int[n+1][m+1];
		// Initialization
		for(int i =0 ; i < n + 1; i++) {
			for(int j=0; j< m + 1; j++) {
				if(i == 0 || j == 0) {
					t[i][j] = 0;
				}
			}
		}
		
		return lcsUtility(x, y, n , m , t);
		
	}
	
	private static int lcsUtility(char[] x, char[] y, int n, int m, int[][] t) {
		// TODO Auto-generated method stub
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < m + 1; j++) {
				if(x[i-1] == y[j-1]) {
					t[i][j] = 1 + t[i-1][j-1];
				}
				else {
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		
		return t[n][m];
	}
	
	public static String reverse(char a[]) {
		int length = a.length;
		char c[] = new char[length];
		for(int i = 0; i < length ; i++) {
			c[i] = a[length - i - 1];
		}
		
		return new String(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String x = "agbcba";
        int count  = lps(x);
        System.out.println("LPS length : " + count);
	}

}
