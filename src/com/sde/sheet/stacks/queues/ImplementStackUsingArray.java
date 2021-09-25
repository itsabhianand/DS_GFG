package com.sde.sheet.stacks.queues;

// Take class ImplementStackUsingArray as Stack built from Array.

public class ImplementStackUsingArray {
	
	static int MAX; // size of an stack.
	int top;
	int stack[]; // declare Array as Max size.
	
	ImplementStackUsingArray(int size)
	{
		MAX = size;
		top = -1;
		stack = new int[MAX];
	}
	
	public boolean push(int x) {
		if(top >= (MAX - 1)) {
			System.out.println("Stack is Overflown");
			return false;
		}
		
		else {
			top++;
			stack[top] = x;
			System.out.println(x + " pushed into stack.");
			return true;
		}
	}
   
	public void pop() {
		if(top < 0) {
			System.out.println("Stack is underflown");
			return;
		}
		
		else {
			int x = stack[top];
			top--;
			System.out.println("Item popped is : " + x);
		}
	}
	
	public void peek() {
		if(top < 0) {
			System.out.println("Stack is underflown");
			return;
		}
		
		else {
			int x = stack[top];
			System.out.println("Peek Element is : " + x);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementStackUsingArray s = new ImplementStackUsingArray(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop(); 
        s.peek();
	}

}
