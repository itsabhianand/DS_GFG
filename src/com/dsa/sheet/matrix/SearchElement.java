package com.dsa.sheet.matrix;

public class SearchElement {
	
	public static void searchElement(int[][] mat, int k) {
		int n = mat.length;
		int i = 0;
		int j = n - 1;
		
		while(i<n && j >= 0) {
			if(mat[i][j] == k) {
				System.out.println("The element "+ k+" found at index : [" +i+","+j+"]");
				return;
			}
			else if(mat[i][j] > k) {
				j--;
			}
			
			else {
				i++;
			}
		}
		
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }};
		
		searchElement(mat, 15);
		
	}

}
