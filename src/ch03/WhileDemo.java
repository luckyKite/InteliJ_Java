package ch03;

public class WhileDemo {
  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(1);
    System.out.println(1);
    System.out.println(1);
    System.out.println(1);

    System.out.println("-------------");

    int i=0;
    while(true) {
      if(i>=5)
        break;
      System.out.println(1);
      i++;
    }
  }
}
