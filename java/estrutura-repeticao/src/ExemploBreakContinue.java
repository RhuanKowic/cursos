public class ExemploBreakContinue {
  public static void main(String[] args) {
    for (int n = 1; n <= 10; n++){
      if (n == 3){
        continue;
      }
      if (n == 8){
        continue;
      }
      System.out.println(n);

    }
  }
}
