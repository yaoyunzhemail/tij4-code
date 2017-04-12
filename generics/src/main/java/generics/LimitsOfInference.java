package generics;//: generics/LimitsOfInference.java

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {
        System.out.println(" f () ....");
    }

    public static void main(String[] args) {
        // JDK5 Does not compile
        // TODO 不知从JDK的哪个版本开始可以编译了
        f(New.map());
    }
} ///:~
