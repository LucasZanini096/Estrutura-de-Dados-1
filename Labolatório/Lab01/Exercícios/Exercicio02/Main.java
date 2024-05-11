//Lucas Zanini da Silva - 32322992
package Exercicio02;
import java.util.Scanner; 

public class Main {

  static void verificationVogal(char letter){

    if(Character.isDigit(letter)) { //Verificação se o que foi digitado é um número
      System.out.println("O que você digitou não é um número!");
      return;
    }

    switch (letter) {
      case 'a':
        System.out.println("A letra digitada é uma vogal!");
        break;
      case 'e':
        System.out.println("A letra digitada é uma vogal!");
        break;
      case 'i':
        System.out.println("A letra digitada é uma vogal");
        break;
      case 'o':
        System.out.println("A letra digitada é uma vogal!");
        break;
      case 'u':
        System.out.println("A letra digitada é uma vogal");
      default:
        System.out.println("A letra digitada é uma consoante");
        break;
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner myObj = new Scanner(System.in);
    System.out.print("Digite um carácter: ");

    char letter = (char)System.in.read();

    System.out.println("O número é: " + (int)letter );

    verificationVogal(letter);

    myObj.close();
  }

}
