
public interface Stack<T> {
public int size();
public boolean isEmpty();
public void push(T e) throws StackException;
public T pop() throws StackException;
public T top() throws StackException;
}
