package ch06;

class PersonEx {
  void name() { }
  protected void number() { }
  void weight() { }
  static void show() { }
  private void secret() { }
}

public class Ex06 extends PersonEx {
  @Override
  public  void name() { }

  //void number() { }

  //static void weight() { }

  static void show() { }
  private void secret() { }

}
