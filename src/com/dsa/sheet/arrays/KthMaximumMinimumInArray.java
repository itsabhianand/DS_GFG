package com.dsa.sheet.arrays;

// Find kth Max and kth Min element in an Array
//Make use of Max-Heap for finding minimum element and min-heap for finding max.

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaximumMinimumInArray {
	// 10,7,11,30,8,38,2,45
	
	public static int minimumelement(int arr[], int k) {
		int n = arr.length;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder()); // Max Heap
		for(int i=0; i<k; i++) {
			maxHeap.add(arr[i]);
		}
		for(int i=k; i <=n-1; i++) {
			if(arr[i] < maxHeap.peek()) {
				maxHeap.poll();
				maxHeap.add(arr[i]);
			}
		}
		return maxHeap.peek();
	}
	
	public static int maximumelement(int arr[], int k) {
		int n = arr.length;
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); // Min Heap
		for(int i=0; i<k; i++) {
			minHeap.add(arr[i]);
		}
		for(int i=k; i<= n-1; i++) {
			if(arr[i] > minHeap.peek())
			{
				minHeap.poll();
				minHeap.add(arr[i]);
		   }
		}
		return minHeap.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = new int[] {10,7,11,30,8,38,2,45};
       int k = 3;
       int minimumElement = KthMaximumMinimumInArray.minimumelement(array, k);
       System.out.println("Minimum element is : " + minimumElement);
       int maxElement = KthMaximumMinimumInArray.maximumelement(array, k);
       System.out.println("Maximum element is :" + maxElement);
	}

}
