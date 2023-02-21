package ch07.circle;


public class Circle extends Shape {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  void draw() {
    System.out.println("원을 그리다.");
  }

  @Override
  public double findArea() {
    return pi*radius*radius;
  }
}
