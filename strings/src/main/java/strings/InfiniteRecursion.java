package strings;//: strings/InfiniteRecursion.java
// Accidental recursion.
// {RunByHand}

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString() {
        //递归调用异常，this被转化为String,再次调用了toString方法
//        return " InfiniteRecursion address: " + this + "\n";

        //正确姿势
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
} ///:~
