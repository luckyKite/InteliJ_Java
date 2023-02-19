package ch04;

public class LocalVariableDemo {
  public static void main(String[] args) {
    int a = 0;
    System.out.println(a);
    for(int i=0; i<5; i++) {
      System.out.println(a);
    }
  }
}
