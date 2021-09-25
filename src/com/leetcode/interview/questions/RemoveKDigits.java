package com.leetcode.interview.questions;

public class RemoveKDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "1432219";
      int k = 3;
      String res = removeKDigits(s, k);
      System.out.println(res);
	}

	private static String removeKDigits(String s, int k) {
		// TODO Auto-generated method stub
		int digits = s.length() - k;
		if(s.length() <= k)
			return "0";
		
		int top = -1;
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			while(top >= 0 && ch[top] > ch[i] && k > 0) {
				top--;
				k--;
			}
			top++;
			ch[top] = ch[i];
		}
		
		int start = 0;
		
		while(ch[start] == '0') {
			start++;
		}
		
		String ans = "";
		for(int j = start; j < digits; j++) {
			ans = ans + ch[j];
		}
		
		if(ans.equals(""))
			return "0";
		
		return ans;
	}

}
