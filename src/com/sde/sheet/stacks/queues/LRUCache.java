package com.sde.sheet.stacks.queues;

// Refer Codebix.
// Make use of DLL as we need to do each operation in O(1).
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	 class Node {
		int key;
		int value;
		Node prev;
		Node next;
		
		Node(int k, int v){
			key = k;
			value = v;
		}
	}
	
	private Map<Integer, Node> map = new HashMap<Integer, Node>();
	private Node head;
	private Node last;
	private int capacity;
	
	LRUCache(int c){
		this.capacity = c;
		head = new Node(0,0);
		last = new Node(0,0);
		head.next = last;
		last.prev = head;
	}
	
	public void put(int key, int value) {
		// If we are pushing same (key, value) node then remove it and place it in first position.
		if(map.containsKey(key)) {
		    remove(map.get(key));
		}
		// if cache size is full, remove node before last dummy node.
		if(map.size() == capacity) { 
			remove(last.prev);
		}
	   insert(new Node(key, value));
	}
   
	public int get(int key) {
		Node node = map.get(key);
		if(node == null) {
			return -1;
		}
		// When doing get(), first remove and insert at beginning.
		remove(node);
		insert(node);
		return node.value;
	}
	
	public void insert(Node node) {
		map.put(node.key, node);
		node.next = head.next;
		head.next.prev = node;
		node.prev = head;
		head.next = node;
	}
	
	public void remove(Node node) {
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	
	
	public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }
        System.out.println();
        System.out.println("Nodes values of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.key + " ");  
            current = current.next;  
        }  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache cache = new LRUCache(3);
		cache.put(1,2);
		cache.put(3,4);
		cache.put(4,5);
		cache.display();
		cache.put(3,4);
		cache.display();
		int value = cache.get(4);
		System.out.println();
		System.out.print("value  is " + value);
		cache.display();
		cache.put(7, 6);
		cache.display();
	}

}
