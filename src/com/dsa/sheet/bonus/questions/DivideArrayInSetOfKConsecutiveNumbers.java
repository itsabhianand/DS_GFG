package com.dsa.sheet.bonus.questions;


// JOY of LIFE video
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class DivideArrayInSetOfKConsecutiveNumbers {
	
	// 1,2,3,3,4,4,5,6
	public static boolean canDivideArray(int nums[], int k) {
		if(nums.length % k !=0) {
			return false;
		}
		// Iterate over array and store values in a treeMap.
		// Store nums[i] as key and its frequency as count.
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		// 1---1, 2---1, 3---2, 4---2, 5---1, 6---1
		// Queue stores values and checks whether at any given iterating key, Are we creating any new group or not. 
		Queue<Integer> q = new LinkedList<Integer>(); 
		int groupInProgress = 0; // To track Group in Progress.
		int lastSeenNumber = -1;
		
		for(Integer key : map.keySet()) {
			// Invalid cases check
			// groupInProgress > map.get(key) means if we have 1,1,1,2,2 then 1 will form 3 groups as map.get(1) - 0 = 3 added in queue.
			// so for 2 we can't place 2 in 3rd grp as gip i.e (3) > map.get(2) i.e is 2.
			if(key > lastSeenNumber + 1 && groupInProgress > 0 || groupInProgress > map.get(key)) {
				return false;
			}
			// We add values in queue which indicates that at any given iterating key in map, how many groups are active. Are we creating any new group.
			q.add(map.get(key) - groupInProgress);
			groupInProgress = map.get(key); // Value as groupInProgress.
			lastSeenNumber = key; // key as lastSeen
			
			// If q size is equal to k means one of the group in progress is completed so, GIP needs to be updated.
			if(q.size() == k) {
				groupInProgress = groupInProgress - q.poll();
			}
		}
		
		return(groupInProgress == 0); // if group-in-progress is 0 here means we have completed all the grp with given set of consecutive numbers.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[] = {1,2,3,3,4,4,5,6};
       int k = 4;
       boolean result = canDivideArray(nums, k);
       System.out.println(result);
	}

}
