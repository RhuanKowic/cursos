public class Aluno {
  private String nome;
  private int age;

  public Aluno(String nome, int age) {
    this.nome = nome;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
