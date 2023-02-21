package ch07.movable;

import ch07.movable.Movable;

public class Car implements Movable {

  private int pos = 0;

  @Override
  public void move(int x) {
    pos += x;
  }

  public void show() {
    System.out.println(pos + "만큼 자동차가 움직였다.");
  }
}
