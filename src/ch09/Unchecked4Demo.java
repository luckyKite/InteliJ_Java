package ch09;

public class Unchecked4Demo {
  public static void main(String[] args) {
    //Object[] obj = null; //객체에서 NullPointerException 주의하자!

    /* NullPointerException 에러방지 */
    Object[] obj = new Object[0];
    Object[] obj2 = { };
    Object[] obj3 = null;

    try {
      //System.out.println(obj[0]); //NullPointerException
      //System.out.println(obj.length); //NullPointerException
      System.out.println(obj.length);
      System.out.println(obj2.length);
      System.out.println(5/0);
      //System.out.println(obj3.length); //NullPointerException
    } catch (NullPointerException | ArithmeticException e) {
      //System.out.println("Null 객체를 참조했거나 0으로 나눴습니다.");
      System.out.println(e.getMessage());
    } finally {
      System.out.println("종료!");
    }
    System.out.println("프로그램 끝~~");

  }
}
