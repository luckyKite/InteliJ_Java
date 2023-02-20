package ch05;

public class String3Demo {
  public static void main(String[] args) {
    String s1 = "Hi";
    String s2 = ", Java";
    String t1 = " java";

    System.out.println(s2.length());
    s1 = s1.concat(s2);
    System.out.println(s1);

    String s3 = " ";
    System.out.println(s3.isEmpty()); // 공백인가? -> ㄴㄴ
    System.out.println(s3.isBlank()); // 빈칸인가? -> ㅇㅇ

    String s4 = "";
    System.out.println(s4.isEmpty());
    System.out.println(s4.isBlank());
  }
}
