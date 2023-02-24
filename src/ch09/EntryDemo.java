package ch09;

class Entry<K, V> {
  private K key;
  private V value;

  public Entry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }
}

public class EntryDemo {
  public static void main(String[] args) {
    Entry<String, Integer> e1 = new Entry<>("홍길동",22);
    System.out.println(e1.getKey() + e1.getValue());

    Entry<Integer, Integer> e2 = new Entry<>(1, 100);

    // + 하면 101 나옴 -> 오토언박싱(int 기본타입으로 바뀜) 되기 때문에!
    System.out.println(e2.getKey()+ " , " + e2.getValue());
  }
}
