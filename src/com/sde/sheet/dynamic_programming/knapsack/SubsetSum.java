package com.sde.sheet.dynamic_programming.knapsack;

// This will return true/false if subset exists in an array with given sum.
public class SubsetSum {
	
	public static boolean findSubsetSum(int array[], int N, int sum) {
		
		boolean[][] t = new boolean[N + 1][sum + 1];
		
		// initialization part
		for(int i = 0; i < N + 1 ; i++) {
			for(int j = 0; j < sum + 1; j++) {
				if(i == 0) {
					t[i][j] = false; // It means if there is no element in an array and we want any sum then for except j ==0(sum == 0) and i == 0 . everything for given i == 0 will be false.
				}
				if(j == 0) {
					t[i][j] = true;
				}
			}
		}
		
		for(int i = 1; i < N + 1; i++) {
			for(int j = 1 ; j < sum + 1; j++) {
				if(array[ i - 1 ] > j) {
					t[i][j] = t[i - 1][j];
				}
				else {
					t[i][j] = t[i - 1][j - array[i - 1]] || t[i - 1][j];
				}
			}
		}
		
		return t[N][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int array[] = {2,3,7,8,10};
         int N = array.length;
         int sum = 11;
         boolean result = findSubsetSum(array, N, sum);
         System.out.println("Subset found is : " + result);
	}

}
