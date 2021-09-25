package com.dsa.sheet.linkedlist;

// Refer Knowledge Center

public class FirstElementInCycle {
	
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
	 
	 public static int firstElementInCycle(Node head) {
			if(head == null || head.next == null) {
				return head.data;
			}
			
			Node slow = head;
			Node fast = head;
			
			while(fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
				if(fast == slow) {
					slow = head;
					break;
				}
				
			}
			while(slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}	
			return slow.data;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstElementInCycle list = new FirstElementInCycle();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next.next = list.head.next;
		int data = FirstElementInCycle.firstElementInCycle(head);
		System.out.println("First element found is :" + data);
	}

}
