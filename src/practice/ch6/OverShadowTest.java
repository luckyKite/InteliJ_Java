package practice.ch6;

class Parent {
  String name = "영조";

  void print() {
    System.out.println(name);
  }

  void callSon() {
    System.out.println("아들아!!!");
  }
}

class Child extends Parent {
  String name = "사도세자";

  @Override
  void print() {
    System.out.println("나는 "+name+"이다.");
  }

  void callDaddy() {
    System.out.println("아버지~~~~");
  }
}

public class OverShadowTest {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name); //필드는 오버라이딩 못함
    p.callSon(); //메서드는 오버라이딩 가능
    p.print();
    System.out.println("--------------");

    Child c = new Child();
    System.out.println(c.name);
    c.callDaddy();
    c.callSon();
    c.print();
  }
}

//출력결과
//영조 (필드는 부모로부터 상속 받아서 오버라이드 할 수 없다.)
//나는 사도세자이다. (메서드는 부모로부터 상속받은 후 자식이 오버라이딩 해서 사용 가능, 인스턴스 변수인 name=사도세자를 가져와서 출력)