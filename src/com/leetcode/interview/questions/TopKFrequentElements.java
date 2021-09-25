package com.leetcode.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int nums[] = {1,1,1,1,1,2,2,2,2,3,3,3,4,4};
         int k = 2;
        int[] res = topKFrequent(nums, k);
        System.out.println(Arrays.toString(res));
	}

	private static int[] topKFrequent(int[] nums, int k) {
		// TODO Auto-generated method stub
		List<Integer>[] bucket = new List[nums.length + 1];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		
		for(int i=0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		
		for(int key : map.keySet()) {
			int frequency = map.get(key);
			if(bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<>();
			}
			bucket[frequency].add(key);
			
		}
		
		int ans[] = new int[k];
		int count = 0;
		
		for(int i = bucket.length - 1; i>=0 ; i--) {
			if(bucket[i] != null) {
				for(int j=0; j < bucket[i].size(); j++) {
					ans[count++] = bucket[i].get(j);
				}
			}
			
			if(count == k)
				break;
		}
		
		return ans;
	}

}
