package com.dsa.sheet.bonus.questions;

import java.util.Arrays;

public class MaximumPairProduct {
	
	public static void findMaximumPairProductUsingSorting(int nums[]) {
		System.out.println();
		Arrays.sort(nums);
		int n = nums.length;
        int firstProduct = nums[0] * nums[1];
        int secondProduct = nums[n-1] * nums[n-2];
        
       if(firstProduct >= secondProduct) {
    	   System.out.println("Largest Product formed is : " + nums[0] + " " + nums[1]);
       }
       else {
    	   System.out.println("Largest Product formed is : " + nums[n-1] + " " + nums[n-2]);
       }
		
	}
	
	public static void findMaximumPairProductEfficient(int nums[]) {
		
		System.out.println("Single Traversal Technique");
		System.out.println("---------------------------");

		int n = nums.length;

		if(n < 2) {
			System.out.println("There is no pair available : Array is too short");
			return;
		}

		if(n == 2) {
			System.out.println("Max Product Pair is : " +nums[0] +","+nums[1]);
			System.out.println("Max Product is : "+ nums[0] * nums[1]);
			return;
		}
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > firstMax) {
				secondMax = firstMax;
				firstMax = nums[i];
			}
			else if(nums[i] > secondMax) {
				secondMax = nums[i];
			}
			// if firstMin and SecondMin numbers are negative.
			if(nums[i] < firstMin) {
				secondMin = firstMin;
				firstMin = nums[i];
			}
			else if(nums[i] < secondMin) {
				secondMin = nums[i];
			}
		}
		
		int product1 = firstMax * secondMax;
		int product2 = firstMin * secondMin;
		
		 if(product1 >= product2) {
	    	   System.out.println("Largest Product formed is : " + firstMax + " " + secondMax);
	       }
	       else {
	    	   System.out.println("Largest Product formed is : " + firstMin + " " + secondMin);
	       }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {1, -4, 3, 6, -7, 0 };
		System.out.println("Resultant formed by sorting is :");
		findMaximumPairProductUsingSorting(nums);
		System.out.println("Resultant using efficient way : ");
		findMaximumPairProductEfficient(nums);
		
	}

}
