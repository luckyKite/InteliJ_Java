package practice;

import java.util.Objects;

class Line {
  //심화
  //색깔, 두께, 길이 속성을 가진 직선을 모델링하고 equals와 hascode를 오버라이드 해서
  //같은 라인인지 비교하는 프로그램으로 변경

  //기본 : 라인의 길이만 속성으로 가진 경우, isSameLine으로 같은지 비교
  private int length;

  //심화일때 아래 두개 추가
  private int weight;
  private String color;

  //기본 생성자
  public Line(int length) {
    this.length = length;
  }

  //심화 생성자
  public Line(int length, int weight, String color) {
    this.length = length;
    this.weight = weight;
    this.color = color;
  }

  //기본일때 라인비교
  public boolean isSameLine(Line line) {
    if(this.length == line.length) {
      return true;
    }
    return false;
  }

  //심화일때 비교
  @Override
  public int hashCode() {
    return Objects.hash(length, weight, color);
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Line) {
      Line l = (Line) obj;
      if(color.equals(l.color) && weight == l.weight && length == l.length)
        return true;
    }
    return false;
  }

}


public class LineTest {
  public static void main(String[] args) {
    //기본
    Line l1 = new Line(10);
    Line l2 = new Line(10);
    System.out.println(l1.isSameLine(l2));
    System.out.println(l1 == l2);

    System.out.println("----------");

    //심화
    Line l3 = new Line(10, 20, "red");
    Line l4 = new Line(10, 20, "red");
    System.out.println(l3.equals(l4));

  }
}
