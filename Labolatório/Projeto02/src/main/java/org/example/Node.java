package org.example;

public class Node {

    private float data;

    private Node next;

    public Node(float data){
        this.data = data;
        this.next = null;
    }

    public Node (Node next){
        this.data = 0.0f;
        this.next = next;
    }

    public Node(float data, Node next){
        this.data = data;
        this.next = next;
    }

    public float getData() {return data;}
    public void setData(float data) { this.data = data;}

    public Node getNext() { return next; }
    public void setNext(Node next) {this.next = next;}

}
