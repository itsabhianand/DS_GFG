 package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Queue;

// Refer Code Library and GFG.

public class LevelOrderTraversal {
	
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
	
	
	public static void printLevelOrder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
		   System.out.println(temp.data + " ");
		   
		   if(temp.left != null) {
			   q.add(temp.left);
		   }
		   
		   if(temp.right != null) {
			   q.add(temp.right);
		   }
		   
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Level order Traversal is : ");
		LevelOrderTraversal.printLevelOrder(root);
	}

}
