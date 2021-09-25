package com.dsa.sheet.arrays;

public class FindMaxDifferenceZerosOnes {
	
	private static int findMaxSubstring(String s) {

		int currentMax = 0; int finalMax = 0;
		for(int i=0; i<s.length(); i++) {
			
			int current = 0;
			if(s.charAt(i) == '0')
				current = 1;
			else
				current = -1;
			currentMax = Math.max(currentMax + current, current);
			finalMax = Math.max(finalMax, currentMax);
			
		}
		return finalMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "11000010001"; // -- 6 from index 2 to index 9
		System.out.println(findMaxSubstring(s));
	}

}
