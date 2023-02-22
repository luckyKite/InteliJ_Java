package ch08;

public class ObjectDemo {
  public static void main(String[] args) {
    Mouse m1 = new Mouse("logitech");
    Mouse m2 = new Mouse("logitech");

    Keyboard k1 = new Keyboard("logitech");
    Keyboard k2 = new Keyboard("logitech");

    String s1 = new String("logitech");
    String s2 = new String("logitech");

    System.out.println(m1 == m2);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m1.equals(m2));

    System.out.println("-------------------");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    System.out.println("-------------------");

    System.out.println(k1 == k2);
    System.out.println(k1);
    System.out.println(k2);
    System.out.println(k1.equals(k2));

    System.out.println("-------------------");

    System.out.println(m1.equals(k1));
  }
}
