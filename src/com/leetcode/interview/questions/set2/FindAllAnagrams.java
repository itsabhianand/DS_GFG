package com.leetcode.interview.questions.set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Refer codebix.
// Return starting index of all possible anagrams
public class FindAllAnagrams {
	
	public static List<Integer> findAnagrams(String s, String p){
		
		int st = 0;
		int end = p.length() - 1;
		
		List<Integer> ans = new ArrayList<Integer>();
		Map<Character, Integer> hms = new HashMap<Character, Integer>();
		Map<Character, Integer> hmp = new HashMap<Character, Integer>();
		
		for(int i = 0; i < p.length(); i++) {
			char c = p.charAt(i);
			hmp.put(c, hmp.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i <= end; i++) {
			char ch = s.charAt(i);
			hms.put(ch, hms.getOrDefault(ch, 0) + 1);
		}
		
		if(hmp.equals(hms)) {
			ans.add(st);
			st++; 
			end++;
		}
		
		while(end < s.length()) {
			char ch = s.charAt(end);
			hms.put(ch, hms.getOrDefault(ch, 0) + 1);
			
			char chold = s.charAt(st - 1);
			if(hms.containsKey(chold)) {
				hms.put(chold, hms.get(chold) - 1);
				
				if(hms.get(chold) == 0) {
					hms.remove(chold);
				}
			}
			
			if(hms.equals(hmp)) {
				ans.add(st);
			}
			
			st++;
			end++;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "cbaebabacd";
        String p = "abc";
       List<Integer> list =  findAnagrams(s, p);
       System.out.println(Arrays.toString(list.toArray()));
	}

}
