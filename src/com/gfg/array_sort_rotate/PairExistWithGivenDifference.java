package com.gfg.array_sort_rotate;

import java.util.HashSet;
import java.util.Set;

// Refer Code Library
// Program to check if there exists a pair with a given difference x or not

public class PairExistWithGivenDifference {
	
	public static int searchPair(int array[], int length, int x) {
		int answer = -1;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i < length; i++) {
			set.add(array[i]);
		}
		
		for(int j=0; j < length; j++) {
			int y = array[j] + x;
			if(set.contains(y)) {
				answer = 1;
				break;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = {5,20,3,2,5,80};
      int x = 78;
      int length = array.length;
      int answer = PairExistWithGivenDifference.searchPair(array, length, x);
      if(answer == 1) {
    	  System.out.println(" Yes Pair exists!");
      }
      else {
    	  System.out.println(" No Pair doesnot exists !");
      }
	}

}
