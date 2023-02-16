package ch02;

public class NumberTypeDemo {
  public static void main(String[] args) {
    int mach; //선언
    mach = 340; //초기화
    int distance = mach * 60 *60;
    System.out.println("소리가 1시간 동안 가는 거리 "+ distance + "m");

    double radius = 10.0;
    double area = radius * radius * 3.14;
    System.out.println("반지름이 " + radius + "인 원의 넓이는 " + area + "입니다.");
  }
}
