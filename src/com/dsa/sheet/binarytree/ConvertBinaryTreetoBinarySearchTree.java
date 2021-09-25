package com.dsa.sheet.binarytree;

// Base concept of this question is to convert BT into BST.

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ConvertBinaryTreetoBinarySearchTree {
	
	static Queue<Integer> q = new LinkedList<Integer>(); // Global
	
	
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
	
	public static void inOrder(Node root) {
		int index = 0;
		if(root == null) {
			return;
		}
		inOrder(root.left);
		q.add(root.data);
		inOrder(root.right);
	}
	
	public static int minimumSwapsRequired(Node root) {
		inOrder(root);
		Object[] array = q.toArray();
		int length = array.length;
		int ans = 0;
        Object[] temp = Arrays.copyOfRange(array, 0, length);
 
        // Hashmap which stores the
        // indexes of the input array
        HashMap<Integer, Integer> h
            = new HashMap<Integer, Integer>();
 
        Arrays.sort(temp);
        for (int i = 0; i < length; i++) 
        {
            h.put((Integer) array[i], i);
        }
        for (int i = 0; i < length; i++) 
        {
 
            // This is checking whether
            // the current element is
            // at the right place or not
            if (array[i] != temp[i]) 
            {
                ans++;
                int init = (int) array[i];
 
                // If not, swap this element
                // with the index of the
                // element which should come here
                swap(array, i, h.get(temp[i]));
 
                // Update the indexes in
                // the hashmap accordingly
                h.put(init, h.get(temp[i]));
                h.put((Integer) temp[i], i);
            }
        }
        return ans;
		
	}
      
	
	public static void swap(Object[] array, int i, int j)
    {
        int temp = (int) array[i];
        array[i] = array[j];
        array[j] = temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertBinaryTreetoBinarySearchTree tree = new ConvertBinaryTreetoBinarySearchTree();
		tree.root = new Node(5);
		tree.root.left = new Node(6);
		tree.root.right = new Node(7);
		tree.root.left.left = new Node(8);
		tree.root.left.right = new Node(9);
		tree.root.right.left = new Node(10);
		tree.root.right.right = new Node(11);
		int count = ConvertBinaryTreetoBinarySearchTree.minimumSwapsRequired(root);
		System.out.println("swapCount is : " + count);
	}

}
