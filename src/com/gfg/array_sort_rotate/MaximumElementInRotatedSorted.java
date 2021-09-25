package com.gfg.array_sort_rotate;

// Finding pivot element by using O(n)
// Max element using Pivot

public class MaximumElementInRotatedSorted {
	
	public static int findMaxmumElement(int arr[], int n) {
		int i;
		for(i=0; i<=n-1; i++) {
			if(arr[i] > arr[i+1]) {
				break;
			}
		}
		return arr[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {5, 6, 7, 1, 2, 3, 4};
        int n = arr.length;
        int maxelement = MaximumElementInRotatedSorted.findMaxmumElement(arr, n);
        System.out.println("Maximum element found is :" + maxelement);
	}

}
