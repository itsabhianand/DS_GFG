package com.dsa.sheet.searching.sorting;

public class CountSquares {
	
	public static int countSquares(int Num) {
		int a = (int) Math.sqrt(Num);
			if(a * a == Num) { // Check if Num is perfect square like 25,36,49
				return a - 1;
			}
			else { // if not perfect square like 30, 32
				return a;
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = CountSquares.countSquares(32);
		System.out.println("Count of perfect squares less than Num is :" + count);
	}

}
