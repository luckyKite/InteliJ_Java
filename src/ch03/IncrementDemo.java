package ch03;

public class IncrementDemo {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("호출하기 전 : "+x);
    increment(x); //value=0만 던져준다.
    System.out.println("호출 후 : "+x);
  }

  public static void increment(int n) {
    System.out.println("매서드 시작 -> "+n);
    n++;
    System.out.println("메서드 종료 -> "+n);
  }

}

