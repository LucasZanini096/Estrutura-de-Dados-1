///Lucas Zanini da Silva - 32322992
package Exercicio05;
import java.util.Scanner;
public class Main {

  static void min(int x, int y){
    if(x < y) System.out.println("O menor número é: " + x);
    else System.out.println("O menor número é: " + y);
  }

  static void max(int x, int y){
    if(x > y) System.out.println("O maior número é " + x);
    else System.out.println("O maior número é " + y);
  }

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Digite um número: ");

    int num01 = myScanner.nextInt();
    myScanner.nextLine();

    System.out.print("Digite outro número: ");
    int num02 = myScanner.nextInt();

    min(num01, num02);
    max(num01, num02);

  }
}