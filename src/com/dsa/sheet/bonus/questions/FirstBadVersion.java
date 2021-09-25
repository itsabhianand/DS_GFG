package com.dsa.sheet.bonus.questions;

// Using Binary search, refer codebix.
public class FirstBadVersion {
	
	public static boolean isbadVersion(int bad) {
		if(bad == 3 ||bad == 4 || bad == 5 || bad == 6 || bad == 7 || bad ==8 || bad ==9)
			return true;
		else
			return false;
	}
    
	public static int findFirstBadVersion(int n) {
		int start = 1;
		int end = n;
		int ans = -1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(isbadVersion(mid)) {
				ans = mid;
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 9;
       int bad = 3;
       int result = findFirstBadVersion(n);
       System.out.println(result);
	}

}
