package com.leetcode.interview.questions;


// Using Bit Manipulation.
// Refer avaneesh.shastry
public class SumOfTwoIntegers {
	
	public static int getSum(int a, int b) {
		
		while(b != 0) {
		int answer = a ^ b;
		int carry = (a & b) << 1;
		a = answer;
		b = carry;
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 1;
        int b = 2;
        int result = getSum(a, b);
        System.out.println(result);
	}

}
