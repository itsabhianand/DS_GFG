package com.sde.sheet.stacks.queues;

import java.util.Collections;

// Refer GFG videos

// peek() : Returns peek element from front.
// peekLast() : Returns peek element from rear
// removeFirst() : remove from front.
// removeLast() : remove from rear.
// addLast() : Add element at rear.
import java.util.PriorityQueue;


public class SlidingWindow {
	
	private static void findMaximumSlidingWindow(int[] nums, int k) {

		 PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		int i = 0;
		for(;i<k;i++) 
			maxHeap.add(nums[i]);
		
		System.out.print(maxHeap.peek()+" ");
		maxHeap.remove(nums[0]);
		
		for(;i<nums.length;i++) {
			
			maxHeap.add(nums[i]);
			System.out.print(maxHeap.peek()+" ");
			maxHeap.remove(nums[i-k+1]);
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		findMaximumSlidingWindow(nums,k);
	}

}
