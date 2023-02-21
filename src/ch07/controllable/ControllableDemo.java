package ch07.controllable;

public class ControllableDemo {
  public static void main(String[] args) {
    Controllable[] controllables = { new TV(), new Computer() };

    for(Controllable c : controllables) {
      c.turnOn();
      c.turnOff();
      c.repair();
    }

    Controllable.reset();
  }
}
