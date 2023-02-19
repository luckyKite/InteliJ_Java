package ch04;

class Phone {
  String model;
  int value;
  void print() {
    System.out.println(model+ " : " + value);
  }
}

public class PhoneDemo {
  public static void main(String[] args) {
    Phone phone = new Phone(); //@79698539
    phone.model = "갤럭시";
    phone.value = 1_000_000;
    phone.print();
    System.out.println(phone);

    Phone yourPhone = new Phone(); //@73f792cf
    yourPhone.model = "아이폰";
    yourPhone.value = 2_000_000;
    yourPhone.print();
    System.out.println(yourPhone);
  }
}
