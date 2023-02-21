package ch07.delicious;

public class DeliciousDemo implements Delicious {

  @Override
  public void eat() {
    System.out.println("먹는다!");
  }

  @Override
  public void sweet() {
    System.out.println("달다~~");
  }

  public static void main(String[] args) {
    DeliciousDemo d = new DeliciousDemo();
    d.eat();
    d.sweet();
  }
}
