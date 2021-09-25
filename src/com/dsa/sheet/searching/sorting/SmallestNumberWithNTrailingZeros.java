package com.dsa.sheet.searching.sorting;

// Refer code Library

// Given a number n. The task is to find the smallest number whose 
//factorial contains at least n trailing zeroes.
 

public class SmallestNumberWithNTrailingZeros {
	
	public static int findNum(int n) {
		int low = 0;
		int high = 5*n; // Always 0 is calculated on the basis of number of 5.
		
		while(low < high) {
			int mid  = (low + high)/2;
			if(check(mid, n)) {
				high = mid;
			}
			else
			{
				low = mid + 1;
			}
		}
		
		return low;
	}
	
	public static boolean check(int mid, int n) {
		int temp = mid;
		int count = 0;
		int factor = 5;
		
		while(factor <= temp) {
			count = (int) (count + Math.floor(temp/factor));
			factor= factor*5; // That's why we are multiplying factor * 5 to check range for binary Search.
		}
		
		return (count >= n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 2;
        int answer = SmallestNumberWithNTrailingZeros.findNum(n);
        System.out.println(" Smallest number find with n trailing zero is : " + answer);
	}

}
