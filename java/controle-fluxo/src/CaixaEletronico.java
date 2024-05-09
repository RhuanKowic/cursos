public class CaixaEletronico {
  public static void main(String[] args) {
    double balance = 25;
    double withdraw = 30;
    if (withdraw < balance){
      balance -= withdraw;
    }else {
      System.out.println("Saldo insuficiente");
    }
    System.out.println(balance);
  }
}
