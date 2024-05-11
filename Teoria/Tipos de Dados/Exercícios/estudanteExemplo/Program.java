package estudanteExemplo;

public class Program {

  public static void main(String[] args) {
    Estudante estudante = new Estudante("123456789-0", "John Doe");
    estudante.AtualizarN1(5.0f);
    estudante.AtualizarN2(7.5f);
    estudante.AtualizarSub(2.5f);
    estudante.AtualizarPF(7.8f);
    System.out.println(estudante);
    }
    
  
}
