package com.dsa.sheet.linkedlist;

import java.util.HashSet;
import java.util.Set;

import com.dsa.sheet.linkedlist.RemoveDuplicatesFromSortedLinkedList.Node;

// Refer GFG.

public class RemoveDuplicatesFromUnSortedList {
	

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
	 
	  // 10----> 18 ---> 15 ---> 15----> 17----> 12----> 17 
	   public static Node removeDuplicates(Node head) {
		   Set<Integer> set = new HashSet<Integer>();
		   Node curr = head;
		   Node prev = null;
		   
		   while(curr != null) {
			   if(set.contains(curr.data)) {
				   prev.next = curr.next;
			   }
			   else {
				   set.add(curr.data);
				   prev = curr;
			   }
			   curr = curr.next;
		   }
		   
		   return head;
		   
	   }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromUnSortedList list = new RemoveDuplicatesFromUnSortedList();
		list.head = new Node(10);
		list.head.next = new Node(18);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(15);
		list.head.next.next.next.next = new Node(17);
		list.head.next.next.next.next.next = new Node(12);
		list.head.next.next.next.next.next.next = new Node(17);
		System.out.println("Original LL is :");
		list.printList(head);
		System.out.println("\n");
		System.out.println("Modified LL is :");
		head = RemoveDuplicatesFromUnSortedList.removeDuplicates(head);
		list.printList(head);
	}

}
