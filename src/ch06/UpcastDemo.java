package ch06;

public class UpcastDemo {
  public static void main(String[] args) {
    Person p;
    Student s = new Student();

    p = s;

    System.out.println(p.name);
    p.whoami();

  }
}
