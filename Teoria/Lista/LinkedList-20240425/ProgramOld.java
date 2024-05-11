import ed1.Node;

public class ProgramOld {
	
	public static void printNodes(Node head) {
		// Importante usar uma referência auxiliar para percorrer todos os nós
		// (não podemos perder a referência para o primeiro nó!).
		Node aux = head;
		while (aux != null) {
			System.out.println(aux);
			aux = aux.getNext();
		}
		
	}

	public static void main(String[] args) {
		Node n1 = null;
		n1 = new Node(1.0f);		
		System.out.println("n1: { " + n1 + " }");
		
		Node n2 = new Node(2.0f);
		System.out.println("n2: { " + n2 + " }");
		
		// Conexão manual entre o n1 e n2 (o n1 vem antes do n2).
		n1.setNext(n2);
		System.out.println("n1: { " + n1 + " }");
		System.out.println("n2: { " + n2 + " }");
		
		// Cria um terceiro nó (n3) e indica que ele vem depois do n2.
		Node n3 = new Node(3.0f);
		n2.setNext(n3);
		System.out.println("n1: { " + n1 + " }");
		System.out.println("n2: { " + n2 + " }");
		System.out.println("n3: { " + n3 + " }");
		
		// Cria um quarto nó diretamente no next de n3.
		n3.setNext(new Node(4.0f));
		
		System.out.println("---- criando head ----");
		Node head = n1; // Define que n1 é o primeiro da lista.
		printNodes(head);
		System.out.println("head: " + head);

		System.out.println("---- encontrando last ----");
		// O último nó é o que tem next == null.
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		System.out.println("last: " + last);

		System.out.println("---- inserindo 5.0f depois de last ----");
		last.setNext(new Node(5.0f));

		printNodes(head);
		System.out.println("head: " + head);
		
		System.out.println("---- inserindo 99.9f antes de head ----");
		Node x = new Node(99.9f);
		// A ordem das duas linhas abaixo é muito importante!!!
		x.setNext(head); // nesse momento, head aponta para n1, então x.setNext(n1);
		head = x; // agora head aponta para x, indicando que x é o primeiro nó.

		printNodes(head);
		System.out.println("head: " + head);

		System.out.println("---- inserindo 123.4f antes de head ----");
		// Usando construtor que já recebe o next como segundo parâmetro.
		// Indicamos que o próximo de y é head (x, nesse momento).
		Node y = new Node(123.4f, head);
		head = y; // agora head aponta para y, indicando que y é o primeiro nó.
		
		printNodes(head);
		System.out.println("head: " + head);
		
		// Inserir novo nó DEPOIS de um nó específico.
		// Exemplo: Novo = 301.0, específico = 1.0.
		System.out.println("---- inserindo 301.0f depois de 1.0f ----");
		float buscaValor = 1.0f;
		Node aux = head;
		while (aux != null && aux.getData() != buscaValor) {
			aux = aux.getNext();
		}
		System.out.println("buscaValor: " + buscaValor + ", aux: " + aux);
		if (aux == null) {
			System.out.println("Não existe valor " + buscaValor + " na lista.");
		} else {
			Node n = new Node(301.0f, aux.getNext());
			aux.setNext(n);
		}
		printNodes(head);

		// Inserir novo nó ANTES de um nó específico.
		// Exemplo: Novo = 302.0f, específico: 99.9f;
		System.out.println("---- inserindo 302.0f antes de 99.9f ----");
		buscaValor = 99.9f;
		// Inserção se nó específico é o primeiro é um caso à parte.
		if (head != null && head.getData() == buscaValor) {
			Node n = new Node(302.0f, head);
			head = n;
		} else {
			aux = head;
			while (aux != null && aux.getNext().getData() != buscaValor) {
				aux = aux.getNext();
			}
			if (aux == null) {
				System.out.println("Não existe valor " + buscaValor + " na lista.");
			} else {
				Node n = new Node(302.0f, aux.getNext());
				aux.setNext(n);
			}
		}
		printNodes(head);
	}
}
