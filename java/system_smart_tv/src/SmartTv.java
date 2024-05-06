public class SmartTv {
  boolean smartTvOn = false;
  int channel = 1;
  int sound = 25;

  public void turn(){
    smartTvOn = true;
  }

  public  void turnOff(){
    smartTvOn = false;
  }

  public  void upperSound(){
    sound++;
    printSound();
  }

  public void lowerSound(){
    sound--;
    printSound();
  }
  public void  lowerChannel(){
    channel--;
    printChannel();
  }
  public void upperChannel(){
    channel++;
    printChannel();
  }
  public void changeChannel(int num){
    channel = num;
    printChannel();
  }
  public void printChannel(){
    System.out.println("O canal atual é: " + channel);
  }
  public void printSound(){
    System.out.println("O volume atual é: " + sound);
  }

}
