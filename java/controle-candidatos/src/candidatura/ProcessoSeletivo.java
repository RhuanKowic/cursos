package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO", "AUGUSTO","MONICA"};
    for (String candidato : candidatos){
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato){
    int tentativadasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do {
      atendeu = atender();
      continuarTentando= !atendeu;
      if (continuarTentando) tentativadasRealizadas++;
      else System.out.println("Contato realizado com sucesso.");
    }while (continuarTentando && tentativadasRealizadas < 3);
    if (atendeu) System.out.println("Conseguimos contato com " + candidato + " na " + tentativadasRealizadas + "º tentativa.");
    else System.out.println("Não conseguimos contato com " + candidato);
  }

  static void selecaoCandidatos(){
    String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO", "AUGUSTO","MONICA"};
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000;
    while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
      String candidato = candidatos[candidatosAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " solicitou este valor de salário R$" + salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados++;
      }
      candidatosAtual++;

    }
  }

  static void imprimirSelecionados(){
    String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO", "AUGUSTO"};
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    for (int i = 0; i < candidatos.length; i++){
      System.out.println("O candidato de nº " + (i+1) + " é " + candidatos[i]);
    }
  }

  static boolean atender(){
    return new Random().nextInt(3)==1;
  }

  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
