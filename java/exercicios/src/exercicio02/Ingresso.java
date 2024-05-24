package exercicio02;

public class Ingresso {
  String nomeFilme;
  String dataFilme;
  String horario;
  int sala;
  double valor;
  Cliente cliente;

  void calculaDescontoIdade(int anoAtual){
    int idade = anoAtual - cliente.anoNasc;

    if (idade >= 12 && idade <= 15) valor *= 0.60;
    else if (idade > 15 && idade <= 20) valor *= 0.7;
    else if (idade > 20) valor *= 0.8;
  }

  void imprimeIngresso(){
    System.out.println("--- INGRESSO ---");
    System.out.println("Filme: " + nomeFilme);
    System.out.println("Data: " + dataFilme);
    System.out.println("Horário: " + horario);
    System.out.println("Sala: " + sala);
    System.out.println("Cliente: " + cliente.nome);
    System.out.println("Nascimento: " +cliente.anoNasc);
    System.out.println("CPF: " + cliente.cpf);
    System.out.println("Telefone: " + cliente.telefone);
  }
}
