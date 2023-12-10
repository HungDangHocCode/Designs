package Bai1;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> members = new ArrayList<>();

    public void addMember(Person person) {
        members.add(person);
    }

    public List<Person> getMembers() {
        return members;
    }

    public void displayDetails() {
        System.out.println("Couple:");
        for (Person member : members) {
            System.out.println(member.toString());
        }
    }
}
