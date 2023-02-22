package ch08;

public class ClassDemo {
  public static void main(String[] args) {
    Keyboard k = new Keyboard("logitech");

    Class c = k.getClass();
    System.out.println(c.getName()); //패키지이름.클래스이름
    System.out.println(c.getSimpleName()); //클래스이름
    System.out.println(c.getPackageName()); //패키지이름
  }
}
