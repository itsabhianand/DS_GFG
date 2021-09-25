package com.dsa.sheet.linkedlist;

import com.dsa.sheet.linkedlist.AddOneToLinkedList.Node;

// Refer GFG and Take u forward approach. Good question

public class MergeSortForLinkedList {
	

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
	 
	 // Method to return middle element of Linked List.
	 public static Node midNode(Node head) {
		 Node slow = head;
		 Node fast = head;
		 
		 while(fast.next != null && fast.next.next!= null) {
			 slow = slow.next;
			 fast = fast.next.next;
		 }
		 
		 return slow;
	 }
	 
	 // 1---> 4----> 3----> 5----> 2----> 6----> 8----> 7
	 public static Node mergeSort(Node head) {
		 
		 if(head == null || head.next == null) {
			 return head;
			 
		 }
		 
		 Node middle = midNode(head);
		 Node middlenext = middle.next;
		 
		 // set next of middle node to null.
		 middle.next = null; // Detaching both halfes.
		 
		 Node left = mergeSort(head);// Left side sorting using recursive merge sort
		 
		 Node right = mergeSort(middlenext); // Right side sorting using recursive merge sort.
		 
		 Node sortedNode = merge(left, right); // Merging 2 sorted merge list.
		 return sortedNode;
		 
	 }
	 
	/*
	 * public static Node sortedMerge(Node headleft, Node headright) { if(headleft
	 * == null) { return headright; } if(headright == null) { return headleft; } //
	 * Whichever LL node value is smaller , point headLeft to that. if(headleft.data
	 * > headright.data) { Node temp = headleft; headleft = headright; headright =
	 * temp; } Node result = headleft; while(headleft != null && headright != null)
	 * { Node temp = null; // Setting value to null after every Iteration
	 * while(headleft != null && headleft.data <= headright.data) { temp = headleft;
	 * // Tracking last small value so to join link connection. headleft =
	 * headleft.next; } temp.next = headright;// Joining link
	 * 
	 * // Swap headleft of li with headRight l2 if data of l1 > l2 as above loop
	 * exits as headleft will always point to smaller value. Node temp1 = headleft;
	 * headleft = headright; headright = temp1;
	 * 
	 * }
	 * 
	 * return result; }
	 */
      
	 public static Node merge(Node a, Node b) {
			
			Node node = new Node(0);
			Node temp = node;
			
			while(a!=null && b!=null) {
				
				if(a.data<b.data) {
					temp.next = a;
					a = a.next;
				}
				else {
					temp.next = b;
					b = b.next;
				}
				temp = temp.next;
			}
			
			if(a!=null)
				temp.next = a;
			else
				temp.next = b;
		
			return node.next;
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortForLinkedList list = new MergeSortForLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(4);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(5);
		list.head.next.next.next.next = new Node(2);
		list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next.next = new Node(8);
		list.head.next.next.next.next.next.next.next = new Node(7);
		System.out.println(" Original LL is : ");
		list.printList(head);
		System.out.println("\n");
		System.out.println("Merge Sort for LL is : ");
		Node sortedNode = MergeSortForLinkedList.mergeSort(head);
		list.printList(sortedNode);
	}

}
