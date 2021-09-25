package com.dsa.sheet.binarytree;

public class DistanceBetweenTwoNodes {
	

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
	
	public static Node findLCA(Node root, int key1, int key2) {
		if(root == null) {
			return null;
		}
		if(root.data == key1 || root.data == key2) {
			return root;
		}
		
		Node left = findLCA(root.left, key1, key2);
		Node right = findLCA(root.right, key1, key2);
		
		if(left != null && right != null) {
			return root;
		}
		
		if(left != null) {
			return left;
		}
		else {
			return right;
		}
	}
	
	public static int findDistanceUtil(Node root, int key1, int key2) {
		Node lca = findLCA(root, key1, key2);
		int left = findLevel(lca, key1, 0);
		int right = findLevel(lca, key2, 0);
		return left+ right;
		
	}
	
	public static int findLevel(Node root, int val, int level) {
		if(root == null) {
			return -1;
		}
		
		if(root.data == val) {
			return level;
		}
		
		int left =  findLevel(root.left, val, level + 1);
		
		int right = findLevel(root.right, val, level + 1);
		
		if(left == -1 && right == -1)
			 return -1;
		
		if(left != -1)
			return left;
		else 
			return right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistanceBetweenTwoNodes tree = new DistanceBetweenTwoNodes();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.right = new Node(6);
		tree.root.right.right = new Node(7);
		int key1 = 2;
		int key2 = 6;
		int distance = DistanceBetweenTwoNodes.findDistanceUtil(root, key1, key2);
		System.out.println("Distance is : " + distance);
	}

}
