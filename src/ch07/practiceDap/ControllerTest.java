package ch07.practiceDap;

class Radio extends Controller {
  public Radio(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "Radio";
  }
}

class TV extends Controller {

  public TV(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "TV";
  }
}


public class ControllerTest {
  public static void main(String[] args) {
    Controller[] controllers = { new TV(false), new Radio(true) };

    for(Controller controller : controllers)
      controller.show();
  }
}
