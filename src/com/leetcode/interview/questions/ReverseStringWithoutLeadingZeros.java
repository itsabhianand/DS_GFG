package com.leetcode.interview.questions;

public class ReverseStringWithoutLeadingZeros {
	
	public static void reverse(String s) {
		char ch[] = s.toCharArray();
		boolean flag = false;

		for(int j = s.length()-1;j>=0;j--) {
			
			if(!flag) {
				if(s.charAt(j) != '0') {
					System.out.print(s.charAt(j));
					flag=true;
				}
			}
			else
				System.out.print(s.charAt(j));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "10101000";
       reverse(s);
	}

}
