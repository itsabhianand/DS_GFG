package com.leetcode.interview.questions;

// Print true if palindrome else false.
// Consider alphanumeric only, also considers case insensitive.
// Always ignores special characters.
public class ValidPalindrome {
	
	private static boolean isValidPalindromeByBinarySearch(String str) {

		if(str == null)
			return false;
		
		if(str.length()==1)
			return true;
		
		int i = 0;
		int j = str.length()-1;
		boolean flag = true;
		while(i<=j) {

			char left = str.charAt(i);
			char right = str.charAt(j);

			if(isValidCharacter(left)) {
				if(isValidCharacter(right)) {
					if(Character.toLowerCase(left) == Character.toLowerCase(right)) {
						i++;
						j--;
						flag = true;
					}
					else
						return false;
				}
				else
					j--;
			}
			else {
				i++;
			}
		}
		return flag;
	}

	private static boolean isValidCharacter(char ch) {

		int value = ch;

		if((value>=65 && value<=90) || (value>=97 && value<=122) || (value>=48 && value<=57))
			return true;

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A man, a plan, a canal: Panama";
		System.out.println("String : " +str);
		System.out.println();
		System.out.println("The given string is palindrome : " +isValidPalindromeByBinarySearch(str));
	}

}
