package ch09;

public class Unchecked2Demo {
  public static void main(String[] args) {
    int[] arr = new int[] {1,2,3};
    int[] arr2 = null;

    try {
      System.out.println(arr[5]);
      System.out.println(arr2.length);
    } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
      System.out.println(e.getMessage());
    } catch (Exception e1) {
      System.out.println(e1.getMessage());
    } finally {
      System.out.println("try-catch 종료!");
    }
  }
}
