package com.leetcode.interview.questions.set2;

import java.util.HashMap;

public class LongestSubStringWithExactlyKDistinctCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "aabcbcdbca";
       int k = 2;
       int result = findLongestSubString(s, k);
       System.out.println(result);
	}

	private static int findLongestSubString(String s, int k) {
		// TODO Auto-generated method stub
		int ans = 0;
		
		int i = -1;
		int j = -1;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		while(true) {
			boolean f1 = false;
			boolean f2 = false;
			while(i < s.length() - 1) {
				f1 = true;
				i++;
				char ch = s.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0) + 1);
				
				if(map.size() < k) {
					continue;
				}
				else if(map.size() == k) {
					int len = i - j;
					if(ans < len) {
						ans = len;
					}
				}
				else {
					break;
				}	
			}
			
			while(j < i) {
				j++;
				f2 = true;
				char ch = s.charAt(j);
				if(map.containsKey(ch)) {
					if(map.get(ch) == 1) {
						map.remove(ch);
					}
					else {
						map.put(ch, map.get(ch) - 1);
					}
				}
				
				if(map.size() > k) {
					continue;
				}
				else if(map.size() == k) {
					int len = i - j;
					if(ans < len) {
						ans = len;
					}
					
					break;
				}
			}
			
			if(f1 == false && f2 == false) {
				break;
			}
		}
		
		return ans;
	}

}
