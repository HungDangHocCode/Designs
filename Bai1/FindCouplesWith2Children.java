package Bai1;

import java.util.ArrayList;
import java.util.List;

public class FindCouplesWith2Children {
    public static List<Family> findCouplesWith2Children(Person person) {
        List<Family> couples = new ArrayList<>();

        if (person.getSpouse() != null && person.getChildren().size() == 2) {
            Person spouse = person.getSpouse();
            Family couple = new Family();
            couple.addMember(person);
            couple.addMember(spouse);
            couples.add(couple);
        }

        for (Person child : person.getChildren()) {
            couples.addAll(findCouplesWith2Children(child));
        }

        return couples;
    }
}
