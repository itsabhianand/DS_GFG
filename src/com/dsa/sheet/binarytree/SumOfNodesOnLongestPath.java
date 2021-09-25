package com.dsa.sheet.binarytree;

// Refer GFG.

public class SumOfNodesOnLongestPath {
	
	static int maxSum;
	static int maxLevel;
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
	
	public static void sumOfNodesOnLongestPath(Node root, int sum, int level) {
		if(root == null) {
			
		if(maxLevel < level) {
			maxLevel = level;
			maxSum = sum;
		}
		else if(maxLevel == level && maxSum < sum) {
			maxSum = sum;
		}
		return;
	}
		sumOfNodesOnLongestPath(root.left, sum + root.data, level + 1);
		sumOfNodesOnLongestPath(root.right, sum + root.data, level + 1);
	}
	
	
	public static int findSumOfNodesOnLongestPath(Node root) {
		if(root == null) {
			return 0;
		}
		
		maxSum = Integer.MIN_VALUE;
		maxLevel = 0;
		
		sumOfNodesOnLongestPath(root, 0, 0);
		
		return maxSum; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node root = new Node(4);         /*        4        */
        root.left = new Node(2);         /*       / \       */
        root.right = new Node(5);        /*      2   5      */
        root.left.left = new Node(7);    /*     / \ / \     */
        root.left.right = new Node(1);   /*    7  1 2  3    */
        root.right.left = new Node(2);   /*      /          */
        root.right.right = new Node(3);  /*     6           */
        root.left.right.left = new Node(6);
        int sum = SumOfNodesOnLongestPath.findSumOfNodesOnLongestPath(root);
        System.out.println("Sum is : " + sum);
	}

}
