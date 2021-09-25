package com.dsa.sheet.array2;

import java.util.Arrays;

// refer take u forward video

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubSequence {
	
	// 102,4,100,1,101,3,2
	private static void findLongestSubsequenceByHashing(int[] nums) {

		Set<Integer> set = new HashSet<>();
		int sequenceCount = 1, currentCount=1;

		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}

		for(int i=0;i<nums.length;i++) {

			boolean flag = true;
			int temp = nums[i]+1;
			while(flag) {

				if(set.contains(temp)) {
					currentCount++;
					temp++;
				}
				else
					flag = false;
			}
			sequenceCount = Math.max(currentCount, sequenceCount);
			currentCount=1;
		}
		System.out.println(sequenceCount);
	}
	
	private static void findLongestSubsequenceBySorting(int[] nums) {
      
		// 1,2,3,4,100,101,102.
		Arrays.sort(nums);
		int sequenceCount = 1, currentCount=1;


		for(int i=0;i<nums.length-1;i++) {

			if(nums[i+1] - nums[i] == 1) {
				currentCount++;
			}
			else
				currentCount=1;
			sequenceCount = Math.max(sequenceCount, currentCount);
		}
		System.out.println("Longest consecutive sub-seq is :" + sequenceCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {102,4,100,1,101,3,2};
		int length = array.length;
		findLongestSubsequenceByHashing(array);
		findLongestSubsequenceBySorting(array);
	}

}
