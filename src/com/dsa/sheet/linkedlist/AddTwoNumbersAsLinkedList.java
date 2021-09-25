package com.dsa.sheet.linkedlist;

// Refer take u forward

public class AddTwoNumbersAsLinkedList {
	
	static Node head1;
	static Node head2;
	static Node head3;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		Node(){
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
	
	static Node reverse(Node head) {
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
    
	// 3 ---> 4 ---> 2 and 9 ---> 7 --> 6 --> 5
	public static Node addTwoNumbers(Node head1, Node head2) {
		Node dummy = new Node();
		Node temp = dummy;
		int carry = 0;
		while( head1 != null || head2 != null || carry == 1) {
			int sum = 0;
			if(head1 != null) {
				sum = sum + head1.data;
				head1 = head1.next;
			}
			if(head2 != null) {
				sum = sum + head2.data;
				head2 = head2.next;
			}
			
			sum = sum + carry;
			temp.next = new Node(sum%10);
			temp = temp.next;
			carry = sum/10;
			
		}
		
		return dummy.next;
		
	}
	// 3 ---> 4 ---> 2 and 9 ---> 7 --> 6 --> 5
	 public static Node addTwoNumbersUtils(Node head1, Node head2) {
			Node curr1 = head1;
			Node curr2 = head2;
			
			Node dummy = new Node(0);
			Node temp = dummy;
			
			int carry = 0;
			
			while(curr1 != null || curr2 != null) {
				int sum = 0;
				if(curr1 != null) {
					sum = sum + curr1.data;
					curr1 = curr1.next;
				}
				
				if(curr2 != null) {
					sum = sum +curr2.data;
					curr2 = curr2.next;
				}
				
				sum = sum + carry;
				if(sum >= 10) {
					carry = 1;
				}
				else {
					carry = 0;
				}
				
				sum = sum%10;
				temp.next = new Node(sum);
				temp = temp.next;
			}
			
			if(carry > 0) {
				temp.next = new Node(carry);
			}
			
			return dummy.next;
			 
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbersAsLinkedList list1 = new AddTwoNumbersAsLinkedList();
		list1.head1 = new Node(2);
		list1.head1.next = new Node(4);
		list1.head1.next.next = new Node(3);
		System.out.println("First LL is :");
		list1.printList(head1);
		head1 = reverse(head1); // head1
		
		AddTwoNumbersAsLinkedList list2 = new AddTwoNumbersAsLinkedList();
		list2.head2 = new Node(5);
		list2.head2.next = new Node(6);
		list2.head2.next.next = new Node(7);
		list2.head2.next.next.next = new Node(9);
		System.out.println("\n");
		System.out.println("Second LL is :");
		list2.printList(head2);
		head2 = reverse(head2); // head2
		
		//head3 = AddTwoNumbersAsLinkedList.addTwoNumbers(head1, head2);
		head3 = addTwoNumbersUtils(head1, head2);
		System.out.println("\n");
		System.out.println("Resultant List found is :");
		AddTwoNumbersAsLinkedList list3 = new AddTwoNumbersAsLinkedList();
		
		head3 = reverse(head3);
		list3.printList(head3);
	}

}
