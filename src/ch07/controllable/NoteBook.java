package ch07.controllable;

public class NoteBook extends Computer implements Portable {
  @Override
  public void inMyBag() {
    System.out.println("노트북은 내 가방안에 있다.");
  }

  @Override
  public void turnOff() {
    System.out.println("노트북을 끈다.");
  }

  @Override
  public void turnOn() {
    System.out.println("노트북을 켠다.");
  }

  public static void main(String[] args) {
    NoteBook nb = new NoteBook();
    nb.inMyBag();
    nb.turnOn();
    nb.turnOff();
    nb.repair();  //노트북에 대한 사항은 따로 만들지 않았으므로 기존 Computer에 대한 정보가 출력된다.
  }
}
