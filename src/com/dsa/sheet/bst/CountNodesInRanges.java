package com.dsa.sheet.bst;

public class CountNodesInRanges {
	
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
	
	public static void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data + " ");
		inOrderTraversal(root.right);
		
	}
	
	public static int countNodes(Node root, int low, int high) {
		if(root == null) {
			return 0;
		}
		
		if(low <= root.data && root.data <= high) {
			int leftcount = countNodes(root.left, low, high);
			int rightcount = countNodes(root.right, low, high);
			return 1 + leftcount + rightcount;
		}
		
		else if(root.data < low) {
			return countNodes(root.right, low, high);
		}
		
		else { // root.data > high
			return countNodes(root.left, low, high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNodesInRanges tree = new CountNodesInRanges();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(6);
		tree.root.right = new Node(13);
		tree.root.right.left = new Node(11);
		tree.root.right.right = new Node(15);
		System.out.println("BST is : ");
		inOrderTraversal(tree.root);
		int count = countNodes(tree.root, 5, 13);
		System.out.println("Count of Nodes in given range is : " + count);
		
	}

}
