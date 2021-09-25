package com.dsa.sheet.linkedlist;


// Refer GFG.

public class MultiplyTwoNumbers {
	
	static Node head;
	static Node head2;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	// Method to print element of Linked List
	static void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	 public static long multiplyTwoNumbers(Node first, Node second) {
		 
		 long num1 = 0;
		 long num2 = 0;
		 while(first != null || second != null) {
			 if(first != null) {
				 num1 = num1*10 + first.data;
				 first = first.next;
			 }
			 
			 if(second != null) {
				 num2 = num2*10 + second.data;
				 second = second.next;
			 }
		 }
		 
		 return num1*num2;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyTwoNumbers list1 = new MultiplyTwoNumbers();
		list1.head = new Node(3);
		list1.head.next = new Node(2);
		list1.head.next.next = new Node(1);
		System.out.println("Print first List :");
		list1.printList(list1.head);
		System.out.println("\n");
		MultiplyTwoNumbers list2 = new MultiplyTwoNumbers();
		list2.head2 = new Node(1);
		list2.head2.next = new Node(2);
		System.out.println("Printing second list :");
		list2.printList(list2.head2);
		System.out.println("\n");
		long result = MultiplyTwoNumbers.multiplyTwoNumbers(list1.head, list2.head2);
		System.out.println("Multiplication of 2 numbers is :" + result);
	}

}
