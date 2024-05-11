
public class Deque {
	private static final int DEFAULT_CAPACITY = 32;
	
	private int first;
	private int last;
	private int count;
	private int data[];
	
	public Deque() {
		this(DEFAULT_CAPACITY);
	}
	
	public Deque(int capacity) {
		data = new int[capacity];
		first = 0;
		last = 0;
		count = 0;
	}
	
	public void insertFront(int value) {
		if (isFull()) {
			throw new RuntimeException("insertFront(" + value + "): Deque cheia.");
		}
		
		first = (first - 1 + data.length) % data.length;
		data[first] = value;
		++count;
	}
	
	public void insertBack(int value) {
		if (isFull()) {
			throw new RuntimeException("insertBack(" + value + "): Deque cheia.");
		}
		
		data[last] = value;
		last = (last + 1) % data.length;
		++count;
	}
	
	public int removeFront() {
		if (isEmpty()) {
			throw new RuntimeException("removeFront(): Deque vazia.");
		}
		
		int value = data[first];
		data[first] = 0;
		first = (first + 1) % data.length;
		--count;
		
		return value;
	}
	
	public int removeBack() {
		if (isEmpty()) {
			throw new RuntimeException("removeBack(): Deque vazia.");
		}
		
		last = (last - 1 + data.length) % data.length;
		int value = data[last];
		data[last] = 0;
		--count;
		
		return value;
	}
	
	public int front() {
		if (isEmpty()) {
			throw new RuntimeException("front(): Deque vazia.");
		}
		
		return data[first];
	}
	
	public int back() {
		if (isEmpty()) {
			throw new RuntimeException("back(): Deque vazia.");
		}

		int indexLast = (last - 1 + data.length) % data.length;
		return data[indexLast];
	}
	
	public boolean isFull() {
		return count == data.length;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
}
