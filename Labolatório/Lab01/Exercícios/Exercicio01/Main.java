//Lucas Zanini da Silva - 32322992
package Exercicio01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

  static void changeValues(int x, int y){
    int aux;
    aux = x;
    x  = y;
    y = aux;

    System.out.printf("O valor 01 é %d, enquanto o valor 02 é %d", x, y);
  }

  public static void main(String[] args) {

  Scanner myObj = new Scanner(System.in);
  boolean verificationLoop = true;
  
  while (verificationLoop) {

    try {

      System.out.print("Valor 01: ");
      int value01 = myObj.nextInt();

      myObj.nextLine(); //Limpando o buffer da variável anterior
  
      System.out.print("Valor 02: ");
      int value02 = myObj.nextInt();
  
      changeValues(value01, value02);
      verificationLoop = false;
  
      } catch (InputMismatchException e) {
        System.out.println("O que você digitou não é válido.\n Digite novamente os números");
        myObj.nextLine(); //Limpando o buffer da variável anterior
      }
    }
    myObj.close();
  }
}