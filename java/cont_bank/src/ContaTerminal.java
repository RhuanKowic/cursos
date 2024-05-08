import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    /*
     Conhecer e importar a classe Scanner
     Exibir as mensagens para o nosso usuário
     Obter pela classe scanner os valores digitados no terminal
     Exibir a mensagem conta criada
    */
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, digite o número da Conta !");
    int number = sc.nextInt();
    System.out.println("Por favor, digite o número da Agência !");
    String agency = sc.next();
    System.out.println("Por favor, digite o nome do cliente !");
    String nameClient = sc.next();
    System.out.println("Por favor, digite o saldo !");
    double balance = sc.nextDouble();
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nameClient, agency, number, balance);
    sc.close();

  }
}