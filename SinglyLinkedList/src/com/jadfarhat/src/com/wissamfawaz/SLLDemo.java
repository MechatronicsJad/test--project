package com.wissamfawaz;

public class SLLDemo {

	public static void main(String[] args) throws EmptyListException {
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		System.out.println("Size: " + sll.size());
		
		sll.insertAtHead(1);
		sll.insertAtHead(6);
		sll.insertAtHead(2);
		sll.insertAtTail(3);
		
		System.out.println(sll);
		
		System.out.println("After removing " + sll.removeFromHead() + ", sll: " + sll);
		System.out.println("Afer removing " + sll.removeFromTail() + ", sll: " + sll);
	}

}
