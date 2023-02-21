package ch06;

class SportCar extends Car {
  @Override
  void whoami() {
    System.out.println("나는 스포츠카입니다^^*");
  }
}

public class PloymorDemo {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = new Car();
    vehicles[1] = new SportCar();
    vehicles[2] = new Vehicle();

    for(Vehicle v: vehicles)
      v.whoami();

  }
}
