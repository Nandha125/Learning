package DataStructures.LinkedList;

public class SinglyLinkedList<T> {
	
	// Node class
	public class Node<T>{
		public T data;
		public Node<T> next;
		Node(){
			this.next = null;
		}
	}
	// 
	public Node<T> headNode;
	public int size;
	
	SinglyLinkedList(){
		headNode = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		if(headNode.next==null) {
			return true;
		}
		return false;
	}
	
	// Insertion at Head
	public void insertAtHead(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = headNode;
		headNode = newNode;
	}
	
	// Insertion at End
	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		Node<T> temp = headNode;
		while(temp!=null && temp.data!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

}
 