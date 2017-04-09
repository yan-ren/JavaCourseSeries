package test;

import tree.BinarySearchTree;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		bst.displayAll();
		bst.deleteInTree(1);
		System.out.println();
		bst.displayAll();
	}

}
