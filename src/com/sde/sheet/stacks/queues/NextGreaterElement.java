package com.sde.sheet.stacks.queues;

import java.util.Stack;

public class NextGreaterElement {
	
	// 12,17,14,11,13
	public static void nextGreaterElement(int nums[]) {
		Stack<Integer> s = new Stack<Integer>();
		int result[] = new int[nums.length];
		
		for(int i = nums.length - 1; i >= 0; i--) {
			while(!s.isEmpty() && nums[i] > s.peek()) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				result[i] = -1;
			}
			else {
				result[i] = s.peek();
			}
			
			s.push(nums[i]);
		}
		
		System.out.println("Resultant Array is : ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums [] = {12,17,14,11,13};
       NextGreaterElement.nextGreaterElement(nums);
	}

}
