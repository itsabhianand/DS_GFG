package com.dsa.sheet.linkedlist;

// Refer take u forward.

public class FlattenLinkedList {
	
	static Node head;
	static class Node{
		int data;
		Node next, bottom;
		Node(int d){
			data = d;
			next = null;
			bottom = null;
		}
	}
	
    //  5 -> 10 -> 19 -> 28
    //  |    |     |     |
    //  V    V     V     V
    //  7    20    22    35
    //  |          |     |
    //  V          V     V
    //  8          50    40
    //  |                |
    //  V                V
    //  30               45
    
	public static Node mergeTwoLists(Node a, Node b) {
		Node temp = new Node(0);
		Node res = temp;
		
		while(a != null && b != null) {
			if(a.data < b.data) {
				temp.bottom = a;
				temp = temp.bottom;
				a = a.bottom;
			}
			else {
				temp.bottom = b;
				temp = temp.bottom;
				b = b.bottom;
			}
			
	}
		if(a != null) {
			temp.bottom = a;
		}
		else {
			temp.bottom = b;
		}
		
		return res.bottom;
	}
	public static Node flatten (Node root) {
		if(root == null || root.next == null) {
			return root;
		}
		
		root.next = flatten(root.next);
		
		root = mergeTwoLists(root, root.next);
		return root;
	}
	// Method to print element of Linked List
	   void printList(Node node)
	    {
		   while(node != null) {
	        	System.out.println(node.data + " ");
	        	node = node.bottom;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlattenLinkedList list = new FlattenLinkedList();
		list.head = new Node(5);
		list.head.bottom = new Node(7);
		list.head.bottom.bottom = new Node(8);
		list.head.bottom.bottom.bottom = new Node(30);
		list.head.next = new Node(10);
		list.head.next.bottom = new Node(20);
		list.head.next.next = new Node(19);
		list.head.next.next.bottom = new Node(22);
		list.head.next.next.bottom.bottom = new Node(50);
		list.head.next.next.next = new Node(28);
		list.head.next.next.next.bottom = new Node(35);
		list.head.next.next.next.bottom.bottom = new Node(40);
		list.head.next.next.next.bottom.bottom.bottom = new Node(45);
		System.out.println("Printing Final flatten LL is :");
		head = FlattenLinkedList.flatten(head);
		list.printList(head);
	}

}
