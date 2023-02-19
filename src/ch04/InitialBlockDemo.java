package ch04;

class Test {
  int anyValue;
  {
    int sum = 0;
    for(int i=0; i<=5; i++) {
      sum += i;
    }
    anyValue = sum;
  }
}

public class InitialBlockDemo {
  static int sumOneToTen;
  static {
    int sum =0;
    for(int i=0; i<=10; i++) {
      sum += i;
    }
    sumOneToTen = sum;
  }

  public static void main(String[] args) {
    System.out.println(sumOneToTen);
    Test t = new Test();
    System.out.println(t.anyValue);
  }
}
