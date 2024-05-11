//Lucas Zanini da Silva - 32322992
package Exercicio06;
import java.util.Scanner;

public class Main {
   
  static float mulComAdicao(float x, int y){
    
    if(y == 0) return 0.0f;
    
    return x + mulComAdicao(x, y - 1);
  }

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Digite um número: ");

    int num01 = myScanner.nextInt();
    myScanner.nextLine();

    System.out.print("Digite outro número: ");
    int num02 = myScanner.nextInt();

    float resultado = mulComAdicao(num01, num02);

    System.out.println("O resultado é " + resultado);
  }
}
