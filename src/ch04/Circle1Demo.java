package ch04;

class Circle1 {
  private int radius;
  private String color;

  //public Circle1() { } //내가 안 만들면 컴파일러가 자동으로 생성해줌

  public Circle1() {
    this(1,"빨강"); //객체를 만드는 작업을 맨 먼저 해야한다.
  }

  public Circle1(int radius) {
    this("빨강");
    this.radius = radius;
    this.color = "빨강";
  }

  public Circle1(String color) {
    this.radius = 1;
    this.color = color;
  }

  public Circle1(int radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


}
public class Circle1Demo {
  public static void main(String[] args) {
    Circle1 c1 = new Circle1(5,"파랑");
    Circle1 c2 = new Circle1(10);
    Circle1 c3 = new Circle1("검정");
    Circle1 c4 = new Circle1();

    System.out.println("c1.color -> " + c1.getColor() + ", c1.radius -> " +c1.getRadius());
    System.out.println("c2.color -> " + c2.getColor() + ", c2.radius -> " +c2.getRadius());
    System.out.println("c3.color -> " + c3.getColor() + ", c3.radius -> " +c3.getRadius());
    System.out.println("c4.color -> " + c4.getColor() + ", c4.radius -> " +c4.getRadius());
  }
}
