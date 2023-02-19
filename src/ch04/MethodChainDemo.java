package ch04;

public class MethodChainDemo {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("민국").setAge(21).sayHello();

    Person p2 = new Person();
    p.setName("대한").setAge(21).sayHello();

  }
}

class Person {
  String name;
  int age;

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public void sayHello() {
    System.out.println(name + " : " + age);
  }
}
