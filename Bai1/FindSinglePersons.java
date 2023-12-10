package Bai1;

import java.util.ArrayList;
import java.util.List;

public class FindSinglePersons {
    public static List<Person> findSinglePersons(Person person) {
        List<Person> singles = new ArrayList<>();

        if (person.getSpouse() == null) {
            singles.add(person);
        }

        for (Person child : person.getChildren()) {
            singles.addAll(findSinglePersons(child));
        }

        return singles;
    }
}
