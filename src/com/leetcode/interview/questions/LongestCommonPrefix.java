package com.leetcode.interview.questions;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
	   if(strs == null || strs.length == 0) {
		   return "";
	   }
	   String prefix = strs[0];
	   int i = 1;
	   while(i < strs.length) {
		   
		   while(!strs[i].startsWith(prefix) && !prefix.isEmpty()) {
			   prefix = prefix.substring(0, prefix.length() - 1);
		   }
		   
		   i++;
	   }
	   
   return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] strs = {"flower","flow","cat"};
      String res = longestCommonPrefix(strs);
      System.out.println(res);
	}

}
