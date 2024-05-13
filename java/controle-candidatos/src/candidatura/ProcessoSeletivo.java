package candidatura;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    analisarCandidato(1900);
    analisarCandidato(2000);
    analisarCandidato(2200);
  }

  static void analisarCandidato(double salarioPrendido){
    double salarioBase = 2000;

    if (salarioBase > salarioPrendido) {
      System.out.println("LIGAR PARA O CANDIDATO");
    }
    else if (salarioBase == salarioPrendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    }
    else {
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
  }
}
