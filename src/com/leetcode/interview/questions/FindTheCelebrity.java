package com.leetcode.interview.questions;

// Refer pepcoding.
import java.util.Stack;

public class FindTheCelebrity {
	
	public static void findCeleb(int nums[][]) {
		
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i < nums.length; i++) {
			s.push(i);
		}
		
		while(s.size() >= 2) {
			int i = s.pop();
			int j = s.pop();
			
			if(nums[i][j] == 1) { // means i know j ---> i cannot be celebrity
				s.push(j);
			}
			else { // means j is not known by i ----> j is not celebrity.
				s.push(i);
			}
		}
		
		int pot = s.pop();
		
		for(int i = 0; i < nums.length; i++) {
			if(i != pot) {
				if(nums[i][pot] == 0 || nums[pot][i] == 1) {
					System.out.println("No celebrity");
					return;
				}
			}
		}
		
		System.out.println("Celebrity found is : " + pot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int nums[][] = { { 0, 0, 1, 0 },
                           { 0, 0, 1, 0 },
                           { 0, 0, 0, 0 },
                           { 0, 0, 1, 0 } }; 
		  
		  findCeleb(nums);
	}

}
