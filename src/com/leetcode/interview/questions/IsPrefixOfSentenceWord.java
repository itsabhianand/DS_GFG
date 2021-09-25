package com.leetcode.interview.questions;

public class IsPrefixOfSentenceWord {
	
	 public static int isPrefixOfWord(String sentence, String searchWord) {
	    
		 int index = 1;
		 for(String s : sentence.split(" ")) {
			 if(s.startsWith(searchWord)) {
				 return index;
			 }
			 else {
				 index++;
			 }
		 }
		 
		 return -1;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String sentence = "i love eating burger";
        String searchWord = "burg";  
        int result =  isPrefixOfWord(sentence, searchWord);
        System.out.println(result);
	}

}
