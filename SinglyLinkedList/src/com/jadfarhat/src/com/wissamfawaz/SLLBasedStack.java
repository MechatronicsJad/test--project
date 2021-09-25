package com.wissamfawaz;

public class SLLBasedStack<T> implements Stack<T> {
	private SinglyLinkedList<T> sll;
	
	public SLLBasedStack() {
		sll = new SinglyLinkedList<>();
	}

	@Override
	public int size() {
		return sll.size();
	}

	@Override
	public boolean isEmpty() {
		return sll.isEmpty();
	}

	@Override
	public void push(T e) {
		sll.insertAtHead(e);
	}

	@Override
	public T pop() throws StackException {
		try {
			T toReturn = sll.removeFromHead();
			return toReturn;
		} catch(EmptyListException e) {
			throw new StackException("Stack is empty!");
		}
		
	}

	@Override
	public T top() throws StackException {
		try {
			T toReturn = sll.getHead();
			return toReturn;
		} catch(EmptyListException e) {
			throw new StackException("Stack is empty!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
