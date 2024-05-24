package exercicio02;

public class Testa {
  public static void main(String[] args) {
    Cliente cli01 = new Cliente();
    cli01.nome = "João";
    cli01.anoNasc = 2010;
    cli01.cpf = "000.000.000.35";
    cli01.telefone = "(35) 99999-9999";

    Cliente cli02 = new Cliente();
    cli02.nome = "Maria";
    cli02.anoNasc = 1999;
    cli02.cpf = "000.000.000.34";
    cli02.telefone = "(35) 99999-6666";

    cli01.imprimeDados();
    cli02.imprimeDados();

    Ingresso ingresso01 = new Ingresso();
    ingresso01.nomeFilme = "Gato de botas 2";
    ingresso01.dataFilme = "24/05/2024";
    ingresso01.horario = "16:00";
    ingresso01.sala = 2;
    ingresso01.valor = 100;
    ingresso01.cliente = cli01;

    Ingresso ingresso02 = new Ingresso();
    ingresso02.nomeFilme = "Homem Aranha 3";
    ingresso02.dataFilme = "24/05/2024";
    ingresso02.horario = "19:00";
    ingresso02.sala = 2;
    ingresso02.valor = 50;
    ingresso02.cliente = cli01;

    ingresso01.calculaDescontoIdade(2024);
    ingresso02.calculaDescontoIdade(2024);

    ingresso01.imprimeIngresso();
    ingresso02.imprimeIngresso();
  }
}
