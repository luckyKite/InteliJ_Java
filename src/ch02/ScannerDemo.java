package ch02;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("두 개의 정수 값을 입력하세요.");
    int x = in.nextInt();
    int y = in.nextInt();
    System.out.printf("%d * %d는 %d 입니다.", x, y, x*y);

//    System.out.println("두 개의 정수 값을 입력하세요.");
//    int a = Integer.parseInt(in.nextLine());
//    int b = Integer.parseInt(in.nextLine());
//    System.out.printf("%d * %d는 %d 입니다.", a, b, a*b);
  }
}
