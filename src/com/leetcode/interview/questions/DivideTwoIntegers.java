package com.leetcode.interview.questions;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 10;
        int divisor = 3;
        int res = divideTwoIntegers(dividend, divisor);
        System.out.println(res);
	}

	private static int divideTwoIntegers(int dividend, int divisor) {
		// TODO Auto-generated method stub
		boolean isNegative = ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) ? true : false;
		long absDividend = Math.abs((long)dividend);
		long absDivisor = Math.abs((long)divisor);
		
		long result = 0;
		
		while(absDivisor <= absDividend) {
			long tempDivisor = absDivisor;
			int count = 1;
			while(tempDivisor <= absDividend) {
				tempDivisor = tempDivisor << 1; // Means multiply by 2
				count = count << 1;
			}
			
			result = result + (count >> 1); // Means divide by 2.
			absDividend = absDividend - (tempDivisor >> 1);
		}
		
		return isNegative ? (int) ~result + 1 : result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)result;
	}

}
