package com.leetcode.interview.questions;

import java.util.Arrays;

public class ThreeSum {
	
	public static void tripletsSumToZeroBySortingTwoPointers(int arr[], int n, int k) {
		Arrays.sort(arr, 0, n); // 1,3,4,6,9,12
		
		for(int i=0; i<=n-1; i++) {
			int left = i+1;
			int right = n-1;
			int x = arr[i];
			while(left < right) {
				if(x + arr[left] + arr[right] == k) {
					System.out.println("Triplets found is : " + x + " " + arr[left] + " " + arr[right]);
					left++;
					right--;
				}
				else if(x + arr[left] + arr[right] < k) {
					left++;
				}
				else if(x + arr[left] + arr[right] > k) {
					right--;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {-1,0,1,2,-1,-4};
        int length = nums.length;
        tripletsSumToZeroBySortingTwoPointers(nums, length, 0);
	}

}
