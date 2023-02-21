package ch07.controllable;

public class TV implements Controllable {
  @Override
  public void turnOff() {
    System.out.println("TV 전원을 끈다.");
  }

  @Override
  public void turnOn() {
    System.out.println("TV 전원을 켠다.");
  }

  @Override
  public void repair() {
    System.out.println("TV를 수리한다.");
  }
}
