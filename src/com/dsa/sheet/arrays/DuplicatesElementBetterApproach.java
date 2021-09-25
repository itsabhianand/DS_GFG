package com.dsa.sheet.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicatesElementBetterApproach {

		/* This solution is only for the array having elements as N + 1 integers 
		 * where N is the length of an array
		 * */

     private static void findDuplicatesByIndexing(int[] nums) {
        // {2,3,1,6,7,8,6,6,3,13,6,13,7,13,13}
    	 int repeat = 0;
 		for(int i=0; i < nums.length; i++) {
 			if(nums[Math.abs(nums[i]) - 1] < 0) {
 				repeat = Math.abs(nums[i]);
 			}
 			else {
 				nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
 			}
 		}
 		System.out.println("The duplicate number is : "+repeat);
		}
    // will give wrong o/p if element occurred more than 2 times.
	private static void findDuplicatesBySorting(int[] nums) {
			Arrays.sort(nums);
			int count=0;
			for(int i=0;i<nums.length-1;i++) {
				if(nums[i] == nums[i+1] && count<1) {
					System.out.print(nums[i]+" ");
					count++;
				}
				else
					count=0;
			}
		}

		/*
		 * This is a generic solution to find duplicates without any restrictions on array/elements
		 * 
		 */
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,1,6,7,8,6,6,3,13,6,13,7,13,13};
		int nums1[] = {1,2,2,4,5};
	    findDuplicatesBySorting(nums);
		System.out.println();
		findDuplicatesByHashing(nums);
		System.out.println();
		findDuplicatesByIndexing(nums1);
	}

}
