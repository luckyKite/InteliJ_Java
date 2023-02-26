package ch11.ex6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1Demo {
  public static void main(String[] args) {
    //팩토리 메서드 - 객체가 수정 불가(immutable 객체)
    Map<String, String> m1 = Map.of("호랑이","tiger","사자","lion","표범","leopard");

    //수정 가능한 Map양식에 m1을 넣는다.
    Map<String, String> m2 = new HashMap<>(m1);

    System.out.println(m2);
    m2.put("사자", m1.get("사자").toUpperCase());
    System.out.println(m2);

    System.out.println("------------------");

    //수정 가능한 Map
    Map<String, String> m3 = new HashMap<>();

    m3.put("호랑이", "tiger");
    m3.put("사자", "lion");
    m3.put("표범", "leopard");

    System.out.println("변경 전 = "+m3);

    Set<String> strings = m3.keySet(); // {호랑이, 사자, 표범}
    for(String s : strings) {
      String animal = m3.get(s).toUpperCase();
      System.out.println("s, animal = " + s + ", " + animal);
      m3.put(s, animal);
    }
    System.out.println("변경 후 = "+m3);

  }
}
