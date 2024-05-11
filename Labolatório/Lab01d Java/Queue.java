public class Queue{

  private Object[] data;
  private int capacity;
  private int first;
  private int last;
  private int count;

  public Queue(int capacity){

    this.capacity = capacity;
    data = new Object[capacity];
    this.first = 0;
    this.last = this.first + this.count;
    this.count = 0;
  }

  public void Enqueue(Object x){
    if(isFull()){
      System.out.println("O elemento não pode ser inserido pois a fila está cheia!");
      return;
    }

    data[last] = x;
    last = (last + 1) % capacity;
    ++count;
  }

  public Object Dequeue(){
    if(isEmpty()){
      System.out.println("O elemento do topo da fila não pode ser retirado, pois não há nenhum elemento!");
      return null;
    }

    Object firstElement = data[first];
    data[first] = null;
    first = (first + 1) % capacity;
    --count;

    return firstElement;
  }

  public Object front(){
    if(isEmpty()){
      System.out.println("A fila está vazia");
      return null;
    }

    return data[first];

  }

  public boolean isFull(){
    return this.count == this.capacity;
  }

  public boolean isEmpty(){
    return this.count == 0;
  }

  public int count(){
    return this.count;
  }

  public int size(){
    return this.capacity;
  }
  
  public Object catchItem(int x){
    return this.data[x];
  }
  
  public void clear(){
    while (!this.isEmpty()) {
      this.Dequeue();
    }
  }
}