
public class Stack {
	private static final int DEFAULT_CAPACITY = 32;
	
	private Deque deque;
	
	public Stack() {
		this(DEFAULT_CAPACITY);
	}
	
	public Stack(int capacity) {
		deque = new Deque(capacity);
	}
	
	public void push(int value) {
		if (isFull()) {
			throw new RuntimeException("push(" + value + "): Pilha cheia.");
		}
		
		deque.insertFront(value);
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("pop(): Pilha vazia.");
		}

		return deque.removeFront();
	}
	
	public int top() {
		if (isEmpty()) {
			throw new RuntimeException("top(): Pilha vazia.");
		}
		
		return deque.front();
	}
	
	public boolean isEmpty() {
		return deque.isEmpty();
	}
	
	public boolean isFull() {
		return deque.isFull();
	}
}
