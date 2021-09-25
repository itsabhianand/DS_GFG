package com.dsa.sheet.bonus.questions;

public class GuessNumberHigherOrLower {
	
	public static int isNumberPicked(int pickedNum) {
	  if(pickedNum  == 6) {
		  return 0;
	  }
	  else if(pickedNum > 6) {
		  return 1;
	  }
	  else{
		  return -1;
	  }
	}
	
	public static int findNumber(int n) {
	int start = 1;
	int end = n;
	int ans = -1;
	
	while(start <= end) {
		int mid = start + (end - start)/2;
		
		if(isNumberPicked(mid) == 1) {
			ans = mid;
			end = mid - 1;
		}
		else if(isNumberPicked(mid) == -1) {
			start = mid + 1;
		}
		else {
			ans = mid;
			break;
		}
	}
	
	return ans;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 10;
       int pick = 6;
       int res = findNumber(n);
       System.out.println(res);
	}

}
