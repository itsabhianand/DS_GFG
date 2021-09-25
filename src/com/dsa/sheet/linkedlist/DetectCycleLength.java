package com.dsa.sheet.linkedlist;

public class DetectCycleLength {
	
static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	   void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	// 1--> 2 --> 3-- > 4 --> 5 --> 3
	   private static void findLoopLength(Node head) {
			int count = 1;
			
			Node slow = head;
			Node fast = head;
			
			while(fast!=null && fast.next!=null) {
				
				slow = slow.next;
				fast = fast.next.next;
				
				if(fast == slow)
					break;
			}
			
			Node temp = slow;
			while(temp!=null && temp.next!=slow) {
				temp = temp.next;
				count++;
			}
			
			System.out.println("The length of the loop is : " +count);
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectCycleLength list = new DetectCycleLength();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		//list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next = list.head.next.next;
		findLoopLength(head);
	}

}
