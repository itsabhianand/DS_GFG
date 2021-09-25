package com.dsa.sheet.array2;

//Program to calculate minimum operations required to make an array palindrome.

public class MinimumOperationRequiredForPalindrome {
	
	public static int minimumOperations(int array[], int length) {
		// 55,222,333,12,44,55
		int count = 0;
		int i = 0;
		int j = array.length - 1;
		while(i <= j) {
			
			if(array[i] == array[j]) {
				i++;
				j--;
			}
			else if(array[i] > array[j]) { //Operations performed to make an array palindrome and to add all middle elements.
				j--;
				array[j] = array[j] + array[j+1];
				count++;
			}
			else {
				i++;
				array[i] = array[i] + array[i-1];
				count++;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = {55,222,333,12,44,55};
      int length = array.length;
      int count = MinimumOperationRequiredForPalindrome.minimumOperations(array, length);
      System.out.println("Minimum Operations Required is : " + count);
	}

}
