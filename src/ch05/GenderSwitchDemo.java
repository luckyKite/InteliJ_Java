package ch05;

public class GenderSwitchDemo {
  public static void main(String[] args) {
    Gender1 gender = Gender1.남성;

    switch (gender) {
      case 남성:
        System.out.println("병역 ㄱㄱ");
        break;
      case 여성:
        System.out.println("병역 ㄴㄴ");
        break;
    }
  }
}

enum Gender1 {
  남성, 여성; //상수에 한글을 넣어서 사용 가능
}