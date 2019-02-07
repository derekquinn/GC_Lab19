package co.grandcircus.lists;

public class Node {
	
	private String data;
	public Node next;
	
	// linked list that holds strings declared above 
	// every node has 1 value in it 
	
	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Node(String data) {
		this.data = data;
	}
	
	public Node() {}
	// 1 of 3 CONSTRUCTOR if you create a node and you pass it a string it will return the data 
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		if (next != null) {
			return this.data + " -> ";
		} else {
			return this.data;
		}
	}
	
}