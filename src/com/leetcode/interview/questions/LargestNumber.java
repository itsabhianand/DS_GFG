package com.leetcode.interview.questions;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,30,34,5,9};
	       String res = largestNumber(nums);
	       System.out.println(res);
	}

	private static String largestNumber(int[] nums) {
		// TODO Auto-generated method stub
		if(nums.length == 0 || nums == null) {
			return "";
		}
		
		String[] str = new String[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			str[i] = String.valueOf(nums[i]);
		}
		
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String s1 = o1 + o2;
				String s2 = o2 + o1;
				
				return s2.compareTo(s1);
			}
			
		};
		
		Arrays.sort(str, comp);
		
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			sb.append(s);
		}
		
		
		return sb.toString();
	}

}
