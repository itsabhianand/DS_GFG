package com.sde.sheet.stacks.queues;

import java.util.Stack;

public class ImplementQueueUsingStack {
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public void enQueue(int x) {
		s1.push(x);
		System.out.println("Element pushed in Queue is : " + x);
	}
	
	public int deQueue() {
		if(s2.size() != 0) {
			int y = s2.pop();
			System.out.println("Item popped out from Queue is : " + y);
			return y;
		}
		
		if(s1.isEmpty()) {
			return -1;
		}
		
		while(s1.size() != 0) {
			s2.push(s1.pop());
		}
		
		int x = s2.pop();
		System.out.println("Item popped out from Queue is : " + x);
		return x;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementQueueUsingStack q = new ImplementQueueUsingStack();
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(7);
		q.enQueue(9);
		q.deQueue();
		q.deQueue();
	}

}
