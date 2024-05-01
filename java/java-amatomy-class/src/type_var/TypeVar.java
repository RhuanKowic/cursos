package type_var;

public class TypeVar {
  public static void main(String[] args) {
    double salaryMin = 1412.33;
    final short number = 32;
    int number2 = number;
    short number3 = (short) number2;
    System.out.printf("%s", number3);
  }
}
