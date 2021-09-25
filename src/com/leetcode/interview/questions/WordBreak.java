package com.leetcode.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "pepcodinglovesmangoicecream";
        List<String> dictionary = new ArrayList<String>();
        dictionary.add("loves");
        dictionary.add("pep");
        dictionary.add("coding");
        dictionary.add("pepcoding");
        dictionary.add("ice");
        dictionary.add("cream");
        dictionary.add("icecream");
        dictionary.add("man");
        dictionary.add("go");
        dictionary.add("mango");
        
        boolean res = wordBreak(s, dictionary);
        System.out.println(res);
	}

	private static boolean wordBreak(String s, List<String> dictionary) {
		// TODO Auto-generated method stub
		
		int dp[] = new int[s.length()];
		
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0; j <= i; j++) {
				String w2Check = s.substring(j, i + 1);
				if(dictionary.contains(w2Check)) {
					if(j > 0) {
						dp[i] = dp[i] + dp[j-1];
					}
					else {
						dp[i] = dp[i] + 1;
					}
				}
			}
			
		}
		System.out.println(dp[s.length() - 1]);
		return dp[s.length() - 1] > 0;
	}

}
