package com.dsa.sheet.linkedlist;

public class StartingNode {
	
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
	 
	 public static Node startingNode(Node head) {
		// 1--> 2 --> 3-- > 4 --> 5 --> 3
			if(head == null || head.next == null) {
				return head;
			}
			
			Node slow = head;
			Node fast = head;
			
			while(fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
				if(fast == slow) {
						if(fast == head) {
							while(slow.next != fast) {
								slow = slow.next;
							}
							break;
						}
						else {
							fast = head;
							while(slow.next != fast.next) {
								slow = slow.next;
								fast = fast.next;
							}
							
							break;
						}
				}
				
			}
			
	return slow.next;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartingNode list = new StartingNode();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		//list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next = list.head.next.next;
		Node start = startingNode(head);
		System.out.println(start.data);
	}

}
