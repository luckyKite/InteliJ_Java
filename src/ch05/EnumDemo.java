package ch05;

public class EnumDemo {
  public static void main(String[] args) {
    Gender gender = Gender.FEMALE;

    if(gender == Gender.MALE) {
      System.out.println(Gender.MALE+"은 병역의무 YES");
    } else {
      System.out.println(Gender.FEMALE+"은 병역의무 NO");
    }

    switch (gender) {
      case MALE:
        System.out.println("병역의무가 있다.");
        break;
      case FEMALE:
        System.out.println("병역의무가 없다.");
        break;
    }

  }
}

enum Gender { MALE, FEMALE }

enum Direction { SOUTH, NORTH, EAST, WEST }