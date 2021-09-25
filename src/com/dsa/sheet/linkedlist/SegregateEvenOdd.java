package com.dsa.sheet.linkedlist;


//Refer IDeserve

public class SegregateEvenOdd {

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
	 
	 // 2 ---> 3 ---> 7---> 5---> 6----> 4
	 public static Node segregateEvenOdd(Node head) {
		 Node oddHead = null;
		 Node evenHead = null;
		 Node lastOdd = null;
		 Node lastEven = null;
		 
		 Node curr = head;
		 
		 while(curr != null) {
			 if(curr.data % 2== 0) {
				 if(evenHead == null) { // To track first even element encountered
					 evenHead = curr;
					 lastEven = curr;
				 }
				 else {
					 lastEven.next = curr;
					 lastEven = curr;
				 }
			 }
			 else {
				 
				 if(oddHead == null) { // // To track first odd element encountered
					 oddHead = curr;
					 lastOdd = curr;
				 }
				 else {
					 lastOdd.next = curr;
					 lastOdd = curr;
				 }
			 }
			 
			 curr = curr.next;
		 }
		 
		 if(evenHead != null) {
			 head = evenHead;
		 }
		 
		 lastEven.next = oddHead;
		 lastOdd.next = null;
		 
		 return head;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegregateEvenOdd list = new SegregateEvenOdd();
		list.head = new Node(2);
		list.head.next = new Node(3);
		list.head.next.next = new Node(7);
		list.head.next.next.next = new Node(5);
		list.head.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next = new Node(4);
		System.out.println("Original LL is ");
		list.printList(head);
		head = SegregateEvenOdd.segregateEvenOdd(head);
		System.out.println("\n");
		System.out.println("LL after segregation is : ");
		list.printList(head);
	}

}
