package com.leetcode.interview.questions.set2;


// Finding Middle element in O(1) TC, Refer code Library.
public class MiddleElementOfStack {
	
	static class Node { 
        int data; 
        Node next;
        Node prev;
        Node(int d) 
        { 
            data = d; 
            next = null;
            prev = null;
        } 
    }
    
	static Node dummy = new Node(-1);
	static Node head = dummy;
	static Node mid = dummy;
	
	static int count = 0;
	
	public static void push(int data) {
		Node curr = new Node(data);
		curr.prev = null;
		curr.next = head;
		head.prev = curr;
		head = curr;
		count++;
		
		if(count == 1) {
			mid = curr;
		}
		else if(count % 2 == 0) {
			mid = mid.prev;
		}	
		
	}
	
	public static int pop() {
		
		if(count == 0) {
			System.out.println("Stack is Empty");
		}
		
		Node temp = head;
		int x = head.data;
		head = head.next;
		if(head != null) {
			head.prev = null;
		}
		
		count--;
		if(count % 2 != 0) {
			mid = mid.next;
		}
		
		System.out.println("Element popped out is -----> " + x);
		return x;
		
	}
	
	public static void middle() {
		if(count == 0) {
			System.out.println("Stack is Empty");
		}
		System.out.println("Middle element is : ");
		System.out.println(mid.data);
	}
	
	public static void printData() {
		Node curr = head;
		if(count == 0) {
			System.out.println("Stack is Empty");
		}
		
		System.out.println("Printing elements in DLL :");
		for(int i =0; i < count; i++) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        printData();
        System.out.println();
        middle();
        pop();
        printData();
        System.out.println();
        middle();
        pop();
        printData();
        System.out.println();
        middle();
        
	}

}
