package ch09;

class Ticket implements Comparable {
  String name;
  int price;

  public Ticket(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public int compareTo(Object o) {
    if(o instanceof Ticket) {
      Ticket t = (Ticket) o;
      int res = (price < t.price)? -1 : ((price > t.price) ? 1 : 0);
      return res;
  }
    return 999;
  }
}


public class GenericMethodTest {
  public static void main(String[] args) {
    Ticket t = new Ticket("뮤지컬",90000);
    Ticket t2 = new Ticket("농구",150000);
    Object o = new Object();

    int res = t.compareTo(t2);

    if(res == -999) {
      System.out.println("비교불가!");
      return;
    }

    if(res > 0) {
      System.out.println(t.name + "티켓이 더 비쌉니다.");
    } else if (res < 0) {
      System.out.println(t.name + "티켓이 더 쌉니다.");
    } else {
      System.out.println("두 개의 티켓 가격이 동일합니다.");
    }

  }
}
