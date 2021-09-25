package com.dsa.sheet.searching.sorting;

public class SqareRoot {
	
	public static void main(String[] args) {

		System.out.println(findSquareRoot(8));
	}

	// We take , num/mid = mid and we don't take num = mid * mid (we are not taking as for large number, it will give problem for mid *mid).
	private static int findSquareRoot(int num) {

		int start = 1;
		int end = num;

		if(num<2) // Handling edge cases of 0 and 1. (Just return 0 and 1)
			return num;
		
		while(start<end) {
			int mid = start + (end - start)/2; // To check overflow condition.
			if(mid==num/mid)
				return mid;
			else if(mid > num/mid)
				end = mid;
			else 
				start = mid + 1;
		}
		return start - 1; //Remember to return start -1 as return the floor value
	}
}
