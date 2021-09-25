package com.leetcode.interview.questions;

public class FrequencyCharacterPrint {
      
	public static void printFrequencyCharacter(char ch[]) {
		int count = 1;
		if(ch == null || ch.length == 0)
			return;
		int i = 1;
		for(; i < ch.length; i++) {
			if(ch[i] == ch[i-1]) {
				count++;
			}
			else {
				System.out.print(ch[i-1] + "," + count);
				count = 1;
				
			}
		}
		if(i == ch.length)
		System.out.println(ch[i-1] + "," + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char ch[] = {'a','a','a','a','b','b','b','c','c','d','d','d','e', 'f','f'};
       printFrequencyCharacter(ch);
       
	}

}
