package com.dsa.sheet.searching.sorting;

// Return 1 if pair exists else return -1
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPairWithGivenDifference {
	
	// TC : O(n) and SC : O(n)
	// 5,20,3,2,5,80
	public static int findPairUsingSet(int nums[], int length, int k) {
		Set<Integer> set = new HashSet<Integer>();
		int ans = -1;
		for(int i = 0; i < length; i++) {
			set.add(nums[i]);
		}
		
		for(int j = 0; j < length; j++) {
			int y = nums[j] + k;
			if(set.contains(y)) {
				ans = 1;
			}
			
		}
		
		return ans;
	}
     
	// TC : O(nlogn) and SC : O(1)
	// 5,20,3,2,5,80
	public static int findPairsTwoPointers(int nums[], int length, int k) {
		Arrays.sort(nums); // 2,3,5,5,20,80
		int ans = -1;
		int i = 0, j = 1;
		
		while(i < length && j < length) {
			if(i != j && nums[j] - nums[i] == k) {
				ans = 1;
				break;
			}
			else if(nums[j] - nums[i] < k) {
				j++;
			}
			else {
				i++;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {5,20,3,2,5,80};
        int length = nums.length;
        int k = 78;
       int result =  findPairUsingSet(nums, length, k);
       if(result == 1) {
    	   System.out.println("Pairs found");
       }
       else {
    	   System.out.println("Pairs not found");
       }
       int result1 = findPairsTwoPointers(nums, length, k);
       if(result1 == 1) {
    	   System.out.println("Pairs found using 2 pointers");
       }
       else {
    	   System.out.println("Pairs not found using 2 pointers");
       }
	}

}
