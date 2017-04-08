package generics;//: generics/Manipulation.java
// {CompileTimeError} (Won't compile)

class Manipulator<T> {
  private T obj;
  public Manipulator(T x) { obj = x; }
    //TODO 姚云哲此处验证错误，注释掉
  // Error: cannot find symbol: method f():
//  public void manipulate() { obj.f(); }
}

public class Manipulation {
  public static void main(String[] args) {
    HasF hf = new HasF();
    Manipulator<HasF> manipulator =
      new Manipulator<HasF>(hf);

      //TODO 姚云哲此处验证错误，注释掉
//    manipulator.manipulate();
  }
} ///:~
