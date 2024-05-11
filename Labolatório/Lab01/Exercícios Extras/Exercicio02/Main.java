package Exercicio02;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);
      System.out.print("Digite um número de 0 a 1000: ");

      try {

      short num = myScanner.nextShort();
         
      short randNum = (short)(Math.random() * 1001);

      if(num == randNum) System.out.println("Você acertou o número sorteado!!");
      else System.out.println("Não foi dessa vez!");

      } catch (InputMismatchException e) {
        System.out.println("Você deve digitar um número entre 0 e 1000!");
      }

      myScanner.close();
  }
}
