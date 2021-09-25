 package com.dsa.sheet.bonus.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

// type of visited array/set approached. Check if given graph is complete or not.
public class KeysAndRooms {
	
	 public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
	    
		// Keep track of visited rooms.
	    Set<Integer> visitedSet = new HashSet<Integer>();
	    
	    Queue<Integer> q = new LinkedList<Integer>();
	    
	    q.add(0);
	    visitedSet.add(0);
	    
	    while(!q.isEmpty()) {
	    	int i = q.poll();
	    	
	    	List<Integer> list = rooms.get(0);
	    	for(int il : list) {
	    		if(!visitedSet.contains(il)) {
	    			visitedSet.add(il);
	    			q.add(il);
	    		}
	    	}
	    }
	    
	    return visitedSet.size() == rooms.size();
	    
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<List<Integer>> mainList = new ArrayList<List<Integer>>();
       
       List<Integer> roomzerolist = new ArrayList<Integer>();
       roomzerolist.add(1);
       roomzerolist.add(3);
       List<Integer> roomonelist = new ArrayList<Integer>();
       roomonelist.add(3);
       roomonelist.add(0);
       roomonelist.add(1);
       List<Integer> roomtwolist = new ArrayList<Integer>();
       roomtwolist.add(2);
       List<Integer> roomthreelist = new ArrayList<Integer>();
       roomthreelist.add(0);
       
       mainList.add(roomzerolist);
       mainList.add(roomonelist);
       mainList.add(roomtwolist);
       mainList.add(roomthreelist);
       
       boolean visit = canVisitAllRooms(mainList);
       System.out.println(visit);
	}

}
