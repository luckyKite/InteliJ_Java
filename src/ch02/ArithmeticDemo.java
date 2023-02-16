package ch02;

public class ArithmeticDemo {
  public static void main(String[] args) {
    int a = 3%2;
    int b = 4%2;
    System.out.printf("홀수의 나머지는 %a 이고, 짝수의 나머지는 %b 입니다.", a, b);
    //Exception in thread "main" java.util.IllegalFormatConversionException: a != java.lang.Integer~~

    int c = 4/0;
    System.out.println(c);
    //Exception in thread "main" java.lang.ArithmeticException: / by zero at ch02.ArithmeticDemo.main(ArithmeticDemo.java:9)

  }
}
