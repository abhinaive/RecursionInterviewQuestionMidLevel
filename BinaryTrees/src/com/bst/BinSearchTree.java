package com.bst;

public class BinSearchTree {

	private Node root;

	public BinSearchTree() {
		root = null;
	}

	static class Node {

		private int data;
		private Node left;
		private Node right;

		public Node(int val) {
			data = val;
		}
	}

	public void add(int val) {

		Node newNode = new Node(val);

		if (root == null) {
			root = newNode;
		} else {

			Node trav = root;

			while (true) {

				if (val < trav.data) {
					if (trav.left == null) {
						trav.left = newNode;
						break;
					} else {
						trav = trav.left;
					}

				} else {
					if (trav.right == null) {
						trav.right = newNode;
						break;
					} else {
						trav = trav.right;
					}

				}

			}

		}

	}
	
	public void preorder(Node cur) {
		if(cur == null) {
			return;
		}
		System.out.print(cur.data + ", ");
		preorder(cur.left);
		preorder(cur.right);
	}
	
	public void preorder() { // since we cannot pass root to preorder(Node cur) from main as it is private member
		System.out.print("PRE : ");
		preorder(root);
		System.out.println();
	}
	
	public void inorder(Node cur) {
		if(cur == null) {
			return;
		}
		inorder(cur.left);
		System.out.print(cur.data + ", ");
		inorder(cur.right);
	}
	
	public void inorder() { // since we cannot pass root to inorder(Node cur) from main as it is private member
		System.out.print("IN :  ");
		inorder(root);
		System.out.println();
	}
	
	public void postorder(Node cur) {
		if(cur == null) {
			return;
		}
		postorder(cur.left);
		postorder(cur.right);
		System.out.print(cur.data + ", ");
	}
	
	public void postorder() { // since we cannot pass root to postorder(Node cur) from main as it is private member
		System.out.print("POST: "
				+ "");
		postorder(root);
		System.out.println();
	}

}
