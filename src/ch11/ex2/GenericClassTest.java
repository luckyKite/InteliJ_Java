package ch11.ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person p = (Person) obj;
      if(name.equals(p.name) && age == p.age)
        return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.";
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
    //return name.hashCode() + age; //123 +35, 123 + 35 -> 같은 값이면 한번만 나온다.
  }
}

public class GenericClassTest {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<Person>();

    set.add(new Person("홍길동",22));
    set.add(new Person("유재석",40));
    set.add(new Person("박명수",27));
    set.add(new Person("강호동",30));
    set.add(new Person("유재석",40));
    set.add(new Person("유재석",26));

    for(Person p : set) {
      System.out.println("person : " + p);
    }

    System.out.println("-----------------------");

    Iterator<Person> it = set.iterator();
    while(it.hasNext()) {
      Person p = it.next();
      System.out.println("person : " + p);
    }

  }
}
