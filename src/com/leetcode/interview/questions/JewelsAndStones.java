package com.leetcode.interview.questions;

// Refer Codebix.

public class JewelsAndStones {
	
	public static int findJewelsCount(String s, String j) {
		
		char[] ch = s.toCharArray();
		int n = ch.length;
		int count = 0;
		
		for(int i = 0; i < ch.length; i++) {
			if(j.indexOf(ch[i]) != -1) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "aAAbbbb";
       String j = "aA";
       int res = findJewelsCount(s, j);
       System.out.println(res);
	}

}
