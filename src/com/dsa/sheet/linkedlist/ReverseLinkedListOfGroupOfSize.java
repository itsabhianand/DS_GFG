package com.dsa.sheet.linkedlist;

// Refer take u forward solution

public class ReverseLinkedListOfGroupOfSize {
	
	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	// 1 ---> 2 ---->  3---> 4---> 5---> 6----> 7----> 8 
	Node reverse(Node head, int k) {
		if(head == null || k == 1) {
			return head;
		}
		
		Node dummy = new Node(0);
		dummy.next = head;
		
		Node curr = dummy, nex = dummy, pre = dummy;
		
		int count  = 0;
		while(curr.next != null) {
			curr = curr.next;
			count++;
		}
		
		while(count >= k) {
			curr = pre.next;
			nex = curr.next;
			for(int i = 1; i < k; i++) {
				curr.next = nex.next;
				nex.next = pre.next;
				pre.next = nex;
				nex = curr.next;
			}
			pre = curr;
			count = count - k;
		}
		return dummy.next;
	}
	
	public void printList(Node node) {
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedListOfGroupOfSize list = new ReverseLinkedListOfGroupOfSize();
		int k = 3;
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next.next = new Node(7);
		list.head.next.next.next.next.next.next.next = new Node(8);
		System.out.println("");
		System.out.println("Original Linked List");
		list.printList(head); // Original LL
		
		head = list.reverse(head , k);
		System.out.println("");
        System.out.println("Reversed linked List");
        list.printList(head); // Reversed LL
	}

}
