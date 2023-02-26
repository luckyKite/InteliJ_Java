package ch10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaTest {
  public static void main(String[] args) {
//    MyF myF = new MyF() {
//      @Override
//      public int max(int a, int b) {
//        return a > b? a : b;
//      }
//    };
//    myF.max(1, 2);

    //위에 쓴 것을 람다식으로 다시 나타내면 아래와 같이 정리된다.
    MyF f = (a, b) -> a > b? a : b;
    System.out.println(f.max(1, 2)); //람다식(익명객체)이 호출됨.

    //Comparable ==> this.compareTo(o);
    //Comparator ==> int compare(Object o1, Object o2);

    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
    Collections.sort(list, new Comparator<>() {
      @Override
      public int compare(String o1, String o2) {
        //o1<02 -> 내림차순, o1>02 -> 오름차순
        //return 0;
        return o1.compareTo(o2);
      }
    });
    System.out.println("정렬후 : "+list);
  }
}

interface MyF {
  int max(int a, int b);
}