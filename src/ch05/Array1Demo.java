package ch05;

import java.util.Scanner;

public class Array1Demo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("순서대로 5개의 숫자를 입력하세요.");

    int scores[] = new int [5];
    int sum = 0;

    for(int i=0; i<scores.length; i++)
      scores[i] = in.nextInt();


    for(int num : scores)
      sum += num;

    System.out.printf("평균 : %.2f", sum/(float)scores.length);

  }
}
