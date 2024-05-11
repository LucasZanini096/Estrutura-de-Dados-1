// Enzo Ribeiro - 10418262
// Lucas Zanini da Silva - 10417361
// Gabriel Ken -

package org.example;

import org.jetbrains.annotations.NotNull;

public class LinkedList {

    private Node head;
    private int count;

    public LinkedList(){
        head = null;
        count = 0;
    }

    public void insert(float element) { //Inserção no início da lista
        head = new Node(element, head);
        ++this.count;
        return;
    }

    public void append(float element) {
        Node n = new Node(element);

        if(isEmpty()){
            head = n;

        } else {

            Node tail = getTail();
            tail.setNext(n);

        }
        ++this.count;
        return;

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

        ++this.count;

        return true;
    }

    public void insertAsc(float element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        if (element < head.getData()) {
            newNode.setNext(head);
            head = newNode;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && element > current.getData()) {
            prev = current;
            current = current.getNext();
        }

        if (prev != null) {
            insertAfter(element, prev.getData());
        } else {
            assert head != null;
            insertAfter(element, head.getData());
        }

        ++this.count;
    }

    public boolean insertAscNoDup(float element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            head = newNode;
            ++this.count;
            return true;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.getData() == element) {
                return false; // Duplicata encontrada, não insere
            }

            if (element < current.getData()) {
                if (prev != null) {
                    insertAfter(element, prev.getData());
                } else {
                    insertAfter(element, head.getData());
                }
                ++this.count;
                return true;
            }

            prev = current;
            current = current.getNext();
        }

        // Chegou ao fim da lista sem encontrar duplicata nem local para inserção
        assert prev != null;
        prev.setNext(newNode);
        ++this.count;
        return true;
    }

    public void insertDesc(float element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        if (element > head.getData()) {
            newNode.setNext(head);
            head = newNode;
            ++this.count;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && element < current.getData()) {
            prev = current;
            current = current.getNext();
        }

        if (prev != null) {
            insertAfter(element, prev.getData());
        } else {
            assert head != null;
            insertAfter(element, head.getData());
        }
        ++this.count;
    }

    public boolean insertDescNoDup(float element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            head = newNode;
            ++this.count;
            return true;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.getData() == element) {
                return false; // Duplicata encontrada, não insere
            }

            if (element > current.getData()) {
                if (prev != null) {
                    insertAfter(element, prev.getData());
                } else {
                    insertAfter(element, head.getData());
                }
                ++this.count;
                return true;
            }

            prev = current;
            current = current.getNext();
        }

        // Chegou ao fim da lista sem encontrar duplicata nem local para inserção
        assert prev != null;
        prev.setNext(newNode);
        ++this.count;
        return true;
    }


    public Node removeHead() {
        if (head == null){
            return null;
        }

        Node removed = head;
        head = head.getNext();

        removed.setNext(null);
        --this.count;
        return removed;

    }

    public Node removeTail() {
        if (isEmpty()) {
            return null;
        }


        if (head.getNext() == null) {
            return removeHead();
        }

        // Vamos procurar pelo penúltimo nó da lista.
        Node aux = head;
        while (aux.getNext() != null && aux.getNext().getNext() != null) {
            aux = aux.getNext();
        }

            Node removed = aux.getNext();
            aux.setNext(null);
            --this.count;
            return removed;

    }


    public Node removeNode(float element) {
        if (isEmpty()){
            return null;
        }

        if (head.getData() == element){
            return removeHead();
        }

        Node aux = head;
        while(aux.getNext() != null && aux.getNext().getData() != element){
            aux = aux.getNext();
        }

        if(aux != null) {
            if (aux.getNext() == null && aux.getData() != element) {
                return null;
            }

            Node removed = aux.getNext();
            aux.setNext(removed.getNext());
            removed.setNext(null);
            --this.count;
            return removed;
        }

        return null;
    }


    public void removeDup() {
        Node headAux = head;
        Node aux = head;

        while(headAux.getNext() != null){
            while (aux.getNext() != null) {
                if(aux.getData() == aux.getNext().getData()) {
                    this.removeNode(aux.getData());
                    break;
                }
                aux = aux.getNext();
            }
            headAux = headAux.getNext();
            aux = headAux;
        }

    }


    public Node getHead() {
       return head;
    }


    public Node getTail() {
        if (isEmpty()){
            return null;
        }
        Node tail = head;

        while(tail.getNext() != null){
            tail = tail.getNext();
        }
        return tail;
    }


    public Node getNode(float value) {
        Node aux = head;
        while (aux.getData() != value) {
            aux = aux.getNext();
        }
        return aux;
    }

    public int count() {
        return this.count;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public void clear() {
        while (head != null) {
            this.removeTail();
        }
    }

    static void swap(@NotNull Node ptr1, @NotNull Node ptr2){
        float tmp = ptr2.getData();
        ptr2.setData(ptr1.getData());
        ptr1.setData(tmp);
    }
    public void sort() {  //Bubble Sort
        boolean swaped;
        Node current;

        if(isEmpty()){
            return;
        }

        do {
            swaped = false;
            current = head;
            while (current.getNext() != null){
                if(current.getData() > current.getNext().getData()){
                    swap(current, current.getNext());
                    swaped = true;
                }

                current = current.getNext();
            }
        } while (swaped);
    }

    public void reverse() {

        boolean swaped;
        Node current;

        if(isEmpty()){
            return;
        }

        do{

            swaped = false;
            current = head;

            while(current.getNext() != null){
                if (current.getData() < current.getNext().getData()){
                    swap(current, current.getNext());
                    swaped = true;
                }
                current = current.getNext();
            }

        } while(swaped);
    }

    public boolean isEqual(LinkedList element) {

        Node currentThisList;
        Node currentAnotherList;

        if(this.isEmpty() && element.isEmpty()){
            return true;
        }

        if(this.count() != element.count()){
            return false;
        }

        currentThisList = this.head;
        currentAnotherList = element.head;

        while(currentThisList.getNext() != null){
            if(currentThisList.getData() != currentAnotherList.getData()){
                return false;
            }
            currentAnotherList = currentAnotherList.getNext();
            currentThisList = currentThisList.getNext();
        }

        return true;
    }

    public void printNodes(){
        if(head == null){
            System.out.println("A linked list está vazia");
            return;
        }

        Node aux = this.head;
        System.out.print(aux.getData() + " ");
        while (aux.getNext() != null){
            aux = aux.getNext();
            System.out.print(aux.getData() + " ");
        }
    }
}
