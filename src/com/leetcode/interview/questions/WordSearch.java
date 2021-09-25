package com.leetcode.interview.questions;

public class WordSearch {
	
	public static boolean exist(char board[][], String word) {
		
		if(board == null || board.length == 0)
			return false;
		
		for(int i=0; i < board.length; i++ ) {
			for(int j = 0; j < board[0].length; j++) {
				if(board[i][j] == word.charAt(0) && dfsWordSearch(board, i, j, 0, word)) {
					return true;
				}
			}
		}
		
		return false;
	}

	private static boolean dfsWordSearch(char[][] board, int i, int j, int count, String word) {
		// TODO Auto-generated method stub
		if(count == word.length()) {
			return true;
		}
		
		// Handling all negative result cases.
		if(i < 0 || i == board.length || j < 0 || j == board[0].length || board[i][j] != word.charAt(count) ) {
			return false;
		}
		
		char temp = board[i][j];
		board[i][j] = '*';
		
		boolean found = dfsWordSearch(board, i+1, j, count + 1, word) || dfsWordSearch(board, i-1, j, count + 1, word) ||
				        dfsWordSearch(board, i, j+1, count + 1, word) || dfsWordSearch(board, i, j-1, count + 1, word);
		
		board[i][j] = temp;
		return found;
		
		
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char board[][] = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
       String word = "ABCCED";
       boolean res = exist(board, word);
       System.out.println(res);
	}

}
