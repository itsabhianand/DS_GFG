package com.gfg.array_sort_rotate;

//Program to search index of an element in a sorted rotated array in a recursive manner using one binary search pass
// Time complexity : 0(logn), space complexity : 0(1)
public class SearchElementRecursive {
	
	public static int pivotedSearch(int a[], int low, int high, int key) {
		if(low > high)
			return -1;
		if(low == high)
			return low;
		
		int mid = (low + high)/2;
		if(a[mid] == key)
			return mid;
		
		if(a[mid] >= a[low]) {
			if(key >= a[low] && key < a[mid])
				return pivotedSearch(a, low, mid - 1, key);
			else 
				return pivotedSearch(a, mid + 1, high, key);
		}
		else {
			if(key > a[mid] && key <= a[high])
				return pivotedSearch(a, mid +1, high, key);
			else 
				return pivotedSearch(a, low, mid-1, key);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
		int n = arr1.length; 
        int key = 3;
        System.out.println("Index of the element is : "
                + pivotedSearch(arr1, 0, n-1, key));

	}

}
