package ch08;

class Mouse {
  String name;

  public Mouse(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Mouse) {
      Mouse m = (Mouse) obj;
      if(name.equals(m.name))
        return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return name + "마우스입니다.";
  }
}


public class Keyboard {
  String name;

  public Keyboard(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Keyboard) {
      Keyboard k = (Keyboard) obj;
      if(name.equals(k.name))
        return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return name + "키보드 입니다.";
  }
}
