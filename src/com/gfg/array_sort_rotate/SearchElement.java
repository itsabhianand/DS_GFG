package com.gfg.array_sort_rotate;

// Program to search index of an element in a sorted rotated array
//Time complexity : 0(logn), space complexity : 0(1)
//In this we have taken 2 binary Search pass, there can be optimal solution for this in one binary search pass.

public class SearchElement {
	
	public static int pivotedSearch(int arr[], int n, int key) {
		int pivot = findPivot(arr, 0, n-1);
		
		// If we didn't find pivot then array is not rotated at all
		if(pivot  == -1) {
			return -1;
		}
		if(arr[pivot] == key)
			return pivot;
		if(arr[0] <= key) {
			return binarySearch(arr, 0, pivot - 1, key);
			
		}
		else {
			return binarySearch(arr, pivot + 1, n-1, key);
		}
	}
    public static int findPivot(int a[], int low, int high) {
    	if(high < low) {
    		return -1;
    		
    	}
    	if(high == low)
    		return low;
    	
    	int mid = (high + low)/2;
    	if(a[mid - 1] > a[mid])
    	{
    		return mid - 1;
    	}
    	else if(a[mid] > a[mid + 1]) {
    		return mid;
    	}
    	if(a[low] >= a[mid]) {     //  8,9,10,1,2,3,4,5,6,7
    		return findPivot(a, low, mid -1);
    	}
    	else {
    		return findPivot(a, mid+1, high);
    	}
    }
    public static int binarySearch(int a[], int low, int high, int key) {
    	if(low > high) {
    		return -1;
    	}
    	if(high==low) {
    		return low;
    	}
    	int mid = (high + low)/2;
    	if(a[mid] == key) {
    		return mid;
    	}
    	if(key > a[mid]) {
    		return binarySearch(a, mid+1, high, key);
    	}
    	else {
    		return binarySearch(a, low, mid-1, key);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
		int n = arr1.length; 
        int key = 8;
        System.out.println("Index of the element is : "
                + pivotedSearch(arr1, n, key));
	}

}
