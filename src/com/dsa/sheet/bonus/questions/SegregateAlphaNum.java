package com.dsa.sheet.bonus.questions;

import java.util.Arrays;

public class SegregateAlphaNum {
	private static void alternateAplphaNumeric(String s) {
	int left = 0;
	int right = s.length() - 1;
	// a,b,1,2,d,c,3,4
	char ch[] = s.toCharArray();
	while(left<right) {
		
		if(ch[left] > 96 && ch[left] < 123)
			left++;
		else if(ch[right] > 47 && ch[right] < 58)
			right--;
		else {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		}
	
	System.out.println("Segregation : "+Arrays.toString(ch));
		/*
		 * Arrays.sort(ch,left,ch.length-1); Arrays.sort(ch,0,left);
		 */
	
	for(int i = 1;i<s.length()-1;i=i+2) {
		
		char temp = ch[left];
		ch[left] = ch[i];
		ch[i] = temp;
		left++;
	}
	System.out.println("Alternate : "+String.valueOf(ch));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab12dc34";
		alternateAplphaNumeric(s);
	}

}
