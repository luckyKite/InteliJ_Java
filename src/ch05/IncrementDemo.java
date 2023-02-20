package ch05;

public class IncrementDemo {
  public static void main(String[] args) {
    int[] x = {10};
    System.out.println("호출하기 전 : "+ x[0]);
    increment(x);
    System.out.println("호출하고 난 후 : "+x[0]);

    int y = 10;
    System.out.println("호출 전 : "+y);
    increment(y);
    System.out.println("호출 후 : "+y);
  }
  
  public static void increment(int[] n) { //참조데이터(참조타입)을 매개변수로 넘김
    System.out.println("메서드(배열) 안에서 수정 전 : "+n[0]);
    n[0]+= 100;
    System.out.println("메서드(배열) 안에서 수정 후 : "+n[0]);
  }
  
  public static void increment(int n) { //기본타입을 매개변수로 넘김
    System.out.println("매서드 안에서 수정 전 y : "+n);
    n+= 100;
    System.out.println("매서드 안에서 수정 후 y : "+n);
  }
}
