package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfTree {
	
	static int Max_Level = 0;
	
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
	
	public static void leftViewRecursive(Node root, int level) {
		if(root == null) {
			return;
		}
		if(Max_Level < level) {
			System.out.println(root.data + " ");
			Max_Level = level;
		}
		leftViewRecursive(root.left, level + 1);
		leftViewRecursive(root.right, level + 1);
	}
	
	public static void leftViewIterative(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=1; i<=size; i++) {
				Node temp = q.poll();
				if(i == 1) {
					System.out.println(temp.data + " ");
				}
				if(temp.left != null) {
					q.add(temp.left);
				}
				if(temp.right != null) {
					q.add(temp.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeftViewOfTree tree = new LeftViewOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.left.left.right = new Node(5);
		System.out.println("Left view of Tree Recursively is : ");
		LeftViewOfTree.leftViewRecursive(root, 1);
		System.out.println("Left View of Tree iTeratively is : ");
		LeftViewOfTree.leftViewIterative(root);
	}

}
