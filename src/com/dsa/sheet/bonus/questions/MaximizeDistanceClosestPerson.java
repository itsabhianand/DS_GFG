package com.dsa.sheet.bonus.questions;


// Refer Knowledge Center
// 1 denotes if someone is sitting.
// 0 denotes, chair is empty.
public class MaximizeDistanceClosestPerson {
	
	public static int maximizeClosestDistance(int [] seats) {
		int n = seats.length;
		int empty = 0; // consecutive number of zeros or seats that are empty.
		int result = 0;
		int idx1 = -1; // Tracking first leftmost 1.
		int idx2 = -1;// Tracking rightmost 1.
		
		for(int i = 0; i < n; i++) {
			if(seats[i] == 1) { 
				empty = 0; // Whenever we encounter 1 then make consecutive zeros count reset to 0 as for middle cases we calculate minimum distance to closest by Math.floor(empty+1/2). Where empty is 0's in between lastseen 1 and upcoming 1.
				if(idx1 == -1) {
					idx1 = i;  // Keeping track of leftmost one. It will be updated once.
				}
				idx2 = i; // Keeping track of right most one.
			}
			else {
				empty++;
				result = (int) Math.max(result, Math.floor((empty + 1)/2)); // This is for Internal chair cases.
			}
		}
		result = Math.max(result, Math.max(idx1, n - 1 - idx2)); // This is for edge chair cases.
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] seats = {1,0,0,0,1,0,1}; // if sitting in middle.
       int[] seats1 = {1,0,0,0,0}; // if sitting at edge.
       int res =  maximizeClosestDistance(seats);
       System.out.println(res);
	}

}
