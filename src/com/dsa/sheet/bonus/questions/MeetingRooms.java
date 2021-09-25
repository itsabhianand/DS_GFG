package com.dsa.sheet.bonus.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingRooms {
	
	public static boolean canAttendMeeting(int nums[][]) {
		
		if(nums.length == 0 || nums == null) {
			return false;
		}
		List<int[]> resultList = new ArrayList<int[]>();
		Arrays.sort(nums, (a,b) -> a[0] - b[0]);
		int startMeeting = nums[0][0];
		int endMeeting = nums[0][1];
		
		for(int i=1; i < nums.length; i++) {
			if(endMeeting >= nums[i][0]) {
				return false;
			}
			else {
				resultList.add(new int[] {startMeeting, endMeeting});
				startMeeting = nums[i][0];
				endMeeting = nums[i][1];
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = { {0,30}, {31,50}, {55,65}};
		boolean res = canAttendMeeting(nums);
		System.out.println(res);
	}

}
