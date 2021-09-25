 package com.dsa.sheet.matrix;

import java.util.HashMap;
import java.util.Map;

public class CommonElements {
	
	public static void findCommonElements(int[][] mat) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		System.out.println("Common Elements are : ");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				if(i == 0) {
					map.put(mat[i][j], 1);
				}
				
				// map.get(mat[i][j]) == i : To avoid any duplicate elements in a row.
				if(i > 0 && map.containsKey(mat[i][j]) && map.get(mat[i][j]) == i){
					map.put(mat[i][j], i + 1);
				
				if(i == mat.length - 1) {
					System.out.print(mat[i][j] + " ");
				}
			  }
			}
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] =
		    {
		        { 2, 4, 3, 8, 7 },
		        { 4, 7, 1, 3, 2 },
		        { 3, 5, 2, 1, 3 },
		        { 4, 5, 0, 2, 3 },
		    };
		findCommonElements(mat);
	}

}
