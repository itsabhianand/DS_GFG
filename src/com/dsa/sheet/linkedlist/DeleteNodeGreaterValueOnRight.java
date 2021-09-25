package com.dsa.sheet.linkedlist;

// Refer Aditya Rajiv

public class DeleteNodeGreaterValueOnRight {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	
	// Method to print element of Linked List
	 void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	 // 12--->15---> 10----> 11---> 5---> 6----> 2----> 3
	 // After Reverse :  3 ---> 2 --> 6 ---> 5 ---> 11 ---> 10 ---> 15 ---> 12
	 
	 public static Node deleteNode(Node head) {
		 head = reverseList(head);
		 
		 Node current = head;
		 Node maxNode = head;
		 Node temp;
		 
		 while(current != null && current.next != null) {
			 if(current.next.data < maxNode.data) {
				 temp = current.next;
				 current.next = temp.next;
			 }
			 else {
				 current = current.next;
				 maxNode = current;
			 }
		 }
		 
		 head = reverseList(head);
		 
		 return head;
	 }
	 
	 public static Node reverseList(Node head) {
		 Node prev = null;
		 Node curr = head;
		 Node next = null;
		 
		 while(curr != null) {
			 next = curr.next;
			 curr.next = prev;
			 prev = curr;
			 curr = next;
		 }
		  head = prev;
		 return head;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteNodeGreaterValueOnRight list = new DeleteNodeGreaterValueOnRight();
		list.head = new Node(12);
		list.head.next = new Node(15);
		list.head.next.next = new Node(10);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next.next = new Node(2);
		list.head.next.next.next.next.next.next.next = new Node(3);
		System.out.println("Original LL is : ");
		list.printList(head);
		System.out.println("\n");
		head = DeleteNodeGreaterValueOnRight.deleteNode(head);
		System.out.println("Final Resultant Array is :");
		list.printList(head);
	}

}
