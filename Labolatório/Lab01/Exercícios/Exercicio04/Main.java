//Lucas Zanini da Silva - 32322992
package Exercicio04;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    int[] array = new int[10];

    for (int i = 0; i < 10; i++){
      System.out.printf("Digite o número da posição %d: ", i);
      int num = inputData.nextInt();
      array[i] = num;
    }

    Arrays.sort(array);

    

    /*
     
    for(int i = array.length - 1; i > 0; i--){
      System.out.printf("%d ", array[i]);
    }

     */
    
  }
  
}
