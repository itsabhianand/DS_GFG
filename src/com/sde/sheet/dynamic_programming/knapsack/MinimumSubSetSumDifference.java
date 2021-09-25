package com.sde.sheet.dynamic_programming.knapsack;

// Here we have to find S2 - S1 ---> Minimum value where S2 and S1 is sum of two different subsets.
// We assumed S1 is smaller than S2 so we will search S1 in lefthand side.

import java.util.ArrayList;
import java.util.List;

public class MinimumSubSetSumDifference {
	
	public static int minimumSubsetSum(int nums[], int N) {
		// We find sum of whole nums[]
		int sum = 0;
		for(int i = 0; i<N; i++) {
			sum = sum + nums[i];
		}
		
		boolean[][] t = new boolean[N + 1][sum + 1];
		List<Integer> list = new ArrayList<Integer>();
		
		// initialization part just like subset sum
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
		
		// same code logic like subset sum
		for(int i = 1; i < N + 1; i++) {
			for(int j = 1 ; j < sum + 1; j++) {
				if(nums[ i - 1 ] > j) {
					t[i][j] = t[i - 1][j];
				}
				else {
					t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j];
				}
			}
		}
		
		// Extra piece of code.
		// Since, we assumed S1 is smaller so we traversed till sum/2.
		int min = Integer.MAX_VALUE;
			for(int j = 0 ; j <=sum/2; j++) {
					if(t[N][j] == true) {
						list.add(j); // whichever value is true, just add in list.(True value means that sum is possible through subsets of nums[]).
					}
				}
		
		for(int i =0 ; i < list.size(); i++) {
			min = Math.min(min, sum - 2 * (Integer)list.get(i)); // S2 + S1 = sum ----> S2 = sum - S1 -----> So we need to find S2 - S1 ---> sum -S1 -S1 ----> sum -2*S1.
		}
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[] = {1, 6, 11, 5};
       int N = nums.length;
       int result = minimumSubsetSum(nums , N);
       System.out.println(result);
	}

}
