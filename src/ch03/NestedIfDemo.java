package ch03;

import java.util.Scanner;

public class NestedIfDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("성적을 입력하세요 -> ");

    int score = in.nextInt();
    String grade;
    if(score>=90) {
      if(score >=95) {
        grade="A+";
      } else {
        grade="A0";
      }
    } else if (score>=80) {
      grade="B";
    } else if (score>=70) {
      grade="C";
    } else {
      grade="F";
    }
    System.out.println("당신의 학점은 "+ grade+ "입니다!");
  }
}
