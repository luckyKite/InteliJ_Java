package ch07.fly;

public class Anonyous1Demo {

  Bird b = new Bird() {

    public void move() {
      System.out.println("독수리가 슝 날아간다.");
    }

    public void sound() {
      System.out.println("독수리가 휘잉 소리를 낸다.");
    }
  };

  public static void main(String[] args) {
    Anonyous1Demo a = new Anonyous1Demo();
    a.b.move();
    //a.b.sound() //원래 bird에는 sound() 매서드가 없기 때문에 사용할 수 없다.
  }
}
