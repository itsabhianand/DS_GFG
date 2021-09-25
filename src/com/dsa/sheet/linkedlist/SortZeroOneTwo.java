package com.dsa.sheet.linkedlist;

import com.dsa.sheet.linkedlist.ReverseLinkedListIterative.Node;

// Refer Aditya Rajiv explaination, video 52

public class SortZeroOneTwo {
	
static Node head;
	
	static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    }
	
	 void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	 public static Node sortLinkedList(Node head) {
		 Node curr = head;
		 int zero=0;
		 int one=0;
		 int two=0;
		 
		 while(curr != null) {
			 if(curr.data == 0) {
				 zero++;
			 }
			 else if(curr.data == 1) {
				 one++;
			 }
			 else if(curr.data == 2) {
				 two++;
			 }
			 curr = curr.next;
		 }
		 
		 Node p1= head;
		 
		 while(p1 != null) {
			 if(zero > 0) {
				 p1.data = 0;
				 zero--;
			 }
			 else if(one > 0) {
				 p1.data = 1;
				 one--;
				 
			 }
			 else if(two > 0) {
				 p1.data = 2;
				 two--;
			 }
			 
			 p1 = p1.next;
		 }
		 
		 return head;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortZeroOneTwo list = new SortZeroOneTwo();
		list.head = new Node(2);
		list.head.next = new Node(1);
		list.head.next.next = new Node(0);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(1);
		list.head.next.next.next.next.next = new Node(0);
		list.head.next.next.next.next.next.next= new Node(1);
		list.head.next.next.next.next.next.next.next= new Node(2);
		System.out.println("Original LL is : ");
		list.printList(head);
		head = SortZeroOneTwo.sortLinkedList(head);
		System.out.println("\n");
		System.out.println("Sorted LL is : ");
		list.printList(head);
	}

}
