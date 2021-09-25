package com.sde.sheet.dynamic_programming.knapsack;


// Find if an array can be divided into 2 subsets such that their sum is equal. Return true if possible else false.
public class EqualSumPartition {
	
	public static boolean checkEqualPartition(int nums[]) {
		int length = nums.length;
		int sum = 0;
		for(int i = 0; i < length; i++) {
			sum = sum + nums[i];
		}
		
		if(sum % 2 != 0) {
			return false;
		}
		else {
			return findSubsetSum(nums, length, sum/2);
		}
	}
   
	
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
         int nums[] = {1,5,11,5};
         boolean result = checkEqualPartition(nums);
         if(result) {
        	 System.out.println("Yes, Equal Partition exists");
         }
         else {
        	 System.out.println("No, equal Partition does not exists");
         }
	}

}
