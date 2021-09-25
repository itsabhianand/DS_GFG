package com.leetcode.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nums[] = {1,2,3};
         List<List<Integer>> res = subSetsUtils(nums);
         System.out.println("Subsets are : ");
         
         Iterator<List<Integer>> itr = res.iterator();
         while(itr.hasNext()) {
       	  System.out.println("Printing each subSet value:");
       	  Iterator<Integer> itr1 = itr.next().iterator();
       	  while(itr1.hasNext()) {
       		  System.out.println(Arrays.asList(itr1.next()));
       	  }
         }
         
	}
	static List<Integer> curr = new ArrayList<Integer>();
	static List<List<Integer>> ans = new ArrayList<List<Integer>>();
	
	private static List<List<Integer>> subSetsUtils(int[] nums) {
		// TODO Auto-generated method stub
	    subSets(nums, 0, curr, ans);
	    return ans;
	}

	private static void subSets(int[] nums, int i, List<Integer> curr, List<List<Integer>> ans) {
		// TODO Auto-generated method stub
		if(i == nums.length) {
			ans.add(new ArrayList<>(curr));
			return;
		}
		
		curr.add(nums[i]);
		subSets(nums, i + 1, curr, ans);
		curr.remove(curr.size() - 1);
		subSets(nums, i+1, curr, ans);
	}

}
