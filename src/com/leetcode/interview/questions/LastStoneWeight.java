package com.leetcode.interview.questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] stones = {2,7,4,1,8,1};
       int length = stones.length;
       int res = findStoneWeight(stones);
       System.out.println(res);
	}

	private static int findStoneWeight(int[] stones) {
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i : stones) {
			q.add(i);
		}
		
		int x = 0;
		int y = 0;
		
		while(q.size() > 1) {
			 y = q.poll();
			 x = q.poll();
			
			if(y > x) {
			   q.add(y-x);	
			}
		}
		
		return q.isEmpty() ? 0 : q.poll();
		
	}

}
