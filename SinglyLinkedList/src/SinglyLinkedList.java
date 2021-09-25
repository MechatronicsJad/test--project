
public class SinglyLinkedList<T> implements SList<T> {
private SNode<T> head , tail; 
private int size;
	private StringBuilder sb;

	public SinglyLinkedList() {
		size = 0;
		head = tail = null;
		sb = new StringBuilder();
	}
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return (size==0);
	}

	@Override
	public void insertAthead(T e) {
		SNode<T> SNode = new SNode(e , head);
		if(isEmpty())
			tail = SNode;
		
		head = SNode;
		size++;
		sb.insert(0,e.toString()+" ");
		
	}

	@Override
	public void insertAtTail(T e) {
		SNode<T> SNodpje = new SNode(e , tail);
		if(isEmpty())
head = SNode; 
		else {
			tail.setNext(SNode);
		}
		tail = SNode;
		size++;
		sb.append(e.toString()+" ");
	}

	@Override
	public T removeFromTail() throws EmptyListException {
		if(isEmpty()) 
			throw new EmptyListException("List is Empty!!");
			T toReturn = tail.getElement();
			if(head == tail) {
				head = tail = null;
			}else {
				SNode<T> temp = head;
				while(temp.getNext()!=tail) {
					temp = temp.getNext();
				}
				tail = temp;
				temp.setNext(null);
			}
			size--;
			sb.delete(sb.length()-toReturn.toString().length()-1,sb.length());
		return toReturn;
	}

	@Override
	public T removeFromHead() throws EmptyListException {
		if(isEmpty())
			throw new EmptyListException("List is Empty");
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
	public T getHead()  throws EmptyListException{
		if(isEmpty())
			throw new EmptyListException("List is Empty");
		T toReturn = head.getElement();
		return toReturn;
	}
	public T geTail() throws EmptyListException{
		if(isEmpty())
			throw new EmptyListException("List is Empty");
		T toReturn = tail.getElement();
		return toReturn;
	}
	
	public String toString() {
		return sb.toString();
	}

}
