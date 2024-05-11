//Lucas Zanini da Silva - 32322992
package Exercicio07;
import java.util.Scanner;
public class Main {
  
  static int qtdVogals(String x){

    int counter = 0;

    for(int i = 0; i < x.length(); i++){

      switch (x.toLowerCase().charAt(i)) {
        case 'a':
        counter++;
          break;
        case 'e':
        counter++;
          break;
        case 'i':
        counter++;
          break;
        case 'o':
        counter++;
          break;
        case 'u':
        counter++;
          break;
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Digite uma frase: ");

    String myString = myScanner.nextLine();

    int qtdVolgalsString = qtdVogals(myString);

    System.out.println("A quantidade de vogais da String é " + qtdVolgalsString);

  }
}
