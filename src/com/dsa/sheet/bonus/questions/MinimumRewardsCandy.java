package com.dsa.sheet.bonus.questions;

import java.util.Arrays;

public class MinimumRewardsCandy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rating = {12,4,3,11,34,34,1,67};
		System.out.println("The minimum candies required : "+getMinimumCandies(rating));
	}
     
	// 1 1 1 1 1 1 1 1
    // 1 1 1 2 3 1 1 2
	// 3 2 1 2 3 2 1 2 = 16
	private static int getMinimumCandies(int[] rating) {
		
		// TODO Auto-generated method stub
		int n = rating.length;
		int candies[] = new int[n];
		Arrays.fill(candies, 1);
		int sum =0;
		
		for(int i=0; i<n-1; i++) {
            if(rating[i+1] > rating[i]) {
            	candies[i + 1] = candies[i] + 1;
            }
		}
		
		sum = sum + candies[n-1];
		
		for(int j=n-1; j>0; j--) {
			if(rating[j-1] > rating[j]) {
				candies[j-1] = Math.max(candies[j-1], candies[j] + 1);
			}
			sum = sum + candies[j-1];
		}
		
		return sum;
		
	}

}
