package typeinfo;//: typeinfo/BoundedClassReferences.java

public class BoundedClassReferences {
    public static void main(String[] args) {
        // Integer虽然继承Number，但是Integer Class 不是Number Class对象的子类
//        Class<Number> genericIntClass2 = int.class;// Illegal

        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        // Or anything else derived from Number.
    }
} ///:~
