package com.dsa.sheet.matrix;

public class MaximumOneRow {
	
	public static void findMaximumOneInRows(int[][]  mat) {
		int i = 0;
		int j = mat.length-1;
		int row = -1;
		
		while(i <= mat.length -1 && j >=0) {
			if(mat[i][j] == 1) {
				row = i;
				j--;
			}
			
			else {
				i++;
			}
		}
		
		System.out.print("The maximum 1's are present in the row : " + row);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat =
			{
					{ 0, 0, 0, 1, 1 },
					{ 0, 0, 1, 1, 1 },
					{ 0, 0, 0, 0, 0 },
					{ 0, 1, 1, 1, 1 },
					{ 0, 0, 0, 0, 1 }
			};

		findMaximumOneInRows(mat);
	}

}
