package com.dsa.sheet.array2;

import java.util.HashSet;
import java.util.Set;

public class SubArrayExistsWithSumZero {

    private static void findSubarrayByHashing(int[] nums) {

	Set<Integer> set = new HashSet<>();
	int sum = 0;
	boolean flag = false;
	for(int i=0;i<nums.length;i++) {
		
		sum+=nums[i];
		
		if(sum==0 || nums[i]==0 || set.contains(sum)) {
			flag = true;
			break;
		}
		set.add(sum);
	}
	System.out.println(flag);
  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,2,-12,1,6,5};
		findSubarrayByHashing(nums);
	}

}
