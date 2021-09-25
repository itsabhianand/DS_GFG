package com.dsa.sheet.bonus.questions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginWord = "hit";
		String endWord = "cog";
		
		Set<String>wordList =new HashSet<>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		
		System.out.println(findShortestChainLength(wordList,beginWord,endWord));
	}

	private static int findShortestChainLength(Set<String> wordList, String beginWord, String endWord) {
		// TODO Auto-generated method stub
		if(!wordList.contains(endWord))
			return 0;
		
		int level = 0;
		Queue<String> q =new LinkedList<String>();
		
		q.add(beginWord);
		
		while(!q.isEmpty()) {
			
			level = level + 1;
			int size = q.size();
			
			// Iterating till size of queue, means string words we have in queue.
			for(int i=0; i< size; i++) {
				char ch[] = q.peek().toCharArray(); // h,i,t
				q.poll();
				// Iterating till individual word length.
				for(int j=0; j < ch.length; j++) {
					char original = ch[j];
					// iterating for each alphabet.
					for(char c ='a'; c<='z'; c++) {
						ch[j] = c;
						
						if(String.valueOf(ch).equalsIgnoreCase(endWord)) {
							return level + 1;
						}
						
						if(!wordList.contains(String.valueOf(ch))) {
							continue;
						}
						
						wordList.remove(String.valueOf(ch));
						q.add(String.valueOf(ch));
					}
					
					// Restore the original character
	                // at the current position
					ch[j] = original;
				}
				
			}
			
		}
		
		return 0;
	}

}
