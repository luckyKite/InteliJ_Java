package ch11;

import java.util.*;

public class ArraysListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    List<Integer> l = new ArrayList<>();
    List<String> l2 = new LinkedList<>();
    Collection<Integer> l3 = new ArrayList<>();

    l3.add(1);
    l3.add(2);
    l3.add(3);
    l3.add(4);

    //l3.remove(1);


    Iterator<Integer> iterator = l3.iterator(); //Ctrl + Alt + V
    while (iterator.hasNext()) {
      System.out.println("iterator.next() = "+iterator.next()); //sout + V
    }

    //System.out.println("iterator.next() = "+iterator.next()); //일회용이므로 다시 돌리기 불가!
    System.out.println("-------------------------");

    iterator = l3.iterator();
    while (iterator.hasNext()) {
      System.out.println("iterator.next() = "+iterator.next()); //sout + V
    }

    System.out.println("-------------------------");

    l2.add("aaa");
    l2.add("bbb");
    l2.add("ddd");
    l2.add(2,"ccc");

    Iterator<String> iterator2 = l2.iterator();
    while (iterator2.hasNext()) {
      System.out.println("iterator2.next() = "+iterator2.next()); //sout + V
    }

    System.out.println("-------------------------");

    a.add(1);
    a.add(2);
    a.add(4);
    a.add(2,3);

    Iterator<Integer> iterator1 = a.iterator();
    while (iterator1.hasNext()) {
      System.out.println("iterator1.next() = "+iterator1.next()); //sout + V
    }
  }
}
