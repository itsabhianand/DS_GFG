package com.gfg.array_sort_rotate;

// Finding Max element by using binary search using O(logn)

public class MaximumElementInRotatedSortedBinarySearch {
	
	public static int binarySearch(int arr[], int low, int high) {
		if(low > high)
			return -1;
		
		if(low == high)
			return low;
		
		int mid = (low + high)/2;
		if(arr[mid - 1] > arr[mid]) {
			return arr[mid -1];
		}
		else if(arr[mid] > arr[mid + 1]) {
			return arr[mid];
		}
		else if(arr[low] >= arr[mid]) {
			return binarySearch(arr, low, mid-1);
		}
		else {
			return binarySearch(arr, mid+1, high - 1); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int n = arr.length;
		int maxElement = MaximumElementInRotatedSortedBinarySearch.binarySearch(arr, 0, n-1);
		System.out.println("Max Element found is : " + maxElement);
		
	}

}
