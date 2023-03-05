package practice.ch6;

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String show() {
    //System.out.println("사람 [이름 : " + name + ", 나이 : " + age + "]"); -> public void show()로 하면 됨!
    return "사람 [이름 : " + name + ", 나이 : " + age + "]";
  }
}

class Student extends Person {
  int studentNumber;

  public Student(String name, int age, int studentNumber) {
    super(name, age);
    this.studentNumber = studentNumber;
  }

  public int getStudentNumber() {
    return studentNumber;
  }

  public String show() {
    //System.out.println("학생 [이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentNumber + "]"); -> public void show()로 하면 됨!
    return "학생 [이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentNumber + "]";
  }
}

class ForeignStudent extends Student {
  String country;

  public ForeignStudent(String name, int age, int studentNumber, String country) {
    super(name, age, studentNumber);
    this.country = country;
  }

  public String getCountry() {
    return country;
  }

  public String show() {
    //System.out.println("국가 [이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentNumber + ", 국가 : " + country + "]"); -> public void show()로 하면 됨!
    return "국가 [이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentNumber + ", 국가 : " + country + "]";
  }
}

public class PersonTest {
  public static void main(String[] args) {
//    Person p1 = new Person("길동이", 20);
//    p1.show(); //public void show()로 했을 때는 show()만 찍어주면 된다.
//
//    Student s1 = new Student("황진이", 23, 100);
//    s1.show(); //public void show()로 했을 때는 show()만 찍어주면 된다.
//
//    ForeignStudent f1 = new ForeignStudent("Amy", 25, 200, "USA");
//    f1.show(); //public void show()로 했을 때는 show()만 찍어주면 된다.

    Person[] persons = {
        new Person("길동이", 20),
        new Student("황진이", 23, 100),
        new ForeignStudent("Amy", 25, 200, "USA")
    };

    for (Person p : persons) {
      System.out.println(p.show());
    }
  }
}
