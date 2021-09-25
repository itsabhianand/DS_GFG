package com.dsa.sheet.bst;

public class FindMinimumMaximumInBST {
	
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
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	
	public static Node findMinimum(Node root) {
		if(root.left == null) {
			return root;
		}
		else {
			return findMinimum(root.left);
		}
	}
	
	public static Node findMaximum(Node root) {
		if(root.right == null) {
			return root;
		}
		else {
			return findMaximum(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinimumMaximumInBST tree = new FindMinimumMaximumInBST();
		tree.root = new Node(6);
		tree.root.left = new Node(4);
		tree.root.right = new Node(8);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(9);
		FindMinimumMaximumInBST.inOrderTraversal(tree.root);
		Node max = FindMinimumMaximumInBST.findMaximum(tree.root);
		System.out.println("Max is : " + max.data);
		Node min = FindMinimumMaximumInBST.findMinimum(tree.root);
		System.out.println("Min is : " + min.data);
	}

}
