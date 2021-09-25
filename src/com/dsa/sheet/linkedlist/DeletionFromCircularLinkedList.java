package com.dsa.sheet.linkedlist;

public class DeletionFromCircularLinkedList {
	
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
	static void printList(Node node)
	  {
	     while (node != null && node.next != head) {
		System.out.print(node.data + " ");
		 node = node.next;
	  }
	     System.out.print(node.data + " ");
    }
	// 4----5---3---6--
	//   |------------|
	private static Node deleteFromCircularLinkedList(Node head, int data) {

		Node dummy = head;

		while(dummy!=null && dummy.next!=head) {
			dummy = dummy.next;
		}

		
		// if there is only one node 
		
		if(head!=null && head.next==head) {
			head = null;
			return head;
		}
		// deletion of first node
		if(head!=null && head.data == data) {
			head = head.next;
			dummy.next = head;
			return head;
		}

		// deletion of last node
		else if(dummy!=null && dummy.data==data) {
			Node node = head;

			while(node!=null && node.next!=dummy) {
				node = node.next;
			}
			node.next = head;
		}

		// deletion of any middle nodes
		else {

			Node current = head;

			while(current!=null && current.next!=null) {

				if(current.next.data==data) {
					current.next = current.next.next;
					break;
				}
				current = current.next;
			}
		}
		
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeletionFromCircularLinkedList list = new DeletionFromCircularLinkedList();
		list.head = new Node(4);
		list.head.next = new Node(5);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(6);
		list.head.next.next.next.next = head;
		System.out.println("Printing Original LL :");
		printList(head);
		head = deleteFromCircularLinkedList(head, 5);
		System.out.println();
		System.out.println("Printing Modified LL :");
		printList(head);
	}

}
