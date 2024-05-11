
public class Program {

	public static void main(String[] args) {
		Stack s = new Stack(2);
		for (int i = 0; i < 10; ++i) {
			try {
				s.push(i);
			} catch(RuntimeException e) {
				System.out.println("Pilha cheia.");
				System.out.println(e.getMessage());
				break;
			}
		}
		
		while(true) {
			try {
				System.out.println("s.pop(): " + s.pop());
			} catch(RuntimeException e) {
				System.out.println("Pilha vazia, nada a remover.");
				System.out.println(e.getMessage());
				break;
			}
		}
		
		Queue q = new Queue(3);
		for (int i = 0; i < 10; ++i) {
			try {
				q.enqueue(i);
			} catch(RuntimeException e) {
				System.out.println("Fila cheia.");
				System.out.println(e.getMessage());
				break;
			}
		}
		
		while(true) {
			try {
				System.out.println("q.dequeue(): " + q.dequeue());
			} catch(RuntimeException e) {
				System.out.println("Fila vazia, nada a remover.");
				System.out.println(e.getMessage());
				break;
			}
		}
		
		
		System.out.println("Fim.");
	}

}
