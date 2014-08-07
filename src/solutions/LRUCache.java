package solutions;

import java.util.HashMap;

public class LRUCache {
	// Node to store the key-value pairs.
	class Node {
		int key;
		int value;
		Node next;
		Node prev;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
			next = null;
			prev = null;
		}
	}

	// Doubly link list of type Node.
	class DoublyLL {

		Node head;
		Node last;
		int capacity;
		int count;

		public DoublyLL(int c) {
			this.capacity = c;
			count = 0;
			head = new Node(0, 0);// Their keys and value do not matter.
			last = new Node(0, 0);
			head.next = last;
			last.prev = head;
		}
	}

	HashMap<Integer, Node> map; // The map will store a reference to the Node in
								// DLL corresponding to each key.
	DoublyLL dll;

	public LRUCache(int capacity) {
		dll = new DoublyLL(capacity);
		map = new HashMap<Integer, Node>();
	}

	public int get(int key) {

		if (map.containsKey(key)) {
			Node n = map.get(key);

			if (n.prev != dll.head) {
				detach(n);
				attach(n);
			}

			return n.value;
		} else
			return -1;
	}

	public void set(int key, int value) {
		Node n;

		if (!map.containsKey(key)) {
			n = new Node(key, value);
			if (dll.capacity != dll.count)
				dll.count++;
			else {
				map.remove(dll.last.prev.key);
				detach(dll.last.prev);
			}
			attach(n);
			map.put(key, n);

		} else {
			n = map.get(key);
			n.value = value;
			detach(n);
			attach(n);
		}
	}

	private void attach(Node node) {
		node.prev = dll.head;
		node.next = dll.head.next;
		dll.head.next.prev = node;
		dll.head.next = node;

	}

	private void detach(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

}
