package com.gfg.array_sort_rotate;

//Finding Min element by using binary search using O(logn)
// When we need to find min element we will first find pivot element and we will return next element.
// If middle element of an array is greater than the lower element of array then the left side will be sorted in asc order 2,3,7,8,9,1
// else right side will be sorted. 

public class MinimumElementInRotatedSortedBinarySearch {
	
	public static int minimumUsingBinarySearch(int arr[], int low, int high) {
		if(low > high)
			return -1;
		if(low == high)
			return low;
		int mid = (low + high)/2;
		if(arr[mid-1] > arr[mid]) {
			return arr[mid];
		}
		else if(arr[mid] > arr[mid + 1]) {
			return arr[mid + 1];
		}
		else if(arr[low] >= arr[mid]) { // 2,3,7,8,9,1
			                            // 7,8,1,2,3,5,6
			return minimumUsingBinarySearch(arr, low, mid-1);
		}
		else {
			return minimumUsingBinarySearch(arr, mid+1, high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {5,6,7,8,9,10,11,1,2,3};
		int n = arr.length;
		int minElement = MinimumElementInRotatedSortedBinarySearch.minimumUsingBinarySearch(arr, 0, n-1);
		System.out.println("Min Element found is : " + minElement);
	}

}
