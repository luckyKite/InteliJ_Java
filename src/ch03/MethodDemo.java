package ch03;

public class MethodDemo {
  public static void main(String[] args) {
    System.out.printf("합(1~10)은 %d \n", sum(1,10));
    System.out.printf("합(10~100)은 %d \n", sum(10,100));
    System.out.printf("합(100~1000)은 %d \n", sum(100,1000));
  }

  public static int sum(int i1, int i2) {
    int sum=0;
    for(int i=i1; i<=i2; i++) {
      sum += i;
    }
    return sum;
  }

}

