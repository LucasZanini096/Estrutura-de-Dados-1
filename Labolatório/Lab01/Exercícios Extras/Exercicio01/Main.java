package Exercicio01;
import java.util.Scanner;

public class Main{
  private int divisor;
  private int counter;

  Main(){
    this.divisor = 1;
    this.counter = 0;
  }

  static int verificationPrimo(int x, int div, int counter){

    if(div > x) return counter;

    if(x % div == 0) counter++;

    return verificationPrimo(x % div, div++, counter);
  }

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    Main myObj = new Main();
    System.out.print("Digite um número: ");

    int num = myScanner.nextInt();

    int result = verificationPrimo(num, myObj.divisor, myObj.counter);

    if(result > 2) System.out.println("O número não é primo");
    else System.out.println("O número é primo");

    myScanner.close();
  }
}