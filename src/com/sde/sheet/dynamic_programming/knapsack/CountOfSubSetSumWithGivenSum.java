package com.sde.sheet.dynamic_programming.knapsack;


// Return count of Subsets whose sum is equal to a given value.

public class CountOfSubSetSumWithGivenSum {
	
	
	public static int countSubsetSum(int array[], int N, int sum) {
		
		int[][] t = new int[N + 1][sum + 1];
		
		// initialization part
		for(int i = 0; i < N + 1 ; i++) {
			for(int j = 0; j < sum + 1; j++) {
				if(i == 0) {
					t[i][j] = 0; // It means if there is no element in an array and we want any sum then for except j ==0(sum == 0) and i == 0 . everything for given i == 0 will be false.
				}
				if(j == 0) {
					t[i][j] = 1;
				}
			}
		}
		
		for(int i = 1; i < N + 1; i++) {
			for(int j = 1 ; j < sum + 1; j++) {
				if(array[ i - 1 ] > j) {
					t[i][j] = t[i - 1][j];
				}
				else {
					t[i][j] = t[i - 1][j - array[i - 1]] + t[i - 1][j];
				}
			}
		}
		
		return t[N][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int nums[]  = {2,3,5,6,8,10};
      int N = nums.length;
      int sum = 10;
      int count = countSubsetSum(nums, N, sum);
      System.out.println(count);
	}

}
