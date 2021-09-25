package com.dsa.sheet.linkedlist;

// refer take u forward

public class IntersectionOfTwoLinkedList {
	
	static Node head1;
	static Node head2;
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
	
	public static Node getInterSection(Node head1, Node head2) {
		if(head1 == null || head2 == null) {
			return null;
		}
		
		Node dummy1 = head1;
		Node dummy2 = head2;
		
		while(dummy1 != dummy2) {
			if(dummy1 != null) {
				dummy1 = dummy1.next;
			}
			else {
				dummy1 = head2;
			}
			
			if(dummy2 != null) {
				dummy2 = dummy2.next;
			}
			else {
				dummy2 = head1;
			}
		}
		
		return dummy1; // either dummy1 or dummy2
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionOfTwoLinkedList list1 = new IntersectionOfTwoLinkedList();
		list1.head1 = new Node(1);
		list1.head1.next = new Node(2);
		list1.head1.next.next = new Node(8);
		list1.head1.next.next.next = new Node(7);
		list1.head1.next.next.next.next = new Node(6);
		System.out.println("First LL is :");
		list1.printList(head1);
		System.out.println("\n");
		IntersectionOfTwoLinkedList list2 = new IntersectionOfTwoLinkedList();
		list2.head2 = new Node(2);
		list2.head2.next = new Node(8);
		list2.head2.next.next = new Node(1);
		list2.head2.next.next.next = new Node(3);
		list2.head2.next.next.next.next = list1.head1.next.next;
		list1.head2.next.next.next.next.next = list1.head1.next.next.next;
		list1.head2.next.next.next.next.next.next = list1.head1.next.next.next.next;
		System.out.println("Second LL is :");
		list2.printList(head2);
		System.out.println("\n");
		Node node = IntersectionOfTwoLinkedList.getInterSection(head1, head2);
		System.out.println("Intersection Point is : " + node.data);
	}

}
