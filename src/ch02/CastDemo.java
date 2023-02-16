package ch02;

public class CastDemo {
  public static void main(String[] args) {
    int i;
    double d;
    byte b;

    i = 7/4; //1
    System.out.println(i);

    d= 7/4; //1.0
    System.out.println(d);

    d =(double)7/4; // 7.0/4.0 = 1.75
    //i = 7/(double)4;
    System.out.println(d);

    i = 100;
    if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
      System.out.println("byte타입으로 변환할 수 없습니다.");
    } else {
      b = (byte) i;
      System.out.println(b);
    }
  }
}
