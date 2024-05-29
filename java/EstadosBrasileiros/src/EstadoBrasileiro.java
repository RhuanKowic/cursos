public enum EstadoBrasileiro {
  SAO_PAULO("SP", "SAO PAULO"),
  MINAS_GERAIS("MG","MINAS GERAIS"),
  MARANHAO("MA","MARANHAO");
  private String sigla;
  private String nome;

  EstadoBrasileiro(String sigla, String nome) {
    this.sigla = sigla;
    this.nome = nome;
  }

  public String getSigla() {
    return sigla;
  }

  public String getNome() {
    return nome;
  }
}
