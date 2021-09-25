package com.dsa.sheet.arrays;

//This is a program where we need to find such pairs where a[i] > a[j] and i < j

public class CountInversionsInArrays {
	
	public static int merge(int array[], int temp[], int left, int mid, int right) {
		// 5,3,2,4,1
		int i, j, k;
		int inv = 0;
		
		i = left; //i is index of left sub-Array
		j= mid; // j is index of right sub-Array
		k = left; // k is index of resultant merged sub-Array
		
		while((i<=mid-1) && (j<=right)) {
			if(array[i]<=array[j]) {
				temp[k++] = array[i++];
			}
			else {
				temp[k++] = array[j++];
				inv += (mid - i);
			}
		}
		
		while(i<=mid-1) {
			temp[k++] = array[i++];
		}
		while(j<=right) {
			temp[k++] = array[j++];
		}
		
		for(int m=left; m<=right; m++) {
			array[m] = temp[m];
		}
		
		return inv;
	}
    
	public static int mergeSort(int array[], int temp[], int left, int right) {
		// 5,3,2,4,1
		int inv_count = 0;
		
		if(left > right) {
			return -1;
		}
		if(right > left) {
			int mid = (left + right)/2;
			inv_count += mergeSort(array, temp, left, mid);
			inv_count += mergeSort(array, temp, mid+1, right);
			inv_count += merge(array, temp, left, mid+1, right);
		}
		return inv_count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = new int[] {5,3,2,4,1};
        int length = array.length;
        int temp[] = new int[length];
        int inversionCount = CountInversionsInArrays.mergeSort(array, temp, 0, length-1);
        System.out.println("Total count is :" + inversionCount);
	}

}
