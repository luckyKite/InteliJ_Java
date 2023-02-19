package ch04;

class Circle2 {
  int radius;
  static int numberOfCircles;

  public Circle2() { this(1); }

  public Circle2(int radius) {
    this.radius = radius;
    numberOfCircles++;
  }
}

public class Circle2Demo {
  public static void main(String[] args) {
    Circle2 c = new Circle2();

    System.out.println(Circle2.numberOfCircles); //1개
    System.out.println(c.numberOfCircles); //1개

    Circle2 c1 = new Circle2();
    System.out.println(Circle2.numberOfCircles); //2개
    System.out.println(c1.numberOfCircles); //2개
    System.out.println(c.numberOfCircles); //2개
  }
}
