package com.dsa.sheet.searching.sorting;

public class FirstAndLastPositionOfElement {
	
	public static int firstAndLastElement(int array[], int length, int x, boolean togg) {
		int low = 0;
		int high = length -1;
		int ans = 0;
		while(low <= high) {
			int mid = (low + high)/2;
			if(array[mid] > x) {
				high = mid - 1;
			}
			else if(array[mid] < x) {
				low = mid +1;
			}
			else {
				ans = mid;
				if(togg) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
		}
		
		return ans;
	}
	
	// Without using toggle.
	private static void findPositions(int[] nums, int k) {
       // 1,3,5,5,5,5,6,7,123,125
		int left=0;
		int right=nums.length-1;
		int mid=0;
		
		int first = -1,last = -1; // It will capture first and last element.

		while(left<right) {

			mid = (left+right)/2;

			if(nums[mid]==k) {
				break;
			}
			else if(nums[mid] > k)
				right = mid - 1;
			else
				left = mid + 1;
		}

		for(int i=0;i<mid;i++) {
			if(nums[i]==k) {
				first = i;
				break;
			}
		}

		for(int i=nums.length-1;i>mid;i--) {
			if(nums[i]==k) {
				last = i;
				break;
			}
		}
		System.out.println(first +" "+last);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = {1,3,5,5,5,5,6,7,123,125};
      int length = array.length;
      int x=5;
      int startIndex = FirstAndLastPositionOfElement.firstAndLastElement(array, length, x, true);
      int lastIndex = FirstAndLastPositionOfElement.firstAndLastElement(array, length, x, false);
      System.out.println("First Index is : " + startIndex);
      System.out.println("Last Index is : " + lastIndex);
      findPositions(array,x);
	}

}
