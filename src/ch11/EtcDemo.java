package ch11;

import java.util.*;

public class EtcDemo {
  public static void main(String[] args) {
    List<String> list1 = List.of("a", "b", "c", "a", "e", "e", "a", "b");
    HashMap<String, Integer> m = new HashMap<>();
    m.put("a", 1);
    m.put("b", 2);

    System.out.println(list1);

    HashSet<String> hs = new HashSet<>(list1);
    System.out.println(list1);

    ArrayList<String> al = new ArrayList<>(list1);
    System.out.println("al = " + al);

    Collections.sort(al);
    System.out.println("al = " + al);


  }
}
