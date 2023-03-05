package practice.ch6;

class Vehicle {
  String color;
  int speed;

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  void show() {
    System.out.println("자동차의 색상은 " + color + "이고, 속도는 " + speed + "km/h입니다.");
  }
}

class Car extends Vehicle {
  int displacement;
  int gear;

  public Car(String color, int speed, int displacement, int gear) {
    super(color, speed);
    this.displacement = displacement;
    this.gear = gear;
  }

  @Override
  void show() {
    super.show();
    System.out.println("자동차의 배기량은 " + displacement + "이고, 기어는 " + gear + "단 입니다.");
  }
}

public class OverrideTest {
  public static void main(String[] args) {
    Car car = new Car("black", 100, 10, 4);
    car.show();

    System.out.println();

    Vehicle vehicle = car;
    vehicle.show();
  }
}
