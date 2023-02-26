package ch11.ex5;

import java.util.*;

public class ScoresTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<Integer> scores = new ArrayList<>();

    int high = 0;
    char grade;
    int score;

    System.out.println("점수를 입력하세요. 더 이상 입력하지 않으려면 -1을 입력하세요.");

    while((score = in.nextInt()) > 0) {
      scores.add(score);
    }

    System.out.println(scores.size()+ "명입니다.");
    System.out.println("scores = " + scores);

    high = Collections.max(scores);
    System.out.println("high = " + high);

    for(int s : scores) {
      if(s >= 90) {
        grade = 'A';
      } else if(s >= 80) {
        grade = 'B';
      } else {
        grade = 'F';
      }
      System.out.println("점수가 "+s+"인 학생의 등급은 "+grade+"입니다.");
    }

  }
}
