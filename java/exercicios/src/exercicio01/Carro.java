package exercicio01;

public class Carro {
  String cor;
  String modelo;
  double velocidadeAtual;
  double velocidadeMaxima;
  Motor motor;

  void liga(){
    System.out.println("Carro ligado");
  }
  void desliga(){
    System.out.println("Carro desligado");
  }

  void acelera(double quantidade){
    double velocidade = velocidadeAtual + quantidade;

    if (velocidade >= velocidadeMaxima)
      velocidadeAtual = velocidadeMaxima;
    else
      velocidadeAtual = velocidade;
  }

  int pegaMarcha(){
    if (velocidadeAtual <= 20)
      return 1;
    else if (velocidadeAtual > 20 && velocidadeAtual <= 40)
      return 2;
    else if (velocidadeAtual > 40 && velocidadeAtual <= 60)
      return 3;
    else return 4;
  }

}
