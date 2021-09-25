package com.leetcode.interview.questions;

// Moore's Voting Algo.

public class Majority_Element {
	
	public static int majorityElement(int nums[]) {
		// 7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5
		int count = 0;
		int element = 0;
		
		for(int num : nums) {
			if(count == 0) {
				element = num;
			}
			if(element == num) {
				count++;
			}
			else {
				count--;
			}
		}
		
		return element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
       int result = majorityElement(nums);
       System.out.println("Majority Element is : " + result);
	}

}
