package com.dsa.sheet.bonus.questions;

// https://www.geeksforgeeks.org/maximize-count-of-0s-in-left-and-1s-in-right-substring-by-splitting-given-binary-string/

public class MaximizeOneZeroSplit {
	
	public static int findMaxCount(String s) {
		
		int totalOnes = 0;
		int maxCount = 0;
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				totalOnes++;
			}
		}
		
		int ones = 0, zeros = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				ones++;
			}
			else {
				zeros++;
			}
			
			maxCount = Math.max(maxCount, zeros + (totalOnes - ones));
		}
		
		return maxCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1000110111101";
		int count = findMaxCount(s);
		System.out.println(count);
	}

}
