package com.dsa.sheet.array2;

// WAP to find factorial of Large Number.
// Refer Coding for all video logic

public class FactorialOfLargest {
	
	public static void printFactorial(int number) {
		int resultArray[] = new int[1000];
		resultArray[0] = 1;
		int size = 1;
		
		for(int i=2; i<=number; i++) {
			size = multiply(size, resultArray, i);
		}
		
		for(int m=size-1; m>=0; m--) {
			System.out.println(resultArray[m]);
		}
		
	}
	
	public static int multiply(int size, int array[], int num) {
		int carry = 0;
		for(int j=0; j<size; j++) {
			int product = array[j] * num + carry;
			array[j] = product%10;
			carry = product/10;
		}
		
		while(carry != 0) {
			array[size] = carry%10;
			carry = carry/10;
			size++;
		}
		
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int number = 6;
            FactorialOfLargest.printFactorial(number); 
	}

}
