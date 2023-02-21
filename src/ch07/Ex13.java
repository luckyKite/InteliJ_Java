package ch07;

public class Ex13 {
  public static void main(String[] args) {
    int x = 1, y=2;

    System.out.println(x++); //x=2
    System.out.println(++x + y--); //x=3, y=1
    System.out.println(++x / 3 + x * ++y);
  }
}
