package com.leetcode.interview.questions;

public class RemoveNthNodeFromEndOfList {
	
	static Node head;
	static class Node {
		Node next;
		int data;
		Node(){
			next = null;
		}
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static void printList(Node node) {
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	// 2--->3--->7--->5---->6--->4
	public static Node removeNode(Node head, int k) {
		Node explorer = head;
		Node anchor = head;
		
		while(explorer!= null && k > 0){
			explorer = explorer.next;
			k--;
		}
		
		while(explorer.next != null){
			explorer = explorer.next;
			anchor = anchor.next;
		}
		
		anchor.next = anchor.next.next;
        
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNthNodeFromEndOfList list = new RemoveNthNodeFromEndOfList();
		list.head = new Node(2);
		list.head.next = new Node(3);
		list.head.next.next = new Node(7);
		list.head.next.next.next = new Node(5);
		list.head.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next = new Node(4);
		int k = 2;
		System.out.println("Printing Original LL is :");
		printList(head);
		Node result = removeNode(head, k);
		System.out.println();
		System.out.println("Printing LL after deletion is :");
		printList(result);
	}

}
