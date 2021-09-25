package com.dsa.sheet.array2;

// Given an array of size n and a number k, fin all elements that appear more than " n/k " times.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NperKTimes {
	
	
	private static void findOccurenceByHashing(int[] nums, int k) {

		int number = nums.length/k;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i])+1);
			else
				map.put(nums[i], 1);
		}
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>number)
				System.out.print(entry.getKey()+" ");
		}
	}
	
	private static void findOccurenceBySorting(int[] nums, int k) {
		Arrays.sort(nums);
		int currentCount=1;
		int number = nums.length/k;
		boolean flag = true;
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i] == nums[i+1])
				currentCount++;
			else {
				currentCount=1;
			    flag = true;
			}
			if(currentCount>number && flag){
				System.out.print(nums[i]+" ");
				flag = false;
			}
			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,1,2,2,1,2,3,3,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,4}; // 16
		findOccurenceByHashing(nums,4); // k = 4 --> 16/4 = 4
		System.out.println();
		findOccurenceBySorting(nums,4);
	}

}
