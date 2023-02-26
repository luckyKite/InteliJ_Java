package ch11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    try {
      q.remove();
    } catch (Exception e) {
      e.getMessage();
    }

    q.add(1);
    q.add(2);
    q.add(3);

    System.out.println(q.size());


//    System.out.println(q.poll());
//    System.out.println(q.poll());
//    System.out.println(q.poll());
//    System.out.println(q.size());
//
//    System.out.println("-----------------------");
//
//    System.out.println(q.poll());
//    System.out.println(q.peek());
//
//    System.out.println("-----------------------");
//
//    try {
//      System.out.println(q.element());
//    } catch (NoSuchElementException e) {
//      e.getMessage();
//    }

    System.out.println("-----------------------");

    Iterator<Integer> iterator = q.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }




  }


}
