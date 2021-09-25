package com.leetcode.interview.questions;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
         String res = countAndSay(n);
         System.out.println(res);
	}

	private static String countAndSay(int n) {
		// TODO Auto-generated method stub
		if(n == 1)
			return "1";
		
		if(n == 2)
			return "11";
		
		String s = "11";
		for(int i = 3; i <=n ; i++) {
			String t = "";
			s = s + "$";
			int count  = 1;
			
			for(int j = 1; j < s.length(); j++) {
				if(s.charAt(j-1) != s.charAt(j)) {
					t = t + String.valueOf(count);
					t = t + s.charAt(j-1);
					count = 1;
				}
				else {
					count++;
				}
			}
			
			 s = t;
		}
		
		return s;
	}

}
