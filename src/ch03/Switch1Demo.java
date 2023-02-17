package ch03;

public class Switch1Demo {
  public static void main(String[] args) {
    int number = 2;
    float f = 0.1f;

    switch (number) {
      case 3:
        System.out.println("*");
        break;
      case 2:
        System.out.println("-");
        break;
      case 1:
        System.out.println("#");
        break;
    }
  }
}
