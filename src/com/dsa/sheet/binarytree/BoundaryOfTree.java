package com.dsa.sheet.binarytree;

import java.util.ArrayList;
import java.util.List;

// Refer Code Library

public class BoundaryOfTree {
	
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
	
	public static void printBoundary(Node root) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(root.data);
		printLeft(root.left, list);
		printLeaf(root, list);
		printRight(root.right, list);
		
		for(int i : list) {
			System.out.println(i + " ");
		}
	}
	
	public static void printLeft(Node root, List<Integer> list) {
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			list.add(root.data);
			printLeft(root.left, list);
		}
		else if(root.right != null) {
			list.add(root.data);
			printLeft(root.right, list);
		}
	}
	
	public static void printRight(Node root, List<Integer> list) {
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			printRight(root.left, list);
			list.add(root.data);
		}
		else if(root.right != null) {
			printRight(root.right, list);
			list.add(root.data);
		}
	}
	
	public static void printLeaf(Node root, List<Integer> list) {
		if(root == null) {
			return;
		}
		printLeaf(root.left, list);
		if(root.left == null && root.right == null) {
			list.add(root.data);
		}
		printLeaf(root.right, list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundaryOfTree tree = new BoundaryOfTree();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		tree.root.right.right = new Node(25);
		BoundaryOfTree.printBoundary(root);
	}

}
