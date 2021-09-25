package com.dsa.sheet.bst;

public class SumOfLeafNodes {
	
	static int sum = 0;
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
    
	
	public static int findSum(Node root) {
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			sum = sum + root.data;
		}
		findSum(root.left);
		findSum(root.right);
		
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfLeafNodes tree = new SumOfLeafNodes();
		tree.root = new Node(6);
		tree.root.left = new Node(4);
		tree.root.right = new Node(8);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(9);
		int sum = SumOfLeafNodes.findSum(root);
		System.out.println("Sum is : " + sum);
	}

}
