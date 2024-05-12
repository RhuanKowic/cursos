package Execoes;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite seu nome");
      String name = sc.next();
      System.out.println("Digite seu sobrenome");
      String lastName = sc.next();
      System.out.println("Digite sua idade");
      int age = sc.nextInt();
      sc.close();
    } catch (InputMismatchException e){
      System.out.println("Idade deve ser númerico.");
    }
  }
}
