package com.leetcode.interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	private static void containsDuplicateUsingSorting(int[] nums) {
      // 2,1,3,4,5,3,2,1,5
		Arrays.sort(nums);// [1, 1, 2, 2, 3, 3, 4, 5, 5]
		
		for(int i=0;i<nums.length;i++) {
			
			if(i+1 < nums.length && nums[i] == nums[i+1]) {
				System.out.println("Sorting --> Array contains duplicate elements");
				break;
			}
		}
	}
	
	private static void containsDuplicateUsingHash(int[] nums) {
       // 2,1,3,4,5,3,2,1,5
		Set<Integer> set = new HashSet<>();
		
		for(int i : nums) {
			
			if(set.contains(i)) {
				System.out.println("Hashing --> Array contains duplicate elements");
				break;
			}
			set.add(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] nums = {2,1,3,4,5,3,2,1,5};
		
		containsDuplicateUsingHash(nums);
		containsDuplicateUsingSorting(nums);
	}

}
