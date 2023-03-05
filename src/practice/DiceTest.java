package practice;

class Dice {
  private int face;

  //응용해서 씀
  public Dice(int face) {
    this.face = face;
  }

  //기본
//  public int roll() {
//    face = (int)(Math.random() * 6) + 1;
//    return face;
//  }

  //응용
  public int roll() {
    face = (int)(Math.random() * face) +1;
    return face;
  }
}
public class DiceTest {
  public static void main(String[] args) {
//    //기본
//    Dice dice = new Dice();
//    for(int i = 0; i < 6; i++) {
//      System.out.println("주사위의 숫자 : " + dice.roll());
//    }

    //응용
    Dice dice = new Dice(20);
    for(int i = 0; i < 6; i++) {
      System.out.println("주사위의 숫자 : " + dice.roll());
    }
  }
}
