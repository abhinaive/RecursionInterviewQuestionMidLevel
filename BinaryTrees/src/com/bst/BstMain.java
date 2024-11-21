package com.bst;

public class BstMain {

	
	public static void main(String[] args) {
		BinSearchTree bst = new BinSearchTree();
		bst.add(50);
		bst.add(25);
		bst.add(75);
		bst.add(10);
		bst.add(30);
		bst.add(40);
		bst.add(85);
		bst.add(90);
		bst.add(15);
		bst.add(55);
		bst.add(100);
		
		bst.preorder();
		bst.inorder();
		bst.postorder();
	}

}
