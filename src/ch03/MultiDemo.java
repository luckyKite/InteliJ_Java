package ch03;

import java.util.Scanner;

public class MultiDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("성적을 입력하세요 : ");

    int score = in.nextInt();
    char grade;
    if(score >= 90) {
      grade='A';
    } else if (score >= 80) {
      grade='B';
    } else if (score >= 70) {
      grade='C';
    } else  {
      grade='F';
    }
    System.out.println("당신의 학점은 " +grade+ "입니다.");
  }
}
