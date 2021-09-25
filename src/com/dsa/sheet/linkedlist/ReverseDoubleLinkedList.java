package com.dsa.sheet.linkedlist;

// Refer Vivekanand Khyade - Algorithm Every Day

public class ReverseDoubleLinkedList {
	
	static Node head;
	 
    static class Node {
 
        int data;
        Node next, prev;
 
        Node(int d)
        {
            data = d;
            next = prev = null;
        }
    }
    
   public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
   
   public static Node reverse(Node head) {
	   Node temp = null;
	   Node current = head;
	   while(current != null) {
		   temp = current.prev;
		   current.prev = current.next;
		   current.next = temp;
		   current = current.prev;
	   }
	   // To avoid NullPointer exception if there is one element in DLL. Also in general case
	   // it will be at second last node.
	   if(temp != null) {
		   head = temp.prev;
	   }
	   
	   return head;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDoubleLinkedList list = new ReverseDoubleLinkedList();
		list.head = new Node(1);
		list.head.prev = null;
		list.head.next = new Node(2);
		list.head.next.prev = list.head;
		list.head.next.next = new Node(3);
		list.head.next.next.prev = list.head.next;
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.prev = list.head.next.next;
		System.out.println("Original LL is : ");
		list.printList(head);
		head = ReverseDoubleLinkedList.reverse(head);
		System.out.println("\n");
		System.out.println("Reversing Double LL is :");
		list.printList(head);
	}

}
