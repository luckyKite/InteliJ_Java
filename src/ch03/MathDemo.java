package ch03;

public class MathDemo {
  public static void main(String[] args) {
    MyMath m = new MyMath();
    long result = MyMath.add(1L,2L);
    long res = m.sub(2L,1L);

    System.out.println(result);
    System.out.println(res);
  }
}

class MyMath {
  static long add(long a, long b) {
    return a+b;
  }

  long sub(long c, long d) {
    return c-d;
  }
}