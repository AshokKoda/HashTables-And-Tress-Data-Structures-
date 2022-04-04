package com.bridgelabz.hashtablesandtree;

public class Node<K, V> implements INode<K> {

	K key;
	V value;
	Node<K, V> next;

	public Node(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;

	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setNext(INode<K> next) {
		this.next = (Node<K, V>) next;

	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
