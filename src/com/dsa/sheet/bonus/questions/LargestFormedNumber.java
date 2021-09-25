package com.dsa.sheet.bonus.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestFormedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums1[] = {6,8,0,0,5,6,7,6,7,4,3,6,9,9};
        int nums2[] = {5,9,6,7,4,3,5,6,8,3,5,6,7,6};
        
        String num1 = formLargestNumber(nums1);
        String num2 = formLargestNumber(nums2);
        
        System.out.println("Number 1 : "+num1);
		System.out.println("Number 2 : "+num2);
        int ans = num2.compareTo(num1);
        
        if(ans > 0) {
        	System.out.println("num2 will make Largest Number !!!");
        }
        else {
        	System.out.println("num1 will make Largest Number !!!");
        }
        
	}
	
	public static String formLargestNumber(int nums[]) {
		List<String> list = new ArrayList<String>();
		
		for(int n : nums) {
			list.add(String.valueOf(n));
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String s1 = o1 + o2;
				String s2 = o2 + o1;
				
				return s2.compareTo(s1);
			}
			
		});
		
		String res = "";
		
		for(String str : list) {
			res = res + str;
		}
		
		return res;
	}

}
