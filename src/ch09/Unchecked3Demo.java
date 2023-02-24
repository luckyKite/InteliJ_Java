package ch09;

public class Unchecked3Demo {
  public static void main(String[] args) {
    //String s = null;
    String s = ""; //이렇게 하면 NullPointerException 오류는 안난다.

    System.out.println(s.length());
  }
}
