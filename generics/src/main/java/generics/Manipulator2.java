package generics;//: generics/Manipulator2.java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
} ///:~
