package com.gfg.array_sort_rotate;

// Program for rotation count in an array sorted in an ascending order and then rotated.(sorted rotated Array)

// Rotation count in this case is always equal to index of minimum element. Also minimum element in a rotated sorted array is element next to pivot.

public class RotationCountInSortedArray {
	
	public static int rotationCountSortedArray(int array[],int low, int high) {
		if(low > high) {
			return -1;
		}
		if(low == high) {
			return low;
		}
		int mid = (low + high)/2;
		if(array[mid] > array[mid + 1])
			return mid + 1;
		if(array[mid - 1] > array[mid])
			return mid;
		
		// Check either needs to traverse left or right to find minimum element.
		if(array[high] >= array[mid]) {
			return rotationCountSortedArray(array, 0, mid - 1);
		}
		else {
			return rotationCountSortedArray(array, mid + 1, high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[] {7, 9, 11, 12, 5}; // 5,7,9,11,12
		int length = array.length;
		int rotationCount = RotationCountInSortedArray.rotationCountSortedArray(array, 0, length -1);
        System.out.println(" Rotation count is :" + rotationCount);
	}

}
