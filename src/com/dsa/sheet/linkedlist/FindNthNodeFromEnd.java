package com.dsa.sheet.linkedlist;


// Refer Algo Every Day

public class FindNthNodeFromEnd {
	
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
	 
	 public static Node findNode(Node head, int n) {
		 // 2 --> 3 --> 7 --> 5 --> 6 --> 4--->8
		 Node slow = head;
		 Node fast = head;
		 int count =1;
		 while(count <= n-1) {
			 fast = fast.next;
			 count =count + 1;
		 }
		 
		
		  while(fast.next != null) 
		  { 
			  slow = slow.next; 
			  fast = fast.next; 
		  }
		 
		 return slow;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNthNodeFromEnd list = new FindNthNodeFromEnd();
		list.head = new Node(2);
		list.head.next = new Node(3);
		list.head.next.next = new Node(7);
		list.head.next.next.next = new Node(5);
		list.head.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next = new Node(4);
		list.head.next.next.next.next.next.next = new Node(8);
		System.out.println("Original LL is ");
		list.printList(head);
		System.out.println("\n");
		int n = 4;
		Node node = FindNthNodeFromEnd.findNode(head, n);
		System.out.println("Nth Node from end is :" + node.data);
	}

}
