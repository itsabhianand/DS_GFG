package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Queue;

// Refer code Library
// Move node to extreme right and print all right Node data.
// Push Left node data to queue.

public class DiagonalTraversal {
	
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
	
	public static void diagonal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.println(temp.data);
			
			while(temp != null) {
				if(temp.left != null) {
					q.add(temp.left); // 3,6,13
				}
				if(temp.right != null) {
					System.out.println(temp.right.data); // 8, 10, 14,3,6,7
				}
				
				temp = temp.right;
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiagonalTraversal tree = new DiagonalTraversal();
		tree.root = new Node(8);
		tree.root.left = new Node(3);
		tree.root.left.left = new Node(1);
		tree.root.right = new Node(10);
		tree.root.right.left= new Node(6);
		tree.root.right.left.left = new Node(4);
		tree.root.right.left.right = new Node(7);
		tree.root.right.right = new Node(14);
		tree.root.right.right.left = new Node(13);
		DiagonalTraversal.diagonal(root);
	}

}
