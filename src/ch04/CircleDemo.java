package ch04;

class Circle {
  private double radius;

  public Circle() {}

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  double findArea() {
    return  3.14 * radius * radius; //여기서 radius는 class Circle 바로 아래에 정의된 radius이다.
  }
}

public class CircleDemo {
  public static void main(String[] args) {
    Circle circle = new Circle(10);
    System.out.println("원의 반지름 : " + circle.getRadius());
    circle.setRadius(20.0);
    System.out.println("원의 반지름2 : " + circle.getRadius());
    System.out.println("원의 넓이 : " + circle.findArea());
  }
}
