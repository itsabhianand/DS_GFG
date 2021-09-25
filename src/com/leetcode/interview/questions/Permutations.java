package com.leetcode.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3};
        List<List<Integer>> res = permutationUtils(nums);
        System.out.println("Permutations are : ");
        
        Iterator<List<Integer>> itr = res.iterator();
        while(itr.hasNext()) {
      	  System.out.println("Printing each Permutation value:");
      	  Iterator<Integer> itr1 = itr.next().iterator();
      	  while(itr1.hasNext()) {
      		  System.out.println(Arrays.asList(itr1.next()));
      	  }
        }
	}
     
	static List<Integer> curr = new ArrayList<Integer>();
	static List<List<Integer>> ans = new ArrayList<List<Integer>>();
	
	private static List<List<Integer>> permutationUtils(int[] nums) {
		// TODO Auto-generated method stub
		boolean[] visited = new boolean[nums.length];
		permutations(nums, 0, curr, ans, visited);
		return ans;
	}

	private static void permutations(int[] nums, int i, List<Integer> curr, List<List<Integer>> ans,
			boolean[] visited) {
		// TODO Auto-generated method stub
		if(i == nums.length) {
			ans.add(new ArrayList<Integer>(curr));
			return;
		}
		
		for(int j=0; j < nums.length; j++) {
			if(visited[j] == true)
				continue;
			
			curr.add(nums[j]);
			visited[j] = true;
			permutations(nums, i+1, curr, ans, visited);
			curr.remove(curr.size() - 1);
			visited[j] = false;
		}
	}

}
