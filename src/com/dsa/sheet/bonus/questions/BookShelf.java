package com.dsa.sheet.bonus.questions;

// books[i][0] = thickness/width
// books[i][1] = height
// Return the minimum possible height that the total bookshelf can be after placing shelves in this manner.
public class BookShelf {

	public static int minHeightShelves(int[][] books, int shelf_width) {
		// store number of books in a var
	    int n = books.length;
	    
	    // make a dp array of size n,sw + 1 --> sw + 1 because of starting from 0
	    
	    int[][] dp = new int[n][shelf_width + 1];
	    
	    // Now call recursivly and find min height
	    
	    return minHeightBookShelf(books, dp, 0, shelf_width, 0, shelf_width);
	    
	}

	public static int minHeightBookShelf(int[][] books, int[][] dp, int currBook, int sw_left, 
	                              int currHeight, int sw) {
	    
	    if(currBook >= books.length) return currHeight;
	    
	    
	    if(dp[currBook][sw_left] != 0) return dp[currBook][sw_left];
	    
	    // Now there are two possibilities 
	    
	    // 1. if sw_left >= width of currbook so we can include this book in this shelf also
	    // {{1,1},{2,3},{2,3},{1,1},{1,1},{1,1},{1,2}};
	    int includeCurrBookInCurrShelf = Integer.MAX_VALUE;
	    if(sw_left >= books[currBook][0]) {
	        
	        includeCurrBookInCurrShelf = minHeightBookShelf(books, dp, currBook + 1, sw_left - books[currBook][0], Math.max(currHeight, books[currBook][1]), sw);
	        
	    }
	    
	    // 2. if we exclude currBook and place it in new Shelf 
	    
	    int excludeCurrBookFromCurrShelf = currHeight + minHeightBookShelf(books, dp, currBook + 1, 
	                                                sw - books[currBook][0], books[currBook][1], sw);
	    
	    int minHeight = Math.min(includeCurrBookInCurrShelf, excludeCurrBookFromCurrShelf);
	    
	    dp[currBook][sw_left] = minHeight;
	    
	    return minHeight;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] books = {{1,1},{2,3},{2,3},{1,1},{1,1},{1,1},{1,2}};
		   int shelf_width = 4;
		   int height = minHeightShelves(books,shelf_width);
		   System.out.println(height);
	}

}
