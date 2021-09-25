package com.dsa.sheet.linkedlist;

// Refer GFG

public class AddOneToLinkedList {
	
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
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
	 
	 //  1 ---> 9 ---> 9 --> 9
	 static Node reverse(Node head) {
			Node prev = null;
			Node current = head;
			Node next = null;
			
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			
			head = prev;
			
			return head;
		}
	 
	 // 7 ---> 6---> 8 ---> 4
	 static Node addOneUtil(Node head) {
		 Node res = head;
		 Node temp = null;
		 int carry = 1;
		 int sum = 0;
		 
		 while(head != null) {
			 sum = carry + head.data;
			  if(sum >= 10) {
				  carry = 1;
			  }
			  else {
				  carry = 0;
			  }
			  
			  sum =sum % 10;
			  head.data = sum;
			  temp = head; // To keep track of last element so if 999 + 1 becomes 1000
			  head = head.next;
			 
		 }
		 
		 if(carry > 0) {
			 temp.next = new Node(carry);
		 }
		 
		 return res;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddOneToLinkedList list = new AddOneToLinkedList();
		list.head = new Node(7);
		list.head.next = new Node(6);
		list.head.next.next = new Node(8);
		list.head.next.next.next = new Node(4);
		System.out.println("Original LL is :");
		list.printList(head);
		System.out.println("\n");
		head = reverse(head);
		head = addOneUtil(head);
		head= reverse(head);
		System.out.println("Modifief LL is :");
		list.printList(head);
	}

}
