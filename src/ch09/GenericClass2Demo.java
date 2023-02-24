package ch09;

import java.util.ArrayList;

public class GenericClass2Demo {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(35);
    list.add(70);

    //list.add("30"); -> Integer 타입 아니면 못담아!
    //list.add("abc"); -> Integer 타입 아니면 못담아!

    Integer i = list.get(0);
    int i1 = list.get(1);
    Integer i2 = (Integer) list.get(2);

    //System.out.println(i+i1+i2);
    System.out.println(list);

    ArrayList<String> slist = new ArrayList<>();
    slist.add("abc");
    slist.add("10"); //문자 타입의 10이다.

    String s = slist.get(0);
    System.out.println(s);

    System.out.println(slist);
  }
}
