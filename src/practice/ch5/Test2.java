package practice.ch5;

public class Test2 {
  //실행결과가 9, 5, 14 를 출력하도록 하나의 sumExceptFirst 메서드를 완성해라.
  //첫번째 매개변수를 제외한 나머지 매개변수들의 합만 반환하는 메서드임
  //오버로딩 하지말고, "하나의" 메서드를 만들어라.
  //매개변수의 수가 여러 개인 메서드를 작성하는 문제

  static int sumExceptFirst(int i, int...vars) {
    int sum = 0;

    //이 방법으로 할 수도 있다.
//    for(int v : vars) {
//      sum += v;
//    }

    for (int j = 0; j < vars.length; j++) {
      sum += vars[j];
      // vars 중에서 i와 같은 수가 있으면 제외한다고 할때 아래 문장을 추가함
//        if(vars[j] == i) {
//          sum -= vars[j];
//        }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sumExceptFirst(2,2,3,4));
    int arr[] = {2,3};
    System.out.println(sumExceptFirst(1, arr));
    System.out.println(sumExceptFirst(1,2,3,4,5));
  }
}
