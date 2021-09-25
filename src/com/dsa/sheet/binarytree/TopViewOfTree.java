package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfTree {
	
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
	
	static class QueueObj {
		Node node;
		int value; // distance from root. i.e 0, -1 or -2.
		QueueObj(Node node, int value){
			this.node = node;
			this.value = value;
		}
	}
	
	public static void topView(Node root) {
		Queue<QueueObj> q = new LinkedList<QueueObj>();
		Map<Integer, Node> map = new TreeMap<Integer, Node>();
		if(root == null) {
			return;
		}
		else {
			q.add(new QueueObj(root, 0));
		}
		
		while(!q.isEmpty()) {
		     QueueObj temp = q.poll();
		     if(!map.containsKey(temp.value)) {
		    	 map.put(temp.value, temp.node);
		     }
		     
		     if(temp.node.left != null) {
		    	 q.add(new QueueObj(temp.node.left, temp.value - 1));
		     }
		     
		     if(temp.node.right != null) {
		    	 q.add(new QueueObj(temp.node.right, temp.value + 1));
		     }
		}
		
		/*
		 * for(Entry<Integer, Node> e : map.entrySet()) {
		 * System.out.println(e.getValue().data); }
		 */
		
		for(Node n : map.values()){
			   System.out.println(n.data);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopViewOfTree tree = new TopViewOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println("Top View is : ");
		TopViewOfTree.topView(root);
	}

}
