package com.dsa.sheet.linkedlist;

public class IsLinkedListCircular {
	
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
		 
		 // // 4 ----> 5 ---> 3 ---> 6 ---> 4
		 public static boolean isCircular(Node head) {
			 // if LL is empty means it is circular.
			 if(head == null) {
				 return true;
			 }
			 
			 Node node = head.next;
			 // Stop if Circular and stop if Linear
			 while(node != null && node != head) {
				 node = node.next;
			 }
			 
			 return (node == head);
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsLinkedListCircular list = new IsLinkedListCircular();
		list.head = new Node(4);
		list.head.next = new Node(5);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(6);
		list.head.next.next.next.next = list.head; //To check circular
		boolean result = IsLinkedListCircular.isCircular(head);
		if(result == true) {
			System.out.println("Yes LL is circular");
		}
		else {
			System.out.println("No LL is not circular");
		}
		
	}

}
