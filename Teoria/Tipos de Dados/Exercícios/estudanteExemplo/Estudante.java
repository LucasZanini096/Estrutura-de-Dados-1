package estudanteExemplo;

public class Estudante {

private String matricula;
private String nome;
public float  n1;
public float  n2;
public float  sub;
public float  pf;


// Outros atributos aqui.
Estudante() { this("?", ""); }

Estudante(String matricula, String nome) {
this.matricula = matricula;
this.nome = nome;
n1 = 0.0f;
n2 = 0.0f;
sub = 0.0f;
pf = 0.0f;
}
void AtualizarN1(float nota) { n1 = nota; }
void AtualizarN2(float nota) { n2 = nota; }

void AtualizarSub(float nota) { sub = nota; }
void AtualizarPF(float nota) { pf = nota; }
public String getMatricula() {
return matricula;
}
public void setMatricula(String matricula) {
this.matricula = matricula;
}

@Override
public String toString() {
return matricula+ "; " + nome + "; " + n1 +
"; " + n2 + "; " + sub + "; " + pf;
}
}
