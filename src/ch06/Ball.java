package ch06;

public class Ball extends Circle {
  private String color;

  public Ball(String color) {
    this.color = color;
  }

  @Override
  public void findArea() {
    System.out.println("넓이는 4*파이*반지름*반지름이다.");
  }

  public void findColor() {
    System.out.println(color+"색 공입니다.");
  }

  public void findVolume() {
    System.out.println("부피는 3/4*파이*반지름*반지름이다.");
  }
}
