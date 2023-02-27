package anno;

public class Service {

  @PrintAnnotation
  public void method1() {
    System.out.println("1번 메서드 = default 값 적용");
  }

  @PrintAnnotation("*")
  public void method2() {
    System.out.println("2번 메서드 = * , 15 적용");
  }

  @PrintAnnotation(value = "#", number = 20)
  public void method3() {
    System.out.println("3번 메서드 = #, 20 적용");
  }
}
