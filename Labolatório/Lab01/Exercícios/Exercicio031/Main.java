package Exercicio031;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner inputData = new Scanner(System.in);
    int[] array = new int[10];

    for (int i = 0; i < 10; i++){
      System.out.printf("Digite o número da posição %d", i);
      int num = inputData.nextInt();
      array[i] = num;
    }

    Arrays.sort(array);

    int maior = array[array.length - 1];
    int menor = array[0];

    System.out.printf("O menor número da lista é %d, enquanto o maior número é %d", menor, maior);
  }

}
