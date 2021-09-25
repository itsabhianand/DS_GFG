package com.leetcode.interview.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {
	
	public static int findLongestSubStringWithoutRepeatingUsingSet(String s) {
		Set<Character> set = new HashSet<Character>();
		 int left = 0;
		 int right = 0;
		 int maxLen = Integer.MIN_VALUE;
		 // abcaabcdba
		 while(right < s.length()) {
			 if(!set.contains(s.charAt(right))) {
				 set.add(s.charAt(right));
				 maxLen = Math.max(maxLen, set.size());
				 right++;
			 }
			 else {
				 set.remove(s.charAt(right));
				 left++;
			 }
		 }
		 
		 return maxLen;
		
	}
    
	public static int findLongestSubStringWithoutRepeatingUsingMap(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		 int left = 0;
		 int right = 0;
		 int maxLen = Integer.MIN_VALUE;
		 
		 while(right < s.length()) {
			 if(map.containsKey(s.charAt(right))) {
				 left = Math.max(map.get(s.charAt(right)) + 1 , left);
			 }
			 
			 map.put(s.charAt(right), right);
			 maxLen = Math.max(maxLen, right - left + 1);
			 right ++;
		 }
		 
		 return maxLen;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcaabcdba";
		int len = findLongestSubStringWithoutRepeatingUsingSet(str);
		System.out.println(len);
		int len1 = findLongestSubStringWithoutRepeatingUsingMap(str);
		System.out.println(len1);
	}

}
