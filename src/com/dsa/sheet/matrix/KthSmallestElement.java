package com.dsa.sheet.matrix;

import java.util.PriorityQueue;

public class KthSmallestElement {
   
	private static int kthSmallestElement(int[][] mat, int k) {

		PriorityQueue<GridElement> queue = new PriorityQueue<>(); // Min Heap
		
		for(int j=0;j<mat.length;j++)
			queue.add(new GridElement(0,j,mat[0][j]));
		
		int count = 0;
		while(!queue.isEmpty()) {
			
			GridElement temp = queue.poll();
			count++;
			
			if(count == k)
				return temp.data;
			
			int rowIndex = temp.rowIndex;
			int columnIndex = temp.columnIndex;
			
			if(rowIndex+1 < mat.length) {
				queue.add(new GridElement(rowIndex+1, columnIndex, mat[rowIndex+1][columnIndex]));
			}
		}
		
		return -1;
	}
	
	public static int kthLargestElement(int[][] mat, int k) {
     PriorityQueue<GridElement> queue = new PriorityQueue<>(); // Min Heap
		
		for(int j=0;j<mat.length;j++)
			queue.add(new GridElement(mat.length - 1,j,mat[mat.length - 1][j]));
		
		int count = 0;
		while(!queue.isEmpty()) {
			
			GridElement temp = queue.poll();
			count++;
			
			if(count == k)
				return temp.data;
			
			int rowIndex = temp.rowIndex;
			int columnIndex = temp.columnIndex;
			
			if(rowIndex-1 >= 0) {
				queue.add(new GridElement(rowIndex-1, columnIndex, mat[rowIndex-1][columnIndex]));
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {
	            { 1, 2, 3, 5 },
	            { 4, 4, 4, 8 },
	            { 7, 8, 9, 10 },
	            { 8, 8, 11, 12 }};
		
		int k = 3;
		//System.out.println("The "+k+"th smallest element is : "+kthSmallestElement(mat,k));
		System.out.println("The "+k+"th largest element is : "+kthLargestElement(mat,k));
	}

}
