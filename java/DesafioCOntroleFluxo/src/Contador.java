import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int paramOne = sc.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int paramTwo = sc.nextInt();

    try {
      contar(paramOne, paramTwo);
    } catch (ParametrosInvalidosException e){
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
  }

  static void contar(int paramOne, int paramTwo) throws ParametrosInvalidosException{
    if (paramOne > paramTwo)
      throw new ParametrosInvalidosException();
    int contador = paramTwo - paramOne;
    for (int i = 1; i <= contador;i++){
      System.out.println(i);
    }
  }

}