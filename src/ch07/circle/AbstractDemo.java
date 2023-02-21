package ch07.circle;

public class AbstractDemo {
  public static void main(String[] args) {
    Circle c = new Circle(1);
    c.draw();
    System.out.println("원의 넓이는 "+c.findArea());

    Rectangle r = new Rectangle(3,5);
    r.draw();
    System.out.println("사각형의 넓이는 "+r.findArea());

  }
}
