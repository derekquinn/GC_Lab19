package co.grandcircus.lists;

public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;

	// dq method 1

	public boolean removeAt(int index) {
// not static because you need an object to use 
		boolean outOfRange = true;
		return outOfRange; 
		
		
		
		

	}

	// dq method 2

	public static boolean insertAt(int index, String item) {

		boolean insertAt = true;

		return insertAt;

	}

	/// david methods

	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		// TODO #1 -- create a new node and set the data on it
		Node node = new Node(data);
		node.setNext(head);
		head = node;
		length++; // counts the length of the list for handiness

	}

	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		if (length == 0) {
			return; // do nothing
		}
		head = head.getNext();
		length--;
	}

// dq method 
	@Override
	public void addAtEnd(String data) {
		if (head == null) {
			addAtBeginning(data);
		} else {
			Node node = head;

			while (node.getNext() != null) {
				node = node.getNext();
			}
			// node.next = new Node(data);
			node.setNext(new Node(data));
			length++;
		}
	}

//
//		Node node = getNodeAt(length - 1);
//		
//		node.setData(data);
//		length++;

	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// TODO #5
			Node node = getNodeAt(length - 2);
			node.setNext(null);
			length--;
		}
	}

	@Override
	public String get(int index) {
		// TODO #3
		Node node = getNodeAt(index);
		if (node == null) {
			throw new IndexOutOfBoundsException();

		} else {
			return node.getData();
		}

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end
		while (node != null) {
			sb.append(node);
			node = node.getNext();
		}
		return sb.toString();
	}

	@Override
	public int size() {
		return length;
	}

	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return
				// null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

}