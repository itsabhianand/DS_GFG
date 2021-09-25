package com.sde.sheet.stacks.queues;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static boolean isBalanced(String str) {
		
		Stack<Character> s = new Stack<Character>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '{' || ch == '[' || ch == '(') {
				s.push(ch);
			}
			else {
				if(ch == '}' && s.peek() == '{') {
					s.pop();
				}
				else if(ch == ']' && s.peek() == '[') {
					s.pop();
				}
				else if(ch == ')' && s.peek() == '(') {
					s.pop();
				}
				else {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{[()]}[{)]";
		boolean result = BalancedParanthesis.isBalanced(str);
		if(result) {
			System.out.println("String is balanced");
		}
		else {
			System.out.println("String is not balanced.");
		}
	}

}
