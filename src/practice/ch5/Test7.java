package practice.ch5;

import java.util.Arrays;

public class Test7 {
  //배열을 비교하는 문제, 각 원소를 하나씩 비교하는 로직 힘들게 작성하지 않고
  //java API가 제공하는 메서드를 검색해서 찾아서 문제 해결

  public static void main(String[] args) {
    int[] a = {3, 2, 4, 1, 5};
    int[] b = {3, 2, 4, 1};
    int[] c = {3, 2, 4, 1, 5};
    int[] d = {2, 7, 1, 8, 2};

    System.out.println("a == b ? -> "+ Arrays.equals(a, b));
    System.out.println("c == d ? -> "+ Arrays.equals(c, d));
    System.out.println("a == c ? -> "+ Arrays.equals(a, c));
  }
}
