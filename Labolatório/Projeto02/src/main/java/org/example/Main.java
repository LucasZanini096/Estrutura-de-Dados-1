// Enzo Ribeiro - 10418262
// Lucas Zanini da Silva - 10417361
// Gabriel Ken -

package org.example;


public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.insertDesc(5);
        myList.insertDesc(4);
        myList.insertDesc(8);
        myList.insertDescNoDup(5);
        System.out.println(myList.count());
        myList.printNodes();
        System.out.println();
        System.out.println(myList.getNode(8).getData());
        System.out.println(myList.getHead().getData());
        System.out.println(myList.getTail().getData());
        myList.insertAsc(6);
        myList.printNodes();
        myList.insertAscNoDup(5);
        System.out.println(myList.count());
        myList.printNodes();
        myList.sort();
        System.out.println();
        myList.printNodes();
        myList.reverse();
        System.out.println(myList.removeHead().getData());
        System.out.println(myList.removeTail().getData());
        myList.printNodes();
        myList.insert(6);
        myList.insert(8);
        myList.insert(4);
        System.out.println();
        myList.printNodes();
        myList.removeDup();
        System.out.println();
        myList.printNodes();
        myList.removeNode(4);
        System.out.println();
        myList.printNodes();
        System.out.println(myList.count());
        System.out.println(myList.isEmpty());
        myList.clear();
        System.out.println(myList.count());
        myList.printNodes();
    }
}