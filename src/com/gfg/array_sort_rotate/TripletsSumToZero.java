package com.gfg.array_sort_rotate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Program to find triplets whose sum is equal to 0 

public class TripletsSumToZero {
	
	public static void tripletsSumToZeroBySortingTwoPointers(int arr[], int n) {
		Arrays.sort(arr, 0, n); // 1,3,4,6,9,12
		
		for(int i=0; i<=n-1; i++) {
			int left = i+1;
			int right = n-1;
			int x = arr[i];
			while(left < right) {
				if(x + arr[left] + arr[right] == 24) {
					System.out.println("Triplets found is : " + x + " " + arr[left] + " " + arr[right]);
					left++;
					right--;
				}
				else if(x + arr[left] + arr[right] < 24) {
					left++;
				}
				else if(x + arr[left] + arr[right] > 24) {
					right--;
				}
			}
		}
	}
	
	private static boolean findTripletsByHashing(int[] nums, int n) {

		for(int i=0;i<nums.length;i++) {
			int temp = n - nums[i]; //57
			Set<Integer> set = new HashSet<>();

			for(int j=i+1;j<nums.length;j++) {
				int y = temp-nums[j];
				if(set.contains(y))
					return true;
				set.add(nums[j]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = new int[] {12, 3, 4, 1, 6, 9};
      int length = array.length;
      TripletsSumToZero.tripletsSumToZeroBySortingTwoPointers(array, length);
      boolean result = TripletsSumToZero.findTripletsByHashing(array, 24);
      if(result) {
    	  System.out.println("Triplets found");
      }
      else {
    	  System.out.println("Triplets not found");
      }
	}

}
