package com.leetcode.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
	
	private static void findDuplicatesByHashing(int[] nums) {

		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {

			int i = (int) entry.getValue();
			if(i > 1)
				System.out.print(entry.getKey()+" ");
		}
	}
    
	private static void findDuplicatesByIndexing(int[] nums) {
        // {2,3,1,6,7,8,6,6,3,13,6,13,7,13,13}
			int n = nums.length;
			for(int i=0;i<n;i++) {
				nums[nums[i]%n] = nums[nums[i]%n] + n;
			}
			for(int i=0;i<n;i++) {
				if(nums[i]/n>1)
					System.out.print(i+" ");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = {2,3,1,6,7,8,6,6,3,13,6,13,7,13,13};
		int nums[] = {3,1,5,2,3};
		findDuplicatesByHashing(nums);
		System.out.println();
		findDuplicatesByIndexing(nums);
	}

}
