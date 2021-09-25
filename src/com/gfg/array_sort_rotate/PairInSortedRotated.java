package com.gfg.array_sort_rotate;

// Program to find count of pair of elements equal to given sum k in rotated sorted array

// we have used low = (low+1) % length so as to avoid ArrayIndexOutOfBoundException at higher end like low = (5 + 1) % 6 so it will go direct to 0th index, take key as 26
// same for high = (Length + high - 1) % length , take example key as 14

public class PairInSortedRotated {
	
	public static int pairInSortRotation(int a[], int length, int key) {
		int i;
		int count = 0;
		// finding pivot element
		for(i=0; i<= length-1; i++) {
			if(a[i] > a[i+1])
				break;
		}
		int high = i; // pivot element index
		int low = (i+1)%length; // minimum element index
		
		while(low != high) {
			if(a[low] + a[high] == key) {
				count++;
				break;
			}
			else if(a[low] + a[high] < key) {
				low = (low+1) % length;
				
			}
			else if(a[low] + a[high] > key) {
				high = (length + high - 1) % length;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {11, 15, 6, 8, 9, 10};
        int n = arr.length;
        int key = 14;
        int cnt = PairInSortedRotated.pairInSortRotation(arr, n, key);
        System.out.println("Array has two elements with given sum " + key + " is : " + cnt);
	}

}
