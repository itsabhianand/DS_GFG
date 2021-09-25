package com.dsa.sheet.bonus.questions;

import java.util.PriorityQueue;

public class MeetingRoomsII {
	
	public static int findMinimumMeetingRooms(int nums[][]) {
		if(nums.length == 0 || nums == null) {
			return -1;
		}
		
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		
		for(int[] subArr : nums) {
			
			if(p.isEmpty()) {
				p.add(subArr[1]);
				continue; // so, it doesnot add same first value at line 25.
			}
			
			if(p.peek() <= subArr[0]) {
				p.remove();
			}
			
			p.add(subArr[1]);
		}
		
		return p.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[][] = {{0,30}, {5,10}, {15,20}};
        int res = findMinimumMeetingRooms(nums);
        System.out.println(res);
	}

}
