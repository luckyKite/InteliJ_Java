package ch06;

public class One1 extends One {

  void print() {
    System.out.println(roommate); //같은 패키지 안에 있고 One1이 One의 자식이므로 사용 가능
    System.out.println(child); //상속 받았으니까 다른 패키지에서도 자식이 접근 가능하다
    System.out.println(anybody); //public은 어디서나 사용가능
  }

  @Override
  public void show() {

  }

}
