package com.dsa.sheet.bonus.questions;

// Using Binary Search , logn solution , Refer codebix.
public class ArrangingCoins {
	
	public static int arrangingCoins(int n) {
		
		// logn solution : binary search
		int start = 0; 
		int end = n;
		
		while(start<= end) {
			int mid = start + (end - start)/2;
			
			if(n >= (mid * (mid + 1))/2) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		return start -1;
		
		
	}
	
	// O(1) solution
	/*
	 * 1+2+3+...+x = n -> (1+x)x/2 = n -> x^2+x = 2n -> x^2+x+1/4 = 2n +1/4 ->
	 * (x+1/2)^2 = 2n +1/4 -> (x+0.5) = sqrt(2n+0.25) -> x = sqrt(2n+0.25) - 0.5
	 */
	
	public static int findarrangingcoinsLevel(int n) {
		return (int) (Math.sqrt(2*n +0.25) - 0.5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 12;
        int res = arrangingCoins(n);
        System.out.println(res);
        int res1 = findarrangingcoinsLevel(n);
        System.out.println(res1);
	}

}
