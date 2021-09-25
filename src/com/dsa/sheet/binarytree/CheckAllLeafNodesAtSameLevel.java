package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Queue;

// Refer GFG.

public class CheckAllLeafNodesAtSameLevel {
	
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
	
		
	private  void printLevelOrder() {

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()) {

			Node temp = queue.poll();
			System.out.print(temp.data + " ");

			if(null!=temp.left)
				queue.add(temp.left);
			if(null!=temp.right)
				queue.add(temp.right);
		}

	}
	
	static boolean result = true;
	static int level = 0;

	private static void checkLeafLevelUtil(Node root, int height) {

		if(root == null)
			return;
		if(result == false)
			return;
		if(root.left == null && root.right == null) {
			
			if(level == 0)
				level = height; // level = 2
			else if(height!= level)
				result = false;
			return;
		}
		
		checkLeafLevelUtil(root.left, height+1);
		checkLeafLevelUtil(root.right, height+1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAllLeafNodesAtSameLevel tree = new CheckAllLeafNodesAtSameLevel();
		tree.root = new Node(12);
		tree.root.left = new Node(5);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(9);
		tree.root.left.left.left = new Node(1);
		tree.root.left.right.left = new Node(1);
		System.out.println("Before Leaf Level -  Tree of binary tree is - ");
		tree.printLevelOrder();
		System.out.println();
		System.out.println("After Leaf Level - Tree of binary tree is - ");
		checkLeafLevelUtil(tree.root, 0);
		System.out.println(result);
		

	}
}
