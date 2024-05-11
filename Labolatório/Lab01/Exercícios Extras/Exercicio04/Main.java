package Exercicio04;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) throws InterruptedException {
    Scanner myScanner = new Scanner(System.in);
    //short randTime = (short)(Math.random() * 10001);
    short randNumber = (short)(Math.random() * 1001);

    Thread.sleep(5000);
    System.out.println("Agora!!");
    System.out.println("Digite o número " + randNumber);

    long inicialTime = System.currentTimeMillis();
    int myNumber = myScanner.nextInt();

    long finalTime = System.currentTimeMillis();
    
    if(myNumber != randNumber) System.out.println("Você não digitou o número corretamente");
    else System.out.print("Você demorou " + (finalTime - inicialTime) + " milisegundos");    

  }
}
