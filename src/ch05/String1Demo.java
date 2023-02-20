package ch05;

public class String1Demo {
  public static void main(String[] args) {
    String s1 = "Hello, Java";
    String s2 = "Hello, Java";

    System.out.println(" s1 == s2 : " + (s1== s1));

    String s3 = new String("Hello, Java");
    String s4 = new String("Hello, Java");

    s1 = s3;

    System.out.println(" s3 == s4 : " + (s3 == s4));
    System.out.println(" s1 == s3 : " + (s1 == s3));
  }
}
