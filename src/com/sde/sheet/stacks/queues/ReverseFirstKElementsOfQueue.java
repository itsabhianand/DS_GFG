package com.sde.sheet.stacks.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {
	
	static Queue<Integer> queue;
	
	// Function to reverse the first
    // K elements of the Queue
    static void reverseQueueFirstKElements(int k)
    {
        if (queue.isEmpty() == true
            || k > queue.size())
            return;
        if (k <= 0)
            return;
 
        Stack<Integer> stack = new Stack<Integer>();
 
        // Push the first K elements into a Stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }
 
        // Enqueue the contents of stack
        // at the back of the queue
        while (!stack.empty()) {
            queue.add(stack.peek());
            stack.pop();
        }
 
        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }
 
    // Utility Function to print the Queue
    static void printQueue()
    {
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        int k = 5;
        reverseQueueFirstKElements(k);
        System.out.println("Queue after reversing first K elements is : ");
        printQueue();
	}

}
