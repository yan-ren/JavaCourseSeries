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
		return delete(this.root, id);
	}
	
	private boolean delete(Node startNode, int id){
		Node parent = startNode;
		Node current = startNode;
		boolean isLeftChild = false;
		while(current.data!=id){
			parent = current;
			if(current.data>id){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		//if i am here that means we have found the node
		//Case 1: if node to be deleted has no children
		if(current.left==null && current.right==null){
			if(current==startNode){
				startNode = null;
			}
			if(isLeftChild ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		//Case 2 : if node to be deleted has only one child
		else if(current.right==null){
			if(current==startNode){
				startNode = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current==startNode){
				startNode = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left!=null && current.right!=null){
			
			//now we have found the minimum element in the right sub tree
			Node min = minNode(current.right);
			current.data = min.data;
			delete(current.right, current.data);
		}		
		return true;		
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
