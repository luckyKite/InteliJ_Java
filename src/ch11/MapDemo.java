package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> m = Map.of("바나나", 1, "포도",10,"사과",10);
    Map<String, Integer> m2 = new HashMap<>();

    m2.put("바나나", 1);
    m2.put("포도", 10);
    m2.put("사과", 10);

    System.out.println(m2.size());
    System.out.println(m2);

//    Set<String> keys = m2.keySet(); //중복을 허용하지 않는다.
//    Collection<Integer> values = m2.values(); //중복을 허용한다.
//
//    m2.put("사과", 5);
//    System.out.println("m2.get = " + m2.get("사과"));

    m2.put("사과", m2.get("사과")); //코드확인해봐야함!!!!
    System.out.println("m2 = " + m2);

    System.out.println("------------------");
    System.out.println(m.size());
    System.out.println(m); //Map은 순서상관없이 찍힌다.


//    System.out.println("------------------");
//    Set<String> keys = m.keySet(); //중복을 허용하지 않는다.
//    Collection<Integer> values = m.values(); //중복을 허용한다.
//
//    m.put("귤", 5);
//    System.out.println("m = " + m);


  }
}
