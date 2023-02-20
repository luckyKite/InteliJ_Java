package ch05;

public class ConstDemo {
  public static void main(String[] args) {
    final int MALE = 0;
    final int FEMALE = 1;
    final int SOUTH = 1;
    final int NORTH = 2;

    int gender = SOUTH; //FEMALE이 아닌데도 1이 같아서 동일하게 취급되는 문제가 있다!

    if(gender == MALE) {
      System.out.println(MALE + "은 병역의무가 있다.");
    } else {
      System.out.println(FEMALE + "은 병역의무가 없다.");
    }
    System.out.println();
  }
}
