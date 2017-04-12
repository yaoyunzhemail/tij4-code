package generics;//: generics/ExplicitTypeSpecification.java

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {
    }

    // TODO 不需要这种写法
    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
} ///:~
