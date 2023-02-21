package ch07.sound;

public class AnimalDemo {
  public static void main(String[] args) {
    Dog d = new Dog();
    Cuckoo c = new Cuckoo();

    d.sound();
    c.sound();

  }

  static void makeSound(Animal a) {
    a.sound();
  }
}
