package practice;

class Car {
  private String color;

  public String getColor() {
    return color;
  }

  private static int numberOfCar = 0;

  private static int numberOfRedCar = 0;

  public static int getNumberOfCar() {
    return numberOfCar;
  }

  public static int getNumberOfRedCar() {
    return numberOfRedCar;
  }


  //생성자에서 객체가 생성될 때마다 자동차의 대수와 빨간 자동차의 대수를 각각 카운트 해줘야 한다.
  //단, red 뿐 아니라 Red, reD, RED, ReD, rED, red도 빨간 자동차이다.
  public Car(String color) {
    this.color = color;
    numberOfCar++;

//    if(color.compareToIgnoreCase("red")) 이렇게 써도 되고,
//    if(color.toLowerCase().equals("red")) 소문자로 바꿔서 써도 되고,

    if(color.toUpperCase().equals("RED")) { //대문자로 바꿨을 때 "RED" 로 해도 된다!
      Car.numberOfRedCar++;
    }
  }

}

public class CarTest {
  public static void main(String[] args) {
    Car car1 = new Car("red");
    Car car2 = new Car("blue");
    Car car3 = new Car("Red");
    Car car4 = new Car("ReD");
    Car car5 = new Car("green");

    System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",
                        Car.getNumberOfCar(), Car.getNumberOfRedCar());
  }
}
