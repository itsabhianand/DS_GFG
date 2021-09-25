package com.gfg.array_sort_rotate;

//Finding element next to pivot element by using O(n)

public class MinimumElementInRotatedSorted {
	
	public static int findMinimumElement(int arr[], int n) {
		int i;
		for(i=0; i<=n-1; i++) {
			if(arr[i] > arr[i+1]) {
				break;
			}
		}
		return arr[i+1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {2, 3, 4, 5, 6, 7, 8, 1};
        int n = arr.length;
        int minelement = MinimumElementInRotatedSorted.findMinimumElement(arr, n);
        System.out.println("Minimum element found is :" + minelement);
	}

}
