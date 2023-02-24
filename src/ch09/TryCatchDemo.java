package ch09;

public class TryCatchDemo {
  public static void main(String[] args) {
    //System.out.println(args[0]);

    String s = null;
    System.out.println(args[0]); //edit configuration에서 받아옴 -> 123이라고 쓰면 123 나온다.

    try {
      int i = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
      System.out.println("정수로 변환할 수 없습니다.");
    }

  }
}
