package com.leetcode.interview.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "ratc";
	     String s2 = "cart";
	      boolean result = checkAnagramsUsingHashing(s1, s2);
	      if(result) {
	    	  System.out.println("Both Strings are Anagrams");
	      }
	      else {
	    	  System.out.println("Both Strings are not Anagrams");
	      }
		}

	private static boolean checkAnagramsUsingHashing(String s1, String s2) {
		// TODO Auto-generated method stub
		
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int i = 0;
		
		while(i < c1.length) {
			if(map.containsKey(c1[i])) {
				map.put(c1[i], map.get(c1[i]) + 1);
			}
			else {
				map.put(c1[i], 1);
			}
			i++;
	     }
		
		int j = 0 ;
		
		while(j < c2.length) {
			if(map.containsKey(c2[j])) {
				map.put(c2[j], map.get(c2[j]) - 1);
			}
			
			if(!map.containsKey(c2[j]) || map.get(c2[j]) < 0) {
				return false;
			}
			j++;
		}
		
		return true;
	}
	
	public static boolean checkAnagramsUsingSorting(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		char[] c2 = s2.toCharArray();
		Arrays.sort(c2);
		int i = 0;
		while(i < c1.length) {
			if(c1[i] != c2[i])
				return false;
			i++;
		}
		return true;
	}

}
