package com.leetcode.interview.questions;

public class Pascal_Triangle {
	
	public static void printPascal(int numRows) {
		int arr[][]=new int[numRows][numRows];
		
		for(int i=0;i<numRows;i++){ 
		        for(int j=0;j<=i;j++){
		           if(j==0) // if column is first column
		           arr[i][j]=1;
		           else if(i==j) // if column is diagonal column or last column of that row.
		           arr[i][j]=1;
		           else
		           arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
		        }
		    }
		    for(int j=0;j<numRows;j++){
		        System.out.print(arr[numRows-1][j]+" "); // as Array so indexing will start from 0.
		    }
		    System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPascal(5);
	}

}
