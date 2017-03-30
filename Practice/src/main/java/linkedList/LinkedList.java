package linkedList;

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	public Node head;
	private int size;
	
	public LinkedList() {
		head = null;
	}

	public void addAtBegin(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	public void addAtEnd(int data)
	// post: appends the specified element to the end of this list.
	{
		Node temp = new Node(data);
		Node current = head;
		// starting at the head node, crawl to the end of the list
		while(current.next != null)
		{
			current = current.next;
		}
		// the last node's "next" reference set to our new node
		current.next = temp;
	}
	
	public boolean remove(int index)
	// post: removes the element at the specified position in this list.
	/* another: give a pointer to the middle node of the linked list, delete that node
	 * solution: copy the value from the next to the current and remove the next
	 */
	{
		// if the index is out of range, exit
		if(index < 1 || index > this.size)
			return false;
		
		Node current = head;
		for(int i = 1; i < index; i++)
		{
			if(current.next == null)
				return false;
			
			current = current.next;
		}
		current.next = current.next.next;
		size--; // decrement the number of elements variable
		return true;
	}

	public void reverseIterative(Node head) {
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;

		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
	}

	public void reverseRecursion(Node currentNode) {
		// check for empty list
		if (currentNode == null)
			return;

		/*
		 * if we are at the TAIL node: recursive base case:
		 */
		if (currentNode.next == null) {
			// set HEAD to current TAIL since we are reversing list
			head = currentNode;
			return; // since this is the base case
		}

		reverseRecursion(currentNode.next);
		currentNode.next.next = currentNode;
		currentNode.next = null; // set "old" next pointer to NULL
	}
}