package practice;

class Member {
  private String name;
  private int age;
  private String userId;
  private String password;

  public Member() { }

  public Member(String name, int age, String userId, String password) {
    this.name = name;
    this.age = age;
    this.userId = userId;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Member [name=" + name + ", age=" + age + ", userId=" + userId + ", password=" + password + "]";
  }
}

public class MemberTest {
  public static void main(String[] args) {
    //오류 나야한다.
    //m.name;
    //m.id;
    //m.password;

    Member m = new Member("신동엽",20,"new","1234");

    System.out.println(m.getName());
    System.out.println(m.getUserId()); //OK, 접근자로만 필드에 접근해야 한다.
    System.out.println(m);

    m.setPassword("1111!"); //OK, 설정자로만 필드의 값을 수정할 수 있다.
    System.out.println(m);
  }
}
