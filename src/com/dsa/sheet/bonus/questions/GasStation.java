package com.dsa.sheet.bonus.questions;

// Refer Code bashers
public class GasStation {
	
	public static int calculateGasStation(int[] gas, int[] cost) {
		int sum = 0;
		
		  
		
		// check if there exist a path, basically edge case.
		if(sum < 0) {
			return -1;
		}
		// Below code if path exists.
		int currTank = 0;
		int start = 0;
		
		for(int i = 0; i < gas.length; i++) {
			currTank += gas[i] - cost[i];
			if(currTank < 0) {
				start = i + 1;
				currTank = 0;
			}
		}
		
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int station = calculateGasStation(gas, cost);
        System.out.println(station);
	}

}
