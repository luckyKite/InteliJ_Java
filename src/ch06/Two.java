package ch06;

public class Two {
  public static void main(String[] args) {
    One o = new One();
    //System.out.println(o.secret); //private는 사용 못함
    System.out.println(o.roommate);
    System.out.println(o.child);
    System.out.println(o.anybody);
  }
}
