package practice.ch5;

public class Test1 {
  //문자열 s에 포함된 문자 c의 갯수를 반환하도록 구현
  //"aaaccc"의 경우 a가 3개, c가 3개 있다는 것을 반환하는 문제
  //문자열을 하나씩 읽으면서(charAt 메서드 이용), i번째 읽어온 문자가 c와 같은지 비교하고
  //같으면 count를 하나씩 증가시킨다.

  static int countChar(String s, char c) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countChar("aaabbcc", 'a'));
    System.out.println(countChar("aaabbcc", 'b'));
    System.out.println(countChar("aaabbcc", 'c'));
  }
}
