package ch07.movable;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car();
    m.move(1);
    m.move(5);
    //m.show() //불가능! Movable에는 show()가 없다!

    Car c = (Car) m;
    c.move(5);
    c.show();

  }
}
