package com.dsa.sheet.linkedlist;

// refer GFG

import com.dsa.sheet.linkedlist.RemoveDuplicatesFromUnSortedList.Node;

public class MoveLastElementToFirst {
	
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
	 
	 // 10---->18--->15----> 16
	 public static Node moveElementToFirst(Node head) {
		 if(head == null || head.next == null) {
			 return head;
		 }
		 
		 Node last = head;
		 Node secLast = null;
		 
		 while(last.next != null) {
			 secLast = last;
			 last = last.next;
		 }
		 
		 secLast.next = null;
		 last.next = head;
		 head = last;
		 
		 return head;
	 }
	 // 10---->18--->15----> 16
	 public static Node moveElementToFirstApproach(Node head) {
		 Node curr = head;

		 Node temp = null;

		 while(curr != null && curr.next != null && curr.next.next != null){
		      curr = curr.next;
		 }

		   temp = curr.next;
		   curr.next = null;
		   temp.next = head;
		   
		   return temp;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveLastElementToFirst list = new MoveLastElementToFirst();
		list.head = new Node(10);
		list.head.next = new Node(18);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(16);
		System.out.println("Original LL is :");
		list.printList(head);
		System.out.println("\n");
		//head = MoveLastElementToFirst.moveElementToFirst(head);
		//System.out.println("Modified LL is :");
		//list.printList(head);
		//System.out.println();
		head = moveElementToFirstApproach(head);
		System.out.println("Modified 2nd approach LL is :");
		list.printList(head);
		
	}

}
