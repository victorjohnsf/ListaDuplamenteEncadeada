package aulaas;

public class Node {
	    int data;
	    Node next;
	    Node prev;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	class DoublyLinkedList {
	    Node head;
	    Node tail;

	    public void insertInOrder(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = tail = newNode;
	        } else if (data <= head.data) {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        } else if (data >= tail.data) {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null && current.next.data < data) {
	                current = current.next;
	            }
	            newNode.next = current.next;
	            newNode.prev = current;
	            current.next.prev = newNode;
	            current.next = newNode;
	        }
	    }

	    public void printAscending() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public void printDescending() {
	        Node current = tail;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }
	}
