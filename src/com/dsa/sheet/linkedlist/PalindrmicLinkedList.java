package com.dsa.sheet.linkedlist;

//Check if LL is palindrome or not , Refer take u forward

public class PalindrmicLinkedList {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
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
	 // 1----> 2 --> 3---> 3---> 2 --> 1
	public static boolean isPalindrome(Node head) {
		if(head == null || head.next == null) {
			return true;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		slow.next = reverse(slow.next);
		
		slow = slow.next;
		
		while(slow != null) {
			if(head.data != slow.data) {
				return false;
			}
			head = head.next;
			slow = slow.next;
		}
		return true;
	}
	
	public static Node reverse(Node head) {
		// 3---> 2 --> 1 
		// After Reverse  1---> 2---> 3----> null
		//  null<--3
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
			 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindrmicLinkedList list = new PalindrmicLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(3);
		list.head.next.next.next.next = new Node(2);
		list.head.next.next.next.next.next = new Node(1);
		boolean result = PalindrmicLinkedList.isPalindrome(head);
		if(result == true) {
			System.out.println("LL is palindrome");
		}
		else {
			System.out.println("LL is not palindrome");
		}
	}

}
