package com.leetcode.interview.questions;

public class KthSmallestInBST {
	
	static int count = 0;
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
   
	 
		public static Node findKthSmallest(Node root, int k) {
			if(root == null) {
				return null;
			}
			Node left = findKthSmallest(root.left, k);
			if(left != null) {
				return left;
			}
			count ++;
			if(count == k) {
				return root;
			}
			return findKthSmallest(root.right, k);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSmallestInBST tree = new KthSmallestInBST();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(6);
		tree.root.right = new Node(13);
		tree.root.right.left = new Node(11);
		tree.root.right.right = new Node(15);
		inOrderTraversal(tree.root);
		Node root = findKthSmallest(tree.root, 3);
		System.out.println("Kth Smallest node is : " + root.data);
	}

}
