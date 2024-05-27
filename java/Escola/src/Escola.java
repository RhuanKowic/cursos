public class Escola {
  public static void main(String[] args) {
    Aluno Felipe = new Aluno();
    Felipe.setAge(12);
    Felipe.setNome("Felipe");

    System.out.println("O aluno " + Felipe.getNome() + " tem " + Felipe.getAge() + " anos.");
  }
}