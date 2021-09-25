package com.dsa.sheet.bst;

public class KthLargestSmallestinBST {
	
	static int count = 0;
	static int count1 = 0;
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
	
	public static Node findKthLargest(Node root, int k) {
		if(root == null) {
			return null;
		}
		Node right = findKthLargest(root.right, k);
		if(right != null) {
			return right;
		}
		count ++;
		if(count == k) {
			return root;
		}
		return findKthLargest(root.left, k);
	}
    
	public static Node findKthSmallest(Node root, int k) {
		if(root == null) {
			return null;
		}
		Node left = findKthSmallest(root.left, k);
		if(left != null) {
			return left;
		}
		count1 ++;
		if(count1 == k) {
			return root;
		}
		return findKthSmallest(root.right, k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthLargestSmallestinBST tree = new KthLargestSmallestinBST();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(6);
		tree.root.right = new Node(13);
		tree.root.right.left = new Node(11);
		tree.root.right.right = new Node(15);
		KthLargestSmallestinBST.inOrderTraversal(root);
		Node root = findKthLargest(tree.root, 3);
		System.out.println("kth Largest node is : " + root.data);
		Node root1 = findKthSmallest(tree.root, 3);
		System.out.println("Kth Smallest node is : " + root1.data);
	}

}
