package com.sde.sheet.dynamic_programming.mcm;

// Length of Matrix is : A[i] = A[i-1] * A[i]
// return the minimum number of multiplications needed to multiply the chain. 

public class MCMRecursive {
	
	public static int mcmRecursive(int[] nums, int i, int j) {
		if(i >= j) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		for(int k=i; k <= j-1; k++) {
			int tempanswer = mcmRecursive(nums, i , k) + mcmRecursive(nums, k+1, j) + (nums[i-1] * nums[k] * nums[j]);
			if(tempanswer < min) {
				min = tempanswer;
			}
		}
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {40, 20, 30, 10, 30};
       int i = 1; // because of above formula : a[i] = a[i-1] * a[i]
       int j = nums.length - 1;
       int result =  mcmRecursive(nums, i, j);
       System.out.println(result);
	}

}
