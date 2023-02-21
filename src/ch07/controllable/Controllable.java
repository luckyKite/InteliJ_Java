package ch07.controllable;
/**
 * 전자제품을 수리하고 초기화 하는 기능이 구현되어 있습니다.
 * 전원을 켜고 끄는 메서드는 추상 클래스이므로 구현하셔야 합니다.
 * */
public interface Controllable {
  void turnOff();

  void turnOn();

  default void repair() {
    System.out.println("장비를 수리한다.");
  }

  static void reset() {
    System.out.println("장비를 초기화한다.");
  }
}
