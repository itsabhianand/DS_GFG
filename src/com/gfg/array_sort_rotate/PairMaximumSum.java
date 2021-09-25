package com.gfg.array_sort_rotate;

// WAP to find pair in an array whose sum is maximum in O(n)

public class PairMaximumSum {
	
	public static int maxSumForGivenPair(int arr[], int length) {
		int high = length-1;
		int first;
		int second;
		if(arr[0] > arr[1])
		{
			first = arr[0];
			second = arr[1];
		}
		else {
			first = arr[1];
			second = arr[0];
		}
		for(int i=2; i<=high; i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		return (first + second);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int n = arr.length;
		int maxSum = PairMaximumSum.maxSumForGivenPair(arr, n);
		System.out.println("Maximum Sum for given pair is : " + maxSum);
		
	}

}
