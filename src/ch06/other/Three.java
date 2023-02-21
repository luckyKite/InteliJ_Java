package ch06.other;

import ch06.One;

public class Three { //다른 패키지이고 상속 관계가 아니므로 사용 불가!
  void print() {
    One o = new One();
    //System.out.println(o.secret);
    //System.out.println(o.roommate);
    //System.out.println(o.child);
    System.out.println(o.anybody);
  }
}
