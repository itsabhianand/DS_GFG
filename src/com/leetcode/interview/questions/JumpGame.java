package com.leetcode.interview.questions;

// 
public class JumpGame {
	
	public static boolean jumpGame(int nums[]) {
		int maxreachable = 0;
		boolean flag = true;
		
		for(int i =0; i < nums.length; i++) {
			if(i > maxreachable) {
				flag = false;
			}
			maxreachable =  Math.max(maxreachable, i + nums[i]);
			if(maxreachable >= nums.length - 1)
				flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[] = {1,1,2,5,2,7,0,0,1,3};
       
       int nums1[] = {1,1,2,3,2,1,0,0,1,3}; // This is when i > reachable in above code.
       boolean result = jumpGame(nums);
       System.out.println(result);
	}

}
