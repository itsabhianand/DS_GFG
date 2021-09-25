package com.dsa.sheet.searching.sorting;

public class FindPivotElement {
	
	 public static int findPivot(int a[], int low, int high) {
	if(high < low) {
		return -1;
		
	}
	if(high == low)
		return low;
	
	int mid = (high + low)/2;
	// Checking mid element condition
	if(a[mid - 1] > a[mid])
	{
		return mid - 1;
	}
	else if(a[mid] > a[mid + 1]) {
		return mid;
	}
	
	if(a[mid] > a[high]) { 
		return findPivot(a, mid+1, high);
	}
	else {
		return findPivot(a, low, mid - 1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
		//int nums2[] = {3, 4, 5, 1, 2};
		int length = nums.length;
		int index = findPivot(nums, 0, length -1);
		System.out.println(index);
	}

}
