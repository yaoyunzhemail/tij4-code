package generics;//: generics/GenericWriting.java

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {

  static <T> void writeExact(List<T> list, T item) {
    list.add(item);
  }

  static List<Apple> apples = new ArrayList<Apple>();
  static List<Fruit> fruit = new ArrayList<Fruit>();

  static void f1() {
    writeExact(apples, new Apple());
    // TODO 文档显示说，会报错，但实际未发生错误
    // Error:
    // Incompatible types: found Fruit, required Apple
     writeExact(fruit, new Apple());
  }

  static <T> void
  writeWithWildcard(List<? super T> list, T item) {
    list.add(item);
  }

  static void f2() {
    writeWithWildcard(apples, new Apple());
    writeWithWildcard(fruit, new Apple());
  }

  public static void main(String[] args) {
    f1();
    f2();
  }
} ///:~
