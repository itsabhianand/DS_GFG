package com.leetcode.interview.questions;

public class KthMissingPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int nums[] = {2,3,4,7,11};
         int k = 1;
         int res = KthMissingPositiveNumberUtility(nums, k);
         System.out.println(res);
	}

	private static int KthMissingPositiveNumberUtility(int[] nums, int k) {
		// TODO Auto-generated method stub
		if(nums == null || nums.length == 0) {
			return -1;
		}
		
		int n = nums.length;
		int left = 0;
		int right = n - 1;
		
		while(left <= right) {
			int mid = (left + (right - left)/2);
			
			 int missing = computeMissing(nums[mid], mid + 1);
			if(missing >= k ) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
			
		}
		
		if(right == -1) // when nums is {2,3}
			return k;
		
		return nums[right] + (k - computeMissing(nums[right], right + 1));
	}
	private static int computeMissing(int actual, int expected) {
		// TODO Auto-generated method stub
		return actual - expected;
	}

}
