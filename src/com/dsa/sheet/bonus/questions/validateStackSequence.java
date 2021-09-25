package com.dsa.sheet.bonus.questions;

import java.util.Stack;

public class validateStackSequence {
	
	private static boolean validateSequence(int[] pushed, int[] popped) {
		Stack<Integer> stack = new Stack<Integer>();
		int j =0;
		
		for(int n : pushed) {
			stack.push(n);
			while(!stack.isEmpty() && stack.peek() == popped[j]) {
				stack.pop();
				j++;
			}
		}
		
		return j == pushed.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int popped[] = {1,2,3,4,5};
        int pushed[] = {4,5,3,1,2};
        
     System.out.println(" Stack sequences are valid : "+validateSequence(pushed,popped));
	}

}
