package com.leetcode.interview.questions;

public class PaintHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] costs = {{30,50,10}, {300,200,20}, {400,40,300}};
        int minCost = findMinCost(costs);
        System.out.println(minCost);
	}

	private static int findMinCost(int[][] costs) {
		// TODO Auto-generated method stub
		if(costs == null || costs.length == 0) {
			return -1;
		}
		
		int n = costs.length;
		
		for(int i=1; i < n ; i++) {
			
			costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
			costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
			costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
		}
		
		return Math.min(costs[n-1][0], Math.min(costs[n-1][1], costs[n-1][2]));
	}

}
