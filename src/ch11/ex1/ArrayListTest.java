package ch11.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
  public static void main(String[] args) {
    //ArrayList - 검색이 빠름, update / LinkedList - 추가, 삭제
    List<String> l = new ArrayList<>();

    l.add("갈매기"); //ArrayList 라고 주게되면, LinkedList 다른 매서드로 변경해야 할 일이 있다면...
    l.add("나비");
    l.add("다람쥐");
    l.add("라마");

     System.out.println("l = "+ l);

    System.out.println();

    Iterator<String> iterator = l.iterator();
    while(iterator.hasNext()) {
      String s = iterator.next();
      if(s.length() == 2)
        System.out.println(s); //왜지???
    }
  }
}
