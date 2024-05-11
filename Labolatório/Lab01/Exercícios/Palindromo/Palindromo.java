//Lucas Zanini da Silva - 32322992
package Palindromo;

public class Palindromo {

  private String text;

  Palindromo(String inputString){
    text = inputString;
  }

  public String getText() {
    return text;
  }

  public void setText(String newString) {
    this.text = newString;
  }

  public boolean verificar(){

    char[] charArray = text.toCharArray();

    for(int i = 0, n = text.length() - 1; i < n; i++, n--){
      if(charArray[i] != charArray[n]) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    Palindromo newPalindromo = new Palindromo("");
    
    newPalindromo.text = "Isso não é um palíndromo";

    boolean result = newPalindromo.verificar();

    if(result) System.out.println("Isso é um palíndomo");
    System.out.println("Isso não é um palíndromo");
  }
}
