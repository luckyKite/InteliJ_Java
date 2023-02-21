package ch07.practiceMe;

public class Radio implements Controller {
  
  boolean power;
  
  String name = "라디오";

  public Radio(boolean power) {
    this.power = power;
  }

  @Override
  public void show() {
    if(power)
      System.out.println(getName()+"가 켜졌습니다.");
    else
      System.out.println(getName()+"가 꺼졌습니다.");
  }

  @Override
  public String getName() {
    return name;
  }
}
