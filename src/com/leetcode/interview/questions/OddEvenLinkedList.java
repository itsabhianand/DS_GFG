package com.leetcode.interview.questions;

public class OddEvenLinkedList {
    
	static Node head;
	
	static class Node{
		Node next;
		int data;
		
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	
	 static void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	
	public static Node formOddEvenLinkedList(Node head) {
		
		Node odd = head;
		Node even = head.next;
		Node evenHead = even;
			
			if(head == null || head.next == null) {
				return head;
			}
			
			while(odd.next != null && even.next != null) {
				odd.next = even.next;
				odd = odd.next;
				even.next = odd.next;
				even = even.next;
				
			}
			
			odd.next = evenHead;
		
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenLinkedList list = new OddEvenLinkedList();
		list.head = new Node(2);
		list.head.next = new Node(1);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(5);
		list.head.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next = new Node(4);
		list.head.next.next.next.next.next.next = new Node(7);
		System.out.println("Original LL is : ");
		printList(head);
		head = formOddEvenLinkedList(head);
		System.out.println();
		System.out.println("Odd Even LL is : ");
		printList(head);
	}

}
