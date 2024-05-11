public class Program {
 
    public static void main(String[] args) {
      Node n1 = new Node(1.0f);
      n1.setNext(n1);
      Node n2 = new Node(2.0f);

      n1.setNext(n2);

      Node n3 = new Node(3.0f);
      n2.setNext(n3);

      System.out.println(n1);
      Node head = n1;
      Node aux  = head;
      while(aux != null){
        System.out.println(aux);
        aux = aux.getNext();
      }
      System.out.println("head: " + head.getData());
      
      Node last = head;
      while(last.getNext() != null) {
        last = last.getNext();
      }

      System.out.println("last" + last.getData());
      
      System.out.println("Inserindo 5.0f depois de last");
      last.setNext(new Node(5.0f));

      System.out.println("Inserindo 99.9f antes de head");
      Node x = new Node(99.9f);
      x.setNext(head);
      head = x;


      




    }

}