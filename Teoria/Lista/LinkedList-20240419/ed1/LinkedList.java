package ed1;

public class LinkedList {
	
	private Node head;
	private int count;
	
	public LinkedList() {
		head = null;
		count = 0;
	}
	
	public int count() {
		return count;
	}
	
	public boolean isEmpty() {
		// O código comentado abaixo também funciona para verificar se a lista está vazia.
		//return head == null;
		
		return count == 0;
	}
	
	// Inserção no início da lista.
	public void insert(float value) {
		Node n = new Node(value, head);
		head = n;
		
		++count;
	}
	
	// Inserção no final da lista.
	public void append(float value) {
		Node n = new Node(value);
		
		if (isEmpty()) {
			head = n;
		} else {
			Node tail = getTail();
			
			// Nesse ponto, tail nunca é null, já que o else
			// só é executado se a lista não for vazia. Por
			// isso não há uma verificação if (tail == null)
			// nesse trecho do código.
			tail.setNext(n);
		}
		
		++count;
	}
	
	public boolean insertAfter(float value, float other) {
		// Busca o nó com valor other.
		Node aux = getNode(other);
		
		// O nó com valor other não existe se aux for null.
		if (aux == null) {
			return false;
		}
		
		Node n = new Node(value, aux.getNext());
		aux.setNext(n);
		
		++count;
		
		return true;
	}
	
	public boolean insertBefore(float value, float other) {
		// Caso especial: inserção antes do head (precisamos atualizar
		// a referência head). Podemos aproveitar o método insert(),
		// que insere um nó no início da lista (ou seja, antes do head).
		if (head != null && head.getData() == other) {
			insert(value);
			return true;
		}
		
		// Da forma que conversamos em aula, a busca pelo nó com
		// valor other é feita buscando o nó anterior ao nó que
		// possui o valor other.
		Node aux = head;
		while (aux != null) {
			// Condição para lidar com o último nó da lista,
			// quando o next é null.
			if (aux.getNext() != null) {
				// Nó anterior ao nó que tem valor other foi encontrado.
				if (aux.getNext().getData() == other) {
					break;
				}
			}
			aux = aux.getNext();
		}
		
		if (aux == null) {
			return false;
		}
		
		Node n = new Node(value, aux.getNext());
		aux.setNext(n);
		
		++count;
		
		return true;
	}

	public Node getHead() {
		return head;
	}
	
	public Node getTail() {
		if (isEmpty()) {
			return null;
		}
		
		Node tail = head;
		while (tail.getNext() != null) {
			tail = tail.getNext();
		}
		return tail;
	}
	
	public Node getNode(float value) {
		Node aux = head;
		while (aux != null && aux.getData() != value) {
			aux = aux.getNext();
		}
		return aux;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("(count=" + count + ")\n");
		
		Node aux = head;
		while (aux != null) {
			sb.append(aux + "\n");
			aux = aux.getNext();
		}
		
		return sb.toString();
	}

}
