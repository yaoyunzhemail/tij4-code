package generics;//: generics/Erased.java
// {CompileTimeError} (Won't compile)

public class Erased<T> {
  private final int SIZE = 100;
  public static void f(Object arg) {
    //TODO 姚云哲此处验证错误，注释掉

//    if(arg instanceof T) {}          // Error
//    T var = new T();                 // Error
//    T[] array = new T[SIZE];         // Error
//    T[] array = (T)new Object[SIZE]; // Unchecked warning
  }
} ///:~
