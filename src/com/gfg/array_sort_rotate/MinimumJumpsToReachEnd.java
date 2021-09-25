package com.gfg.array_sort_rotate;


// Minimum Jumps to Reach array end : done using DP, Refer coding Simplified video
//Time complexity : O(n2)
// Also Optimized solution is there which is O(n). Refer Code Library.

public class MinimumJumpsToReachEnd {
	
	
	public static int minJumps(int arr[], int n) {
		int minimumJumps[] = new int[n]; 
		for(int i=0; i<n; i++) {
			minimumJumps[i] = Integer.MAX_VALUE; // Initializing minimumJump[] with consideration that it will require maximum infinity jumps to reach elements from start
		}
		
		minimumJumps[0] = 0; // minimumJump[] represents it requires minimum jump to reach any particular element from start. So, for first element it will be 0.
		for(int i=0; i<n; i++) {
			for(int j=i+1; i+arr[i] >= j && j<n; j++) { // Here, check if any particular element is reachable from previous element that is i + array[i]
				minimumJumps[j] = Math.min(1 + minimumJumps[i], minimumJumps[j]);
			}
		}
		return minimumJumps[n-1];// index is n-1
	}
	
	public static int optimizedminJumps(int arr[], int n) {
		// 1,3,5,8,9,2,6,7,6,8,9
		int maxR = arr[0];
		int step = arr[0];
		int jump = 1;
		
		if(arr[0] == 0) {
			return -1;
		}
		else if(n == 1) {
			return 0;
		}
		else {
			for(int i = 1; i < n; i++) {
				if(i == n-1) { // base condition
					return jump;
				}
				else {
				maxR = Math.max(maxR, i + arr[i]);
				step--;
				if(i>=maxR) {   // {1,2,3,2,1,1,0,1,9,5,6} // edge case.
					return -1;
				}
				else if(step == 0) {
					jump++;
				    step = maxR - i; // // {1,3,5,8,9,2,6,7,6,8,9};
					
				}
			}
		   }
			return -1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {1,3,5,8,9,2,6,7,6,8,9};
	   //int array[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
       int n = array.length;
       //int jumps = MinimumJumpsToReachEnd.minJumps(array, n);
       int minjumps = MinimumJumpsToReachEnd.optimizedminJumps(array, n);
       //System.out.println("Minimum jums to reach array end is : " + jumps);
       System.out.println("Minimum jumps required to reach end of an array is : " + minjumps);
	}

}
