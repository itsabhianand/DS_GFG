package com.dsa.sheet.binarytree;

// Refer Code Library

public class DiameterOfTree {
	
	static int ma = Integer.MIN_VALUE;
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
	
	public static int func(Node root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = func(root.left);
		int rightHeight =  func(root.right);
		ma = Math.max(ma, leftHeight + rightHeight + 1);
		int result = (Math.max(leftHeight, rightHeight) + 1);
		return result;
	}
	
	public static int diamater(Node root) {
		func(root);
		return ma;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiameterOfTree tree = new DiameterOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.right = new Node(6);
		tree.root.left.right.right.right = new Node(7);
		int diamater = DiameterOfTree.diamater(root);
		System.out.println("Diamater of a tree is : " + diamater);
		
	}

}
