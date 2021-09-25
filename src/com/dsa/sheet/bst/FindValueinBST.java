	package com.dsa.sheet.bst;

public class FindValueinBST {
	
	static Node root;
	static class Node {
		int data;
		Node left, right;
		
		Node(int value){
			data = value;
			left = null;
			right = null;
		}
	}
	
	public static boolean search(Node root, int key) {
		if(root == null) {
			return false;
		}
		
		if(root.data == key) {
			return true;
		}
		if(root.data < key) {
			return search(root.right, key);
		}
		else {
			return search(root.left, key);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindValueinBST tree = new FindValueinBST();
		tree.root = new Node(6);
		tree.root.left = new Node(4);
		tree.root.right = new Node(8);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(9);
		boolean search = FindValueinBST.search(root, 9);
		System.out.println("Node searched is : " + search);
	}

}
