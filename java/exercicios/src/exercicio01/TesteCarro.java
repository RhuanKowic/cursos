package exercicio01;

class TestaCarro {
  public static void main(String[] args) {
    Carro meuCarro;
    meuCarro = new Carro();
    meuCarro.cor = "Verde";
    meuCarro.modelo = "Fusca";
    meuCarro.velocidadeAtual = 0;
    meuCarro.velocidadeMaxima = 80;

    Motor motor1 = new Motor();
    motor1.potencia = 46;
    motor1.tipo = "Boxer";
    meuCarro.motor = motor1;

    Motor motor2 = new Motor();
    motor2.potencia = 500;
    motor2.tipo = "V8";
    meuCarro.motor = motor2;

    // imprime dados do carro
    System.out.println("\n... Carro fabricado ...");
    System.out.println("Cor do carro: " + meuCarro.cor);
    System.out.println("Modelo: " + meuCarro.modelo);
    System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
    System.out.println("Velocidade máxima: " + meuCarro.velocidadeMaxima);
    System.out.println("Potência do motor: " + meuCarro.motor.potencia);
    System.out.println("Tipo do motor: " + meuCarro.motor.tipo);

    // liga o carro
    System.out.println("\n... Ligando carro ...");
    meuCarro.liga();
    System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
    System.out.println("Marcha atual: " + meuCarro.pegaMarcha());


    // acelera o carroSystem.out.println("\n... Acelerando carro ...");
    meuCarro.acelera(20);
    System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
    System.out.println("Marcha atual: " + meuCarro.pegaMarcha());


    // acelera o carro
    System.out.println("\n... Acelerando carro ...");
    meuCarro.acelera(25);
    System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
    System.out.println("Marcha atual: " + meuCarro.pegaMarcha());

    // acelera o carro
    System.out.println("\n... Acelerando carro ...");
    meuCarro.acelera(30);
    System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
    System.out.println("Marcha atual: " + meuCarro.pegaMarcha());  }
}