package com.dsa.sheet.bonus.questions;

// Returning Index of Peak element using Binary search (logn solution)
public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[] = {3,8,3,9,7,2};
       int index = findPeakElement(nums);
       System.out.println(index);
	}
	
	public static int findPeakElement(int nums[]) {
		int start = 0;
		int end = nums.length;
		int mid = 0;
		
		while(start <= end) {
			mid = (start + end)/2;
			if(nums[mid] > nums[mid + 1] && nums[mid] > nums[mid -1]) {
				return mid;
			}
			
			if(nums[mid] < nums[mid -1]) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
			
		}
		
		return mid;
	}

}
