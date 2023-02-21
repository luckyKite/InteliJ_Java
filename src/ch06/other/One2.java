package ch06.other;

import ch06.One;

public class One2 extends One {
  void print() {
    //System.out.println(secret); //private는 불가능
    //System.out.println(roommate); //다른 패키지에 존재하므로 사용 불가
    System.out.println(child); //다른 패키지이지만 상속관계에 있는 자식이므로 protected까지 사용 가능
    System.out.println(anybody);
  }
}
