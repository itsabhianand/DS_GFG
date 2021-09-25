package com.sde.sheet.stacks.queues;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
	
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int x) {
		q2.add(x);
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}
	
	public void pop() {
		if(q1.isEmpty()) {
			return;
		}
		int x = q1.remove();
		System.out.println("Item popped out is : " + x);
	}
	
	public void top() {
		if(q1.isEmpty()) {
			return;
		}
		q1.peek();
		System.out.println("Top element is : " + q1.peek());
	}
	
	public void printStack() {
		if(q1.isEmpty()) {
			return;
		}
		else {
			System.out.println("Stack element is : " + q1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementStackUsingQueue s = new ImplementStackUsingQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.printStack();
		s.pop();
		s.printStack();
		s.top();
		s.pop();
		s.printStack();
		s.top();
	}

}
