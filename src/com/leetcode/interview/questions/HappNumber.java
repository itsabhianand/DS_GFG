package com.leetcode.interview.questions;

import java.util.HashSet;
import java.util.Set;

public class HappNumber {
	
	public static boolean happyNumber(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while(n != 1 && !set.contains(n)) {
		     set.add(n);
		     int sum = 0;
		     
		     while(n > 0) {
		     sum = sum + (int) Math.pow(n%10, 2);
		     n = n/10;
		     }
		     
		     n = sum;
		}
		
		return n == 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 27;
       boolean result = happyNumber(n);
       System.out.println(result);
	}

}
