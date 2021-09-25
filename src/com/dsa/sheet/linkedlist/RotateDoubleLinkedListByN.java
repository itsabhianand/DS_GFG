package com.dsa.sheet.linkedlist;


// Refer Aditya Rajiv video 52, need to rotate by N in anti-clock wise directions 
public class RotateDoubleLinkedListByN {
	
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
   
   // 1 --- > 2 ---> 3 ----> 4 ----> 5
   
   // 3 4 5 1 2
   public static Node rotateList(Node head, int n) {
	   Node curr =head;
	   
	   for(int i=1; i<n; ++i) {
		   curr = curr.next;
	   }
	   
	   Node nthNode = curr;
	   while(curr.next != null) {
		   curr = curr.next;
	   }
	   
	   curr.next = head;
	   head.prev =curr;
	   head = nthNode.next;
	   nthNode.next = null;
	   head.prev = null;
	   
	   return head;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateDoubleLinkedListByN list = new RotateDoubleLinkedListByN();
		list.head = new Node(1);
		list.head.prev = null;
		list.head.next = new Node(2);
		list.head.next.prev = list.head;
		list.head.next.next = new Node(3);
		list.head.next.next.prev = list.head.next;
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.prev = list.head.next.next;
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.prev = list.head.next.next.next;
		int n = 2;
		System.out.println("Original LL is : ");
		list.printList(head);
		head = RotateDoubleLinkedListByN.rotateList(head, n);
		System.out.println("\n");
		System.out.println("Reversing Double LL is :");
		list.printList(head);
	}

}
