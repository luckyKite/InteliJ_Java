package practice.ch6;

class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public void show() {
    System.out.printf("반지름이 %d인 원이다. \n", radius);
  }
}

class ColoredCircle extends Circle{
  String color;

  public ColoredCircle(int radius, String color) {
    super(radius);
    this.color = color;
  }

  @Override
  public void show() {
    System.out.printf("반지름이 %d인 %s 원이다. \n", radius, color);
  }
}

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(10);
    ColoredCircle c2 = new ColoredCircle(5,"파란색");

    c1.show();
    c2.show();
  }
}
