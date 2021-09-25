package com.leetcode.interview.questions;

import java.util.Arrays;

public class MoveZeroes {
	
	private static void moveZerosToOneEnd(int[] nums) {
       // 1,2,1,0,5,3,0
		int anchor = 0;
		int explorer = 0;
		
		while(explorer<nums.length) {
			
			if(nums[explorer]!=0) {
				int temp = nums[explorer];
			nums[explorer] = nums[anchor];
			nums[anchor] = temp;
			
			anchor++;
			explorer++;
			}
			else 
				explorer++;
				
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums [] = {1,2,1,0,5,3,0};
		moveZerosToOneEnd(nums);
	}

}
