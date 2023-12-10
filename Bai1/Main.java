package Bai1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person james = new Person("James", "01/01/1978", Gender.MALE, 0);
        Person hana = new Person("Hana", "02/03/1978", Gender.FEMALE, 0);
        Person ryan = new Person("Ryan", "11/11/2004", Gender.MALE, 1);
        Person kai = new Person("Kai", "09/10/2000", Gender.MALE, 1);
        Person jennifer = new Person("Jennifer", "03/11/2000", Gender.FEMALE, 1);
        Person tom = new Person("Tom", "05/06/2020", Gender.MALE, 2);
        Person jack = new Person("Jack", "05/06/2020", Gender.MALE, 2);
        Person rose = new Person("Rose", "10/12/2023", Gender.FEMALE, 2);
        Person jennie = new Person("Jennie", "10/12/2023", Gender.FEMALE, 2);

        james.marry(hana);
        james.addChild(ryan);
        james.addChild(kai);
        kai.marry(jennifer);
        kai.addChild(tom);
        kai.addChild(jack);
        kai.addChild(rose);
        kai.addChild(jennie);

        List<Person> singles = FindSinglePersons.findSinglePersons(james);
        System.out.println("Single Persons:");
        singles.forEach(single -> System.out.println(single.toString()));

        List<Family> couplesWith2Children = FindCouplesWith2Children.findCouplesWith2Children(james);
        System.out.println("\nCouples with 2 Children:");
        for (Family couple : couplesWith2Children) {
            couple.displayDetails();
        }

        int latestGeneration = FindLatestGeneration.findLatestGeneration(james);
        System.out.println("\nNew members:");
        FindLatestGeneration.printLatestGenerationMembers(james, latestGeneration, 0);
    }
}

