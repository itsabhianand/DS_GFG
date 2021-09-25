package com.dsa.sheet.linkedlist;

// Refer take u forward

public class CloneLinkedList {
	
	static Node head;
	static class Node{
		int data;
		Node next, random;
		Node(int d){
			data = d;
			next = null;
			random = null;
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
       
    public static Node cloneLinkedList(Node head) {
    	Node iter = head;
    	Node front = head;
    	// Step 1 code , creating copy node and inserting right after original
    	while(iter != null) {
    		front = iter.next;
    		Node copy = new Node(iter.data);
    		iter.next = copy;
    		copy.next = front;
    		iter = front;
    	}
    	
    	// step 2 , Point Random pointers for deep LL
    	iter = head;
    	
    	while(iter != null) {
            if(iter.random != null) {
    		  iter.next.random = iter.random.next;	
    		}
            
            iter = iter.next.next; // bcz we have deep ll node inserted in between above
    	}
    	// step 3 //Take care of next pointers of deep LL, bring back original and deep LL.
    	
    	iter = head;
    	Node pseudohead = new Node(0); // To return head of deep LL as pseudohead.next
    	Node copy = pseudohead;
    	while(iter != null) {
    		front = iter.next.next;
    		copy.next = iter.next;
    		iter.next = front;
    		copy = copy.next; // Move ahead
    		iter = front; // Move ahead
    	}
    		
    	return pseudohead.next;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneLinkedList list = new CloneLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.random = list.head.next.next.next;
		list.head.next.random = list.head;
		list.head.next.next.random = null;
		list.head.next.next.next.random = list.head.next;
		System.out.println("Original LL is : ");
		list.printList(head);
		System.out.println("\n");
		head = CloneLinkedList.cloneLinkedList(head);
		System.out.println("Deep copy LL is :");
		list.printList(head);
	}

}
