package generics;//: generics/UseList.java
// {CompileTimeError} (Won't compile)
import java.util.*;

public class UseList<W,T> {
  //TODO 姚云哲此处验证错误，注释掉
//  void f(List<T> v) {}
  void f(List<W> v) {}
} ///:~
