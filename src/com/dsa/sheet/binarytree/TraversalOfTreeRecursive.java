package com.dsa.sheet.binarytree;


public class TraversalOfTreeRecursive {
	
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
	
	public static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}
	
	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data + " ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraversalOfTreeRecursive tree = new TraversalOfTreeRecursive();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Inorder Traversal : ");
		TraversalOfTreeRecursive.inOrder(root);
		System.out.println("PreOrder Traversal : ");
		TraversalOfTreeRecursive.preOrder(root);
		System.out.println("PostOrder Traversal : ");
		TraversalOfTreeRecursive.postOrder(root);
	}

}
