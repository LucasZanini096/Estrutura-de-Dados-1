import java.lang.reflect.Array;
import java.util.Scanner;

public class Program {

  static boolean verificationString(String x){

    Pill myPill = new Pill();

    //Pegando todos os elementos da string;
    for(int i = x.length() - 1; i >= 0; i--){
      myPill.push(x.charAt(i));
    }

    //Verificação de Caracteres Especiais

    for (int i = 0; i < myPill.count(); i++) {
      switch ((char) myPill.catchItem(i)) {
          case '<':
              if (!myPill.haveItem('>')) {
                  return false;
              }
              break;
  
          case '{':
              if (!myPill.haveItem('}')) {
                  return false;
              }
              break;
  
          case '[':
              if (!myPill.haveItem(']')) {
                  return false;
              }
              break;
  
          case '(':
              if (!myPill.haveItem(')')) {
                  return false;
              }
              break;
  
          default:
              break;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.print("Digite uma frase qualquer: ");

    String myString = myScanner.nextLine();

    boolean verification = verificationString(myString);
    
    if(verification) {
      System.out.println("A string está correta");
    }

    else {
      System.out.println("A string não está correta");
    }

    myScanner.close();

  }
}
