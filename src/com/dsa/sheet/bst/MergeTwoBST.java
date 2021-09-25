package com.dsa.sheet.bst;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoBST {
	
	static Node root1;
	static Node root2;
	static class Node {
		int data;
		Node left, right;
		
		Node(int value){
			data = value;
			left = null;
			right = null;
		}
	}
	
	public static void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data + " ");
		inOrderTraversal(root.right);
		
		return;
		
	}
	
	public static Node mergeTwoBST(Node root1, Node root2) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list1 = storeInOrder(root1, list1);
		list2 = storeInOrder(root2, list2);
		
		List<Integer> mergeList = new ArrayList<Integer>();
		mergeList = merge(list1, list2, mergeList);
		
		Node node = mergeListToBst(mergeList, 0, mergeList.size()-1);
		
		return node;
	}
	
	public static Node mergeListToBst(List<Integer> mergeList, int start, int end) {
		if(start > end) {
			return null;
		}
		
		int mid= (start + end)/2;
		Node node = new Node(mergeList.get(mid));
		
		node.left = mergeListToBst(mergeList, start, mid-1);
		node.right = mergeListToBst(mergeList, mid + 1, end);
		
		return node;
	}
	
	public static List<Integer> storeInOrder(Node root, List<Integer> list){
		if(root == null) {
			return list;
		}
		storeInOrder(root.left, list);
		list.add(root.data);
		storeInOrder(root.right, list);
		
		return list;
	}
	
	public static List<Integer> merge(List<Integer> list1, List<Integer> list2, List<Integer> mergeList){
		int i = 0;
		int j = 0;
		
		while(i< list1.size() && j < list2.size()) {
			if(list1.get(i) < list2.get(j)) {
				mergeList.add(list1.get(i));
				i++;
			}
			else {
				mergeList.add(list2.get(j));
				j++;
			}
		}
		
		while(i < list1.size()) {
			mergeList.add(list1.get(i));
			i++;
		}
		
		while(j < list2.size()) {
			mergeList.add(list2.get(j));
			j++;
		}
		
		return mergeList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoBST tree1 = new MergeTwoBST();
		tree1.root1 = new Node(10);
		tree1.root1.left = new Node(5);
		tree1.root1.right = new Node(13);
		tree1.root1.left.left = new Node(2);
		tree1.root1.left.right = new Node(6);
		tree1.root1.right.left = new Node(11);
		tree1.root1.right.right = new Node(15);
		
		MergeTwoBST tree2 = new MergeTwoBST();
		tree2.root2 = new Node(12);
		tree2.root2.left = new Node(4);
		tree2.root2.right = new Node(16);
		tree2.root2.left.left = new Node(1);
		tree2.root2.left.right = new Node(7);
		tree2.root2.right.left = new Node(14);
		tree2.root2.right.right = new Node(17);
		
		System.out.println("Fisrt BST is : ");
		inOrderTraversal(tree1.root1);
		System.out.println();
		System.out.println("Second BST is :");
		inOrderTraversal(tree2.root2);
		System.out.println();
		System.out.println("Merged BST is : ");
		Node node = mergeTwoBST(tree1.root1, tree2.root2);
		inOrderTraversal(node);
		
	}

}
