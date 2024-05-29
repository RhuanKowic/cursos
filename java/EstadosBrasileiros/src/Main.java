public class Main {
  public static void main(String[] args) {
    for(EstadoBrasileiro e: EstadoBrasileiro.values()){
      System.out.println(e.getSigla() + " - " + e.getNome());
    }
    EstadoBrasileiro eb = EstadoBrasileiro.MINAS_GERAIS;
    System.out.println("Moro no estado de " + eb);
  }
}