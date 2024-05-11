import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    
    Queue myQueue = new Queue(10);
    int counter = myQueue.count();
    Scanner myScanner = new Scanner(System.in);
    int option = 0;

    do {

      
      String[] menu = {"*** CONTROLE DE TAREFAS ***", 
      "1 - Iniciar a próxima tarefa na fila", 
      "2 - Inserir uma tarefa na fila",
      "3 - Verificar qual é a próxima tarefa na fila",
      "4 - Exibir quantas tarefas ainda faltam fazer",
      "5 - Remover todas as tarefas da fila",
      "6 - Sair"};

      for (String string : menu) {
        System.out.println(string);
      }

      System.out.println(counter);

      System.out.printf("Tarefa atual: %s\n", (myQueue.isEmpty() ? "<nenhuma>" : myQueue.catchItem(counter - 1)));

      System.out.print("Escolha uma opção: ");

      try {
        option = myScanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Opção inválida");
        break;
      }

      if(option <= 0 || option > 6) {
        System.out.println("Opção inválida");
        continue;
      }

      switch (option) {

        case 1:
          if(myQueue.isEmpty()) {
            System.out.println("Não há tarefas na lista");
            break;
          }

          System.out.println(">>> Iniciando a tarefa:");
          System.out.println(myQueue.Dequeue());
          --counter;
          break;

        case 2:
          
          myScanner.nextLine(); //Limpando o buffer de memória

          if(myQueue.isFull()) {
            System.out.println("A fila já está cheia!");
            break;
          }

          System.out.println("Descreva a nova tarefa:");

          String myString = myScanner.nextLine();
          myQueue.Enqueue(myString);
          ++counter;
          break;

        case 3:

          if(myQueue.count() == 1){
            System.out.println("Há apenas 1 elemento na lista de tarefas");
            break;
          }

          System.out.println(">>> A próxima tarefa a fazer é:");
          System.out.println(myQueue.catchItem(counter - 1));
          
          break;

        case 4:

        if(myQueue.isEmpty()){
          System.out.println("Não há tarefas a fazer");
          break;
        }
          System.out.printf("Tarefas a fazer: %d (de um máximo de %d)", counter, myQueue.size());
          break;

        case 5:
          System.out.println("Todas as tarefas foram removidas");
          myQueue.clear();
          break;

        default:
          break;
      }
      
    } while (option != 6);
    
    myScanner.close();
    System.out.println("Fim");
  }

}
