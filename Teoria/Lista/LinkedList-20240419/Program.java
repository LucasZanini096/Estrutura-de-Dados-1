import ed1.LinkedList;
import ed1.Node;

public class Program {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("list: " + list);
		
		list.insert(1.0f);
		System.out.println("list: " + list);
		
		list.append(2.0f);
		System.out.println("list: " + list);
		
		list.insert(99.0f);
		System.out.println("list: " + list);
		
		float value = 301.0f;
		float other = 1.0f;
		boolean r = list.insertAfter(value, other);
		System.out.println("Inseriu " + value + " depois do " + other + "? " + r);
		System.out.println("list: " + list);

		value = 123.0f;
		other = 10.0f;
		r = list.insertAfter(value, other);
		System.out.println("Inseriu " + value + " depois do " + other + "? " + r);
		System.out.println("list: " + list);

		value = 302.0f;
		other = list.getTail().getData();
		r = list.insertBefore(value, other);
		System.out.println("Inseriu " + value + " antes do " + other + "? " + r);
		System.out.println("list: " + list);

		value = 999.0f;
		other = 10.0f;
		r = list.insertBefore(value, other);
		System.out.println("Inseriu " + value + " antes do " + other + "? " + r);
		System.out.println("list: " + list);
		
		Node head = list.getHead();
		System.out.println("head: " + head);

		Node tail = list.getTail();
		System.out.println("tail: " + tail);

		Node n = list.getNode(999.0f);
		System.out.println("n: " + n);

		n = list.getNode(1.0f);
		System.out.println("n: " + n);
	}

}
