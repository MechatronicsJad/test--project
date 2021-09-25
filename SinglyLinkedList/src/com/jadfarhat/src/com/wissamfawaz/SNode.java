package com.wissamfawaz;

public class SNode<T> implements Position<T> {
	private T element;
	private SNode<T> next;
	
	public SNode(T e, SNode<T> n) {
		element = e;
		next = n;
	}

	@Override
	public T getElement() {
		return element;
	}

	public SNode<T> getNext() {
		return next;
	}

	public void setNext(SNode<T> next) {
		this.next = next;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
}
