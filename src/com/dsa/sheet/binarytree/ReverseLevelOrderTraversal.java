package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.dsa.sheet.binarytree.LevelOrderTraversal.Node;

// Refer Code Library and GFG.
//same like Level order Traversal, only difference is we push element in stack at place of printing and also we first check right then left.

public class ReverseLevelOrderTraversal {
	
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
	
	public static void printReverseLevelOrder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
	        s.push(temp);
		   
  		   if(temp.right != null) {
			   q.add(temp.right);
		   }
		   
		   if(temp.left != null) {
			   q.add(temp.left);
		   }
		   
		}
		
		System.out.println("Reverse Level Order : ");
		while(!s.isEmpty()) {
			Node res = s.pop();
			System.out.println(res.data + " ");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLevelOrderTraversal tree = new ReverseLevelOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		ReverseLevelOrderTraversal.printReverseLevelOrder(root);
	}

}
