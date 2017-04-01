package tree;

public class BinarySearchTree {
	/*
	 * BST - nodes smaller than root goes to the left and greater goes to the
	 * right
	 */
	public Node root;

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
	
	public Node getMinInTree(){
		return minNode(this.root);
	}
	
	private Node minNode(Node start){
		if(start.left == null){
			return start;
		}else{
			return minNode(start.left);
		}
	}
	
	public boolean deleteInTree(int id){
		return deleteNode(this.root, id) != null? true: false;
	}
	
	private Node deleteNode(Node root, int key) {
	    if(root == null){
	        return null;
	    }
	    if(key < root.data){
	        root.left = deleteNode(root.left, key);
	    }else if(key > root.data){
	        root.right = deleteNode(root.right, key);
	    }else{
	        if(root.left == null){
	            return root.right;
	        }else if(root.right == null){
	            return root.left;
	        }
	        
	        Node minNode = minNode(root.right);
	        root.data = minNode.data;
	        root.right = deleteNode(root.right, root.data);
	    }
	    return root;
	}
	
	public void displayAll(){
		display(this.root);
	}

	private void display(Node root) {
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
