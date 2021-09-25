package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Map.Entry;


public class BottomViewOfTree {
	
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
		int value;
		QueueObj(Node node, int value){
			this.node = node;
			this.value = value;
		}
	}
    

	public static void bottomView(Node root) {
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
		    	 map.put(temp.value, temp.node);
		     
		     if(temp.node.left != null) {
		    	 q.add(new QueueObj(temp.node.left, temp.value - 1));
		     }
		     
		     if(temp.node.right != null) {
		    	 q.add(new QueueObj(temp.node.right, temp.value + 1));
		     }
		}
		
		for(Entry<Integer, Node> e : map.entrySet()) {
			System.out.println(e.getValue().data);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BottomViewOfTree tree = new BottomViewOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println("Bottom View is : ");
		BottomViewOfTree.bottomView(root);
	}

}
