
public class Queue {
	private static final int DEFAULT_CAPACITY = 32;
	
	private Deque deque;
	
	public Queue() {
		this(DEFAULT_CAPACITY);
	}
	
	public Queue(int capacity) {
		deque = new Deque(capacity);
	}
	
	public void enqueue(int value) {
		if (isFull()) {
			throw new RuntimeException("enqueue(" + value + "): Fila cheia.");
		}
		
		deque.insertBack(value);
	}
	
	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("dequeue(): Fila vazia.");
		}

		return deque.removeFront();
	}
	
	public int front() {
		if (isEmpty()) {
			throw new RuntimeException("dequeue(): Fila vazia.");
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
