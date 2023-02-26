package ch11;

import java.util.Stack;

public class Stack2Demo {
  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();

    s1.push(10);
    s1.push(20);
    s1.push(30);

    while (!s1.isEmpty()) {
      System.out.println(s1.pop());
    }

    System.out.println("---------------");

    s1.push(40);
    s1.push(50);
    s1.push(60);

    for(Integer value : s1) {
      System.out.println("value = " + value);
    }

    System.out.println("---------------");

    //add는 쓸 수 있지만, 위쪽에 있는 배열에 더해지는 문제가 있다. -> 스택으로의 기능을 잃어버림!
    s1.add(70);
    s1.add(80);
    s1.add(1, 90);

    for(Integer value : s1) {
      System.out.println("value = " + value);
    }

    System.out.println("---------------");


  }
}
