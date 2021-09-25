package com.sde.sheet.stacks.queues;

// Implement Min Stack using Array

public class MinimumStack {
	
	int max;
	int top;
	int[] array;
	int[] min;
	
	public MinimumStack(int size) {
		max = size;
		top = -1;
		array = new int[max];
		min = new int[max];
	}
	
	public void push(int num){
		
		if(top >= max - 1)
			System.out.println("Stack Overflown issue.");
		else {
			top++;
			array[top] = num;
			
			if(top == 0)
				min[top] = array[top];
			else
				min[top] = Math.min(array[top], min[top-1]);
		}
	}
	
	public int pop(){
		
		if(top < 0)
			System.out.println("Stack underflown");
		int temp = array[top];
		top--;
		
		return temp;
	}
	
	public int getMin() {
		return min[top];
			
	}
	
	public int peek(){
		int result = -1;
		if(top<0)
		System.out.println("Stack underflown");
		else {
			result = array[top];
		}
		return result;
	}
	
	public void display() {
		System.out.println("Elements in the Stack");
		for(int i=0;i<=top;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumStack stack= new MinimumStack(4);
		stack.push(1);
		stack.push(8);
		stack.push(5);
		stack.push(2);
		System.out.println("Min Element : "+stack.getMin());
		System.out.println();
		stack.display();
		System.out.println();
		System.out.println("Peek Element : " +stack.peek());
		System.out.println();
		System.out.println("Poped Element : " +stack.pop());
		System.out.println();
		System.out.println("Min Element : "+stack.getMin());
		System.out.println("Peek Element : " +stack.peek());
		System.out.println();
		stack.display();
	}

}
