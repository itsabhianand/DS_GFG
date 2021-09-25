package com.leetcode.interview.questions;

public class Power {
		
	public static double implementPower(double x, int n) {
		if(n>=0) {
			return findPositivePower(x, n);
		}
		else {
			return 1/findPositivePower(x, Math.abs(n));
		}
	}
    
	public static double findPositivePower(double x, int n) {
		
		if(n == 0) { // Base condition
			return 1;
		}
		
		double answer = findPositivePower(x, n/2); // Recursive call
		if(n % 2 == 0) {
			return answer * answer;
		}
		else {
			return x*answer*answer;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           double x = 4;
           int n = -5;
           double answer = implementPower(x, n);
           System.out.println(answer);
	}

}
