package ch07.practiceMe;

public class ControllerTest {
  public static void main(String[] args) {
    Controller[] controllers = { new TV(false), new Radio(true) };

    for(Controller c : controllers)
      c.show();
  }
}
