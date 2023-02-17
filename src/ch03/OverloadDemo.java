package ch03;

public class OverloadDemo {
  public static void main(String[] args) {
    int i1=3, i2=5, i3=7;
    double d1=10.0, d2=5.0;

    System.out.println(max(i1,i2));
    System.out.println(max(d1,d2));
    System.out.println(max(i1,i2,i3));
  }

  public static int max(int i, int j) {
    int result = (i>j)? i : j;
    return result;
  }

  public static double max(double d1, double d2) {
    double result = (d1>d2)? d1 : d2;
    return result;
  }

  public static int max(int i, int j, int k) {
    return max(max(i, j), k);
  }
}
