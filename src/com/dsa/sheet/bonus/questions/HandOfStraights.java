package com.dsa.sheet.bonus.questions;

// // JOY of LIFE video
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

// same as DivideArrayInSetOfConsecutiveNumbers
public class HandOfStraights {
	
	public static boolean canDivideHandCards(int nums[], int k) {
		if(nums.length % k !=0) {
			return false;
		}
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		// 1---1, 2---1, 3---2, 4---2, 5---1, 6---1
		Queue<Integer> q = new LinkedList<Integer>(); // Queue stores and checks values whether at any given iterating key, how many groups can we form. 
		int groupInProgress = 0;
		int lastSeenNumber = -1;
		
		for(Integer key : map.keySet()) {
			if(key > lastSeenNumber + 1 && groupInProgress > 0 || groupInProgress > map.get(key)) {
				return false;
			}
			
			q.add(map.get(key) - groupInProgress);
			groupInProgress = map.get(key);
			lastSeenNumber = key;
			
			if(q.size() == k) {
				groupInProgress = groupInProgress - q.poll();
			}
		}
		
		return(groupInProgress == 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int k = 3;
        boolean result = canDivideHandCards(hand, k);
        System.out.println(result);
	}

}
