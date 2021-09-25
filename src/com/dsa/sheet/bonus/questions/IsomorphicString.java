package com.dsa.sheet.bonus.questions;

import java.util.Arrays;

public class IsomorphicString {
   
	// String length must be same.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "badc";
		String s2 = "tata";

		System.out.println(AreIsomorphic(s1,s2));
	}
    // b == t and a == a
	private static boolean AreIsomorphic(String s, String t) {
		// TODO Auto-generated method stub
		int mappingDictStoT[] = new int[256];
		Arrays.fill(mappingDictStoT, -1);
		
		int mappingDictTtoS [] = new int[256];
		Arrays.fill(mappingDictTtoS, -1);
		
		for(int i=0 ; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			// Case 1: No mapping exists in either of the dictionaries
			if(mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
				mappingDictStoT[c1] = c2;
				mappingDictTtoS[c2] = c1;
			}
			
			if(!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
				return false;
			}
		}
		
		return true;
	}

}
