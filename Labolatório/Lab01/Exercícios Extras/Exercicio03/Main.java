package Exercicio03;
import java.util.Scanner;

public class Main {

  static int numPermutation(int x){

    if(x == 0 || x == 1) return 1;

    return x * numPermutation(x - 1);
  }
  
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Digite um número qualquer:");

    int num01 = myScanner.nextInt();

    myScanner.nextLine();

    System.out.print("Digite outro número qualquer:");
    int num02 = myScanner.nextInt();

    if(num01 == numPermutation(num02)) System.out.println("O número 1 é a permutação do número 02");
    else System.out.println("O número 01 não é uma permutação do número 02");

  }
}
