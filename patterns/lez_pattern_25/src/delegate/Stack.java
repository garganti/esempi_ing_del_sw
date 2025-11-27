package delegate;

import java.util.LinkedList;

// delegante
public class Stack<T> {
	// delegato
	private LinkedList<T> delegato;
	public Stack() {
		delegato = new LinkedList<>();
	}
	
	void push(T t) {
		delegato.addFirst(t);
	}
	
	
	T pop() {
		return delegato.removeFirst();
	}
	
}
