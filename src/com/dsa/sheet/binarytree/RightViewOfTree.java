package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Queue;

import com.dsa.sheet.binarytree.LeftViewOfTree.Node;

public class RightViewOfTree {
	
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
	
	public static void rightViewRecursive(Node root, int level) {
		if(root == null) {
			return;
		}
		if(Max_Level < level) {
			System.out.println(root.data + " ");
			Max_Level = level;
		}
		rightViewRecursive(root.right, level + 1);
		rightViewRecursive(root.left, level + 1);
	}
	
	public static void RightViewIterative(Node root) {
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
				if(temp.right != null) {
					q.add(temp.right);
				}
				if(temp.left != null) {
					q.add(temp.left);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightViewOfTree tree = new RightViewOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.left.left.right = new Node(5);
		System.out.println("Right View of Tree is : ");
		RightViewOfTree.rightViewRecursive(root, 1);
		System.out.println("Right View Iterative : ");
		RightViewIterative(root);
	}

}
