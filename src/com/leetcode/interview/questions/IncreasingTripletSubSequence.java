package com.leetcode.interview.questions;

// If we have multiple such triplets sub-sequence, print any one of them.
// Given an array of n integers, find the 3 elements such that a[i] < a[j] < a[k] and i < j < k in 0(n) time. 
// If there are multiple such triplets, then print any one of them.
public class IncreasingTripletSubSequence {
	
	public static void increasingTriplet(int nums[]) {
		int f = Integer.MAX_VALUE;
		int s = Integer.MAX_VALUE;
		int i;
		// 5, 7, 4, 8
		for(i = 0; i < nums.length; i++) {
			if(nums[i] <= f) {
				f = nums[i];
			}
			else if(nums[i] <= s) {
				s = nums[i];
			}
			else {
				break;
			}
		}
		
		   if (i == nums.length)
	       {
	           System.out.print("No such triplet found");
	           return;
	       }
		
		 for (int j = 0; j <= i; j++)
	        {
	            if (nums[j] < s)
	            {
	                f = nums[j];
	                System.out.print(f+" "+s+" "+ nums[i]);
	                break;
	            }
	        }
	      
	       
	        return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5, 7, 4, 8};
		//int nums1[] = {1, 2, 3, 4};
		increasingTriplet(nums);
	}

}
