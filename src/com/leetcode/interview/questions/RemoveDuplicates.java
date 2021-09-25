package com.leetcode.interview.questions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	

	/*
	 * This could be used for both sorted and unsorted array
	 *  
	 * TC : O(N)
	 * SC : O(N)
	 */
	private static int removeDuplicates(int[] nums) {
       // 7,1,2,3,5,2,5,2,3
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		int j=0;
		for(int i : set) {
			nums[j] = i;
			j++;
		}
		return set.size();
	}
	
	// 7,1,2,3,5,2,5,2,3 -- 1, 2, 2, 2, 3, 3, 5, 5, 7
	
		/*
		 * This could be efficiently used for sorted array
		 * TC : O(N) SC : 1
		 * for unsorted, we will first sort and compare but it will change the 
		 * order of the elements
		 * 
		 * */
		public static int removeDuplicatesUsingTwoPointers(int[] nums) {
			
			Arrays.sort(nums);
			int i=0;
			int j=0;
			while(i<nums.length-1) {
				
				if(nums[i]!=nums[i+1]) {
					nums[j] = nums[i];
					j++;
					
				}
				i++;
			}
			nums[j] = nums[nums.length-1];
			
			System.out.println("The Array is : "+Arrays.toString(nums));
			System.out.println("The Size is : "+(j+1));
			return j;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {7,1,2,3,5,2,5,2,3};
		int length = nums.length;
		int size = removeDuplicates(nums);
		System.out.println("Size using hashing is : " + size);
		removeDuplicatesUsingTwoPointers(nums);
	}

}
