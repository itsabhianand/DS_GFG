package com.dsa.sheet.linkedlist;

// refer take u forward

// refer take u forward approach

public class DetectCycleLinkedList {
	
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
	
	public static boolean hasCycle(Node head) {
		// 1--> 2 --> 3-- > 4 --> 5 --> 3
		if(head == null || head.next == null) {
			return false;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				return true;
			}
			
		}
		return false;
	}
	
	public static Node removeCycle(Node head) {
		// 1--> 2 --> 3-- > 4 --> 5 --> 3
		if(head == null || head.next == null) {
			return head;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				break;
			}
			
		}
		
		if(slow == fast) {
			if(fast == head) {
				while(slow.next != fast) {
					slow = slow.next;
				}
				slow.next = null;
			}
			else {
				fast = head;
				
				  while(slow.next != fast.next) {
					  
					 slow = slow.next; 
					 fast = fast.next; 
				}
				 
				/*
				 * while(fast.next.next != slow) { fast = fast.next.next; }
				 */
				fast.next = null;
			}
		}
		
		return head;
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectCycleLinkedList list = new DetectCycleLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		//list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next = list.head.next.next;
		boolean result = DetectCycleLinkedList.hasCycle(head);
		if(result == true) {
			System.out.println("Given LL has Cycle present.");
			DetectCycleLinkedList.removeCycle(head);
			list.printList(head);
		}
		else {
			System.out.println("Given LL has Cycle absent");
		}
	}

}
