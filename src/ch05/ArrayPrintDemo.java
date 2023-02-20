package ch05;

import java.util.Arrays;

public class ArrayPrintDemo {
  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    String [] sArr = {"A", "B", "C"};
    char [] cArr = {'a', 'b', 'c'};

    System.out.println(arr);
    System.out.println(sArr);
    System.out.println(cArr);

    //for문으로 출력하기
    for(int i=0; i<5; i++) {
      System.out.println(arr[i]);
    }

    //배열을 이용해서 arr을 num에 순서대로 넣어준다.
    for(int num : arr) {
      System.out.println(num);
    }

    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(sArr));
    System.out.println(Arrays.toString(cArr));
  }
}
