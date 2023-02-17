package ch03;

import java.util.Scanner;

public class IfDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("숫자(정수)를 입력하세요.");
    int i = in.nextInt();
    if(i%2 == 0) {
      System.out.println("짝수입니다.");
    } else {
      System.out.println("홀수입니다.");
    }
    System.out.println("프로그램 종료!");
  }
}
