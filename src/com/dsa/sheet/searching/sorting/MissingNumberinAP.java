package com.dsa.sheet.searching.sorting;

// TC : O(1) and SC : O(1)

public class MissingNumberinAP {
	
	public static int missingNumerInAP(int a, int b, int c) {
		if(c == 0) {
			if(a == b) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			if((b-a)/c < 0) {
				return 0;
			}
			else {
				if((b-a)%c == 0) {
					return 1;
				}
				else {
					return 0;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 1;
       int b = 7;
       int c = 2;
       int result = MissingNumberinAP.missingNumerInAP(a, b, c);
       if(result == 1) {
    	   System.out.println("Element is present");
       }
       else {
    	   System.out.println("Element is missing");
       }
	}

}
