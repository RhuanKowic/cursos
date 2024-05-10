import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
  public static void main(String[] args) {
    double mesada = 50;
    while ( mesada > 0){
      double valorDoce = valorAleatorio();

      System.out.println("Doce valor: "+ valorDoce + " adicionado no carrinho");
      mesada -= valorDoce;
    }
  }
  private  static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2, 8);
  }
}
