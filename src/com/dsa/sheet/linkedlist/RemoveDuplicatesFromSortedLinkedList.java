package com.dsa.sheet.linkedlist;

//Refer GFG

public class RemoveDuplicatesFromSortedLinkedList {
	
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
	 
	 // 1---> 2---> 2---> 2---> 3----> 3----> 4----> 5
	 public static Node removeDuplicates(Node head) {
		 Node curr = head;
		 Node nex = null;
		 
		
		  while(curr.next != null) 
		  { 
			  if(curr.data == curr.next.data) { 
				  nex = curr.next.next;
		           curr.next = nex; 
		      } 
			  else { 
		    	  curr = curr.next; 
		        } 
			 }
		 
		 
		 return head;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedLinkedList list = new RemoveDuplicatesFromSortedLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(3);
		list.head.next.next.next.next.next = new Node(3);
		list.head.next.next.next.next.next.next = new Node(4);
		list.head.next.next.next.next.next.next.next = new Node(5);
		System.out.println("Original LL:");
		list.printList(head);
		System.out.println("\n");
		head = RemoveDuplicatesFromSortedLinkedList.removeDuplicates(head);
	    System.out.println("Modified LL:");
	    list.printList(head);
	}

}
