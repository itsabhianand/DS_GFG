package com.dsa.sheet.bonus.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Refer Pepcoding.

public class GroupAnagrams {
	
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();
        // eat, tea, tan, ate, nat, bat
        for(String s : strs) { 
          HashMap<Character, Integer> fmap = new HashMap<>();
          for(int i =0; i < s.length(); i++) {
        	  Character ch = s.charAt(i);
        	  fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
          }
          
          if(!bmap.containsKey(fmap)) {
        	  ArrayList<String> list = new ArrayList<>();
        	  list.add(s);
        	  bmap.put(fmap, list);
          }
          else {
        	  ArrayList<String> list = bmap.get(fmap);
        	  list.add(s);
          }
        }
        
        ArrayList<List<String>> res = new ArrayList<>();
        
        for(ArrayList<String> val : bmap.values()) {
        	res.add(val);
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str[] = {"eat","tea","tan","ate","nat","bat"};
       List<List<String>> list = groupAnagrams(str);
       for(List<String> l1 : list) {
    	   System.out.println("Printing grouped List :");
    	   for(String s : l1) {
    		   System.out.println(s);
    	   }
       }
	}

}
