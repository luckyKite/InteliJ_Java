package practice;

class Triangle {
  //실수값의 밑변과 높이
  private double width, height;

  //생성자
  public Triangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  //private로 정의되어 있으므로 getter로 접근자를 생성함
  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  //넓이 구하기
  public double findArea() {
    return (width * height/2);
  }

  public boolean isSameArea(Triangle t) {
    if(this.findArea() == t.findArea()) {
      return true;
    }
    return false;
  }
}

public class TriangleTest {
  public static void main(String[] args) {
    //p.164 1번
    Triangle t = new Triangle(10.0, 5.0);
    System.out.println(t.findArea());

    //p.164 2번
    Triangle t1 = new Triangle(10.0, 5.0);
    Triangle t2 = new Triangle(5.0, 10.0);
    Triangle t3 = new Triangle(8.0, 8.0);

    System.out.println("t1 == t2 ? -> " + t1.isSameArea(t2));
    System.out.println("t1 == t3 ? -> " + t1.isSameArea(t3));

  }
}
