package com.dsa.sheet.linkedlist;


// Refer Aditya Rajiv video and GFG page.
// DLL is sorted itself.

public class FindPairsWithGivenSumInDLL {
	
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
    
    // 1 ---> 2 ---> 4 ---> 5 ----> 6 ---> 8 ---> 9
    public static void findPairSum(Node head, int key) {
    	
    	Node front = head;
    	Node back = head;
    	
    	while(back.next != null) {
    		back = back.next;
    	}
    	
    	boolean found = false;
    	
    	while(front != null && back != null && front != back && back.next != front) {
    		if(front.data + back.data == key) {
    			System.out.println("Pair found is :");
    			 System.out.println( "(" + front.data + 
                         ", "+ back.data + ")" );
    			 front = front.next;
    			 back = back.prev;
    			 found = true;
    		}
    		else if(front.data + back.data < key) {
    			front = front.next;
    		}
    		else if(front.data + back.data > key) {
    			back = back.prev;
    		}
    	}
    	
    	if(found == false ) {
    		System.out.println("Sorry, No pair is found !");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPairsWithGivenSumInDLL list = new FindPairsWithGivenSumInDLL();
		list.head = new Node(1);
		list.head.prev = null;
		list.head.next = new Node(2);
		list.head.next.prev = list.head;
		list.head.next.next = new Node(4);
		list.head.next.next.prev = list.head.next;
		list.head.next.next.next = new Node(5);
		list.head.next.next.next.prev = list.head.next.next;
		list.head.next.next.next.next = new Node(6);
		list.head.next.next.next.next.prev = list.head.next.next.next;
		list.head.next.next.next.next.next = new Node(8);
		list.head.next.next.next.next.next.prev = list.head.next.next.next.next;
		list.head.next.next.next.next.next.next = new Node(9);
		list.head.next.next.next.next.next.next.prev = list.head.next.next.next.next.next;
		System.out.println("Original LL is : ");
		list.printList(head);
		System.out.println("\n");
		int key = 7;
		FindPairsWithGivenSumInDLL.findPairSum(head, key);
	}

}
