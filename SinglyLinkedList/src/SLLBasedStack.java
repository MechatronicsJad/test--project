
public class SLLBasedStack<T> implements Stack<T> {
	private SinglyLinkedList<T> sll ;
	public SLLBasedStack() {
		sll = new SinglyLinkedList<>();
	}
	@Override
	public int size() {
		
		return sll.size();
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return sll.isEmpty();
	}
	@Override
	public void push(T e) throws StackException {
		
		sll.insertAthead(e);
	}
	
	public T pop() throws StackException {
		T toReturn;
		try {
			toReturn = sll.removeFromHead();
		} catch (EmptyListException e) {
			throw new StackException("Stack is Empty!!");
		}
		
		return toReturn;
	}
	@Override
	public T top() throws StackException {
		T toReturn;
		try {
			
			toReturn = sll.getHead();
		} catch (EmptyListException e) {
			throw new StackException("Stack is Empty");
		}
		
		return toReturn;
	}

}
