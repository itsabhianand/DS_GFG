package com.leetcode.interview.questions;

public class SquareRoot {
	
	private static int findSquareRoot(int num) {

		int start = 1;
		int end = num;

		if(num<2)
			return num;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(mid==num/mid) // To avoid big long value if mid * mid condition is taken.
				return mid;
			else if(mid > num/mid)
				end = mid - 1;
			else 
				start = mid + 1;
		}
		return start - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSquareRoot(79));
	}

}
