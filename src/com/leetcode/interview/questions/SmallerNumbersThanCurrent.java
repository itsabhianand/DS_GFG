package com.leetcode.interview.questions;

import java.util.Arrays;
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/discuss/641884/Java-O(n)-1ms-less-memory-than-100-explained
public class SmallerNumbersThanCurrent {
	
	//  int nums[] = {8,1,2,2,3};
	public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck = new int[101];
        
        for(int i = 0; i < nums.length; i++) {
        	buck[nums[i]] = buck[nums[i]] + 1;
        	/*
        	 * buck[i] = 0 1 2 1 0 0 0 0 1 0 0 0 0 0 0 0
               index:    0,1,2,3,4,5,6,7,8 9 10  
        	 * 
        	 * */
        }
        
        for(int j = 1; j < buck.length; j++) {
        	buck[j] = buck[j] + buck[j-1];
        	/* buck[i] earlier = 0 1 2 1 0 0 0 0 1 0 0 0 0 0 0 0
        	 * index:            0,1,2,3,4,5,6,7,8 9 10 
        	 * buck[j] now =     0,1,3,4,4,4,4,4,5 5 5 5 5 5 5 5
        	 * 
        	 * */
        }
        
        for(int k = 0; k < nums.length; k++) {
        	int pos = nums[k];
        	nums[k] = pos == 0 ? 0 : buck[pos-1];
        }
        
        return nums;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int nums[] = {8,1,2,2,3};
      int result[] = smallerNumbersThanCurrent(nums);
      System.out.println(Arrays.toString(result));
	}

}
