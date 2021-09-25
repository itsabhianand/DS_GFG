package com.leetcode.interview.questions.set2;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {1,2,2,3,1,4,2};
        int res = findDegree(nums);
        System.out.println(res);
	}

	private static int findDegree(int[] nums) {
		// TODO Auto-generated method stub
		if(nums == null || nums.length == 0) {
			return -1;
		}
		
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		Map<Integer, Integer> start = new HashMap<Integer, Integer>();
		Map<Integer, Integer> end = new HashMap<Integer, Integer>();
		
		int maxCount = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
			maxCount = Math.max(maxCount, count.get(nums[i]));
			
			if(!start.containsKey(nums[i])) {
				start.put(nums[i], i);
			}
			
			end.put(nums[i], i);
		}
		
		int result = Integer.MAX_VALUE;
		
		for(int j : count.keySet()) {
			
			if(count.get(j) == maxCount) {
				result = Math.min(result, (end.get(j) - start.get(j) + 1));
			}
		}
		
		return result;
	}

}
