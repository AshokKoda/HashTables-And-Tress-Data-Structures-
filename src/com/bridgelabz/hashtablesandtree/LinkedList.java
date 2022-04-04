package com.bridgelabz.hashtablesandtree;

public class LinkedList<K> {

	public INode<K> head;
	public INode<K> tail;

	public INode<K> search(K key) {
		INode<K> tempNode = head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void append(INode<K> newNode) {
		if (head == null) {
			head = newNode;
		} else {
			tail.setNext(newNode);
		}
		tail = newNode;
	}

	public INode<K> delete(K key) {
		INode<K> tempNode = head;
		if (tempNode == null) {
			return null;
		}
		while (tempNode.getNext() != null) {
			if (tempNode.getNext().getKey().equals(key)) {
				INode<K> value = tempNode.getNext().getNext();
				tempNode.setNext(value);
			}
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public int size() {
		INode<K> temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}
}
