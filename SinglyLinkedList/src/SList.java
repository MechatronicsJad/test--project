
public interface SList<T> {

	public int size();

	public boolean isEmpty();

	public void insertAthead(T e);

	public void insertAtTail(T e);

	public T removeFromHead() throws EmptyListException;

	public T removeFromTail() throws EmptyListException;

}
