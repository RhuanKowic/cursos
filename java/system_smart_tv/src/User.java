public class User {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();
    System.out.println(smartTv.smartTvOn);
    smartTv.turn();
    System.out.println(smartTv.smartTvOn);
    smartTv.upperChannel();
    smartTv.upperSound();
    smartTv.lowerChannel();
    smartTv.lowerSound();
    smartTv.changeChannel(200);
    smartTv.turnOff();
    System.out.println(smartTv.smartTvOn);
  }
}