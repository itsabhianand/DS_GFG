package com.leetcode.interview.questions;

// Refer codeBix.
// Two Pointer pattern. TC : O(n).

public class ContainerWithMostWater {
	
	// 6,4,2,5,4,6,1,3,5
	public static int findContainer(int nums[]) {
		int left = 0;
		int right = nums.length - 1;
		int max = Integer.MIN_VALUE;
		while(left < right) {
			int lh = nums[left];
			int rh = nums[right];
			int min_height = Math.min(lh, rh);
			max = Math.max(max, min_height * (right - left));
			if(rh < lh) {
				right--;
			}
			else {
				left++;
			}
			
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[] = {6,4,2,5,4,6,1,3,5};
       int length = nums.length;
       int result = findContainer(nums);
       System.out.println(result);
	}

}
