package exercicio02;

public class Cliente {
  String nome;
  int anoNasc;
  String cpf;
  String telefone;

  void imprimeDados(){
    System.out.println("--- DADOS DO CLIENTE ---");
    System.out.println("Nome: " + nome);
    System.out.println("Ano de nascimento: " + anoNasc);
    System.out.println("CPF: " + cpf);
    System.out.println("Telefone: " + telefone);
  }
}
