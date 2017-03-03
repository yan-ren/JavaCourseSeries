package tree;

public class BinarySearchTree {
	/*
	 * BST - nodes smaller than root goes to the left and greater goes to the
	 * right
	 */
	public static Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void insert(int id) {
		Node newNode = new Node(id);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (id < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else if (id > current.data) {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			} else {
				System.out.println("Insert duplicated value");
				return;
			}
		}
	}

	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}

	public boolean find(int id) {
		Node current = root;
		while (current != null) {
			if (current.data == id) {
				return true;
			} else if (current.data > id) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
	}

}
