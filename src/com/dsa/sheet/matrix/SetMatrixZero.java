package com.dsa.sheet.matrix;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
	
	public static void setMatrixZeros(int mat[][]) {
		int n = mat.length;
		int m = mat[0].length;
		
		Set<Integer> rows = new HashSet<Integer>();
		Set<Integer> columns = new HashSet<Integer>();
		
		for(int i =0; i < n ; i++) {
			for(int j=0; j < m; j++) {
				if(mat[i][j] == 0) {
					rows.add(i);
					columns.add(j);
				}
			}
		}
		
		for(int i =0; i < n; i++) {
			for(int j =0; j <m; j++) {
				if(rows.contains(i) || columns.contains(j)) {
					mat[i][j] = 0;
				}
			}
		}
	}
    
	public static void printMatrix(int mat[][]){
        for (int i = 0; i < mat.length; i ++){
            for (int j = 0; j < mat[0].length; j ++){
                System.out.print( mat[i][j] );
            }
                System.out.println("");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1, 0, 0, 1},
			           {1, 1, 1, 1},
			           {1, 1, 1, 1}};
		
		setMatrixZeros(mat);
		printMatrix(mat);
	}

}
