package com.wissamfawaz;

public class SinglyLinkedList<T> implements SList<T> {
	private SNode<T> head, tail;
	private int size;
	private StringBuilder sb;
	
	public SinglyLinkedList() {
		head = tail = null;
		size = 0;
		sb = new StringBuilder();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public void insertAtHead(T e) {
		SNode<T> newSNode = new SNode<>(e, head);
		
		if(isEmpty())
			tail = newSNode;
		
		head = newSNode;
		size++;
		sb.insert(0, e.toString() + " ");
	}

	@Override
	public void insertAtTail(T e) {
		SNode<T> newSNode = new SNode<>(e, null);
		
		if(isEmpty()) {
			head = newSNode;
		} else {
			tail.setNext(newSNode);
		}
		
		tail = newSNode;
		
		size++;
		sb.append(e.toString() + " ");
	}

	@Override
	public T removeFromHead() throws EmptyListException {
		if(isEmpty())
			throw new EmptyListException("List is empty!");
		T toReturn = head.getElement();
		
		if(head == tail) {
			head = tail = null;
		} else {
			head = head.getNext();			
		}
		
		size--;
		sb.delete(0, toReturn.toString().length()+1);
		return toReturn;
	}

	@Override
	public T removeFromTail() throws EmptyListException {
		if(isEmpty())
			throw new EmptyListException("List is empty!");
		T toReturn = tail.getElement();
		
		if(head == tail) {
			head = tail = null;
		} else {
			SNode<T> temp = head;
			while(temp.getNext() != tail) {
				temp = temp.getNext();
			}
			tail = temp;
			temp.setNext(null);
		}
		
		size--;
		sb.delete(sb.length()-toReturn.toString().length()-1, sb.length());
		return toReturn;
	}

	public T getHead() throws EmptyListException {
		if(isEmpty())
			throw new EmptyListException("List is empty!");
		return head.getElement();
	}
	
	public T getTail() throws EmptyListException {
		if(isEmpty())
			throw new EmptyListException("List is empty!");
		return tail.getElement();
	}
	
	public String toString() {
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
