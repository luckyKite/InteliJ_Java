package practice;

class Golf {

  private int number;
  private String kind;

  public Golf() {
    this.number = 7;
  }

  public Golf(int number) {
    this.number = number;
  }

  public Golf(String kind) {
    this.kind = kind;
  }

  void print() {
    if(number>0)
      System.out.printf("%d번 아이언 입니다. \n", number);
    else
      System.out.println(kind + "입니다.");
  }
}

public class GolfClubTest {
  public static void main(String[] args) {
    Golf g1 = new Golf();
    g1.print();

    Golf g2 = new Golf(5);
    g2.print();

    Golf g3 = new Golf("퍼터");
    g3.print();
  }
}
