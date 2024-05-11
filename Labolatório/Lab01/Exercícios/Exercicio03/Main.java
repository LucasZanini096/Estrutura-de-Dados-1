package Exercicio03;
import java.util.Scanner;

public class Main {

  private int data[];
  private int counter;

  public Main(){
    data = new int[10];
    counter = 0;
  }

  public void pushValues(int value){
    data[counter++] = value;
  }

  public int[] getValues(){
    return data;
  }

  public void maxAndMinValues(int[] data){
    int max = Integer.MIN_VALUE; //Menor valor no Java
    int indexMax = -1;
    for (int i = 0; i < data.length; i++){
      if(data[i] > max){
        max = data[i];
        indexMax = i;
      }
    }
  }
  
  public static void main(String[] args) {
    
    Scanner myObjScanner = new Scanner(System.in);
    Main myObjMain = new Main();

    for(int i = 0; i < 10; i++){
      System.out.printf("Digite o número %d da lista: ", i);
      int actualValue = myObjScanner.nextInt();
      myObjMain.pushValues(actualValue);
    }

    int[] listNumbers = myObjMain.getValues(); 
    
    
    myObjScanner.close();
  }
}
