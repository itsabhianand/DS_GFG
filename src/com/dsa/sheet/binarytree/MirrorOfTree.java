package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Queue;

// Refer code Library

public class MirrorOfTree {
	

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
	
	// Printing tree in Level Order
	public static void printLevelOrder(Node root) {
		Node rootreturned = mirrorTree(root);
		Queue<Node> q = new LinkedList<Node>();
		q.add(rootreturned);
		
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
	
	public static Node mirrorTree(Node root) {
		if(root == null) {
			return root;
		}
		Node left = mirrorTree(root.left);
		Node right = mirrorTree(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MirrorOfTree tree = new MirrorOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		MirrorOfTree.printLevelOrder(root);
	}

}
