 package com.dsa.sheet.bonus.questions;


// Binary Search Series .
// Refer Tech Traversal.
public class SplitLargestArraySum {
	
	public static int splitArray(int[] nums, int k) {
		int start = 0;
		int end = 0;
		int answer = 0;
		
		// 2,4,6,3,4,11,8,7
		for(int i = 0; i < nums.length; i++) {
			start = Math.max(start, nums[i]); // Tracking largest number in an entire array. Taking it as first element.
			end = end + nums[i]; // Taking upper limit for binary search.
		}
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(check(mid, nums, k)) {
				answer = mid;
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return answer;
	}

	private static boolean check(int mid, int[] nums, int k) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		// 2,4,6,3,4,11,8,7
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > mid) { // edge case.
				return false;
			}
			sum = sum + nums[i];
			if(sum > mid) {
				count++;
				sum = nums[i];
			}
		}
		count++;
		System.out.println("Count is : " + count);
		if(count==k) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {7,2,5,10,8};
       int nums1[] = {2,4,6,3,4,11,8,7};
       int k = 2;
       int result = splitArray(nums1, k);
       System.out.println(result);
	} 

}
