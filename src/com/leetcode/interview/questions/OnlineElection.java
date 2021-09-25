package com.leetcode.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*persons[] : [0,1,1,0,0,1,0]
times[] : [0,5,10,15,20,25,30]

in the above, '0' and '1' are the candidates participating in the election. At each time stamp in times[] array, we know which candidate received a vote based on persons[] array. In common words to put,

at time '0', some citizen casted a vote to candidate '0' ---> 0 is the leader now.
at time '5', some citizen casted a vote to candidate '1' ---> 1 is the leader as most recent candidate wins
at time 10, some other citizen casted a vote to candidate '1' ----> 1 is the leader as he got 2 votes
at time 15, some citizen casted a vote to candidate 0, ----> 0 is the leader as both have two votes each, however most recent wins
at time 20, some citizen casted a vote to candidate 0, ---> 0 is the leader as 0 has 3votes and 1 has 2 votes.*/
public class OnlineElection {
	
	public static Map<Integer, Integer> leader = new TreeMap<Integer, Integer>();
	public static int time[];
	
	public static int findLeaderOnlineElection(int person[], int times[], int t) {
		
		int n = person.length;
		int lead = -1;
		time = times;
		Map<Integer, Integer> countVotes = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			countVotes.put(person[i], countVotes.getOrDefault(person[i], 0) + 1);
			if(i == 0 || countVotes.get(person[i]) >= countVotes.get(lead)) {
				lead = person[i];
			}
			leader.put(times[i], lead);
		}
		
		return q(t);
	}
	
	public static int q(int t) {
		int start = 0;
		int end = time.length;
		int mid = 0;
		while(start < end) {
			mid = (start + end)/2;
			
			  if(time[mid] == t) {
				  return leader.get(time[mid]); 
		}
			 
			if(time[mid] < t) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		return leader.get(time[start - 1]);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int person[] = {0,1,1,0,0,1,0};
         int times[] = {0,5,10,15,20,25,30};
         int winner = findLeaderOnlineElection(person, times, 30);
         System.out.println(winner);
	}

}
