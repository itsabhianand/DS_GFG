 package com.dsa.sheet.linkedlist;

// Refer take u forward Iterative approach

public class ReverseLinkedListIterative {
		
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
	
	// 85 --- > 15 ---> 4 ---> 20
	Node reverse(Node head) {
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
	
	 void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedListIterative list = new ReverseLinkedListIterative();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		System.out.println("Print original LL : ");
		list.printList(head); // Original LL
		
		head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head); // Reversed LL
	}

}
