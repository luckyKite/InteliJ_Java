package ch03;

public class Switch2Demo {
  public static void main(String[] args) {
    String kind = "사자";
    
    switch (kind) {
      case "호랑이":
      case "사자" :
        System.out.println("포유류");
        break;
      case "독수리" :
        System.out.println("조류");
        break;
      case "고등어" :
        System.out.println("어류");
        break;
      default:
        System.out.println("해당없음");
    }
  }
  
}
