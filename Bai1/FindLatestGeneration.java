package Bai1;

public class FindLatestGeneration {
    public static int findLatestGeneration(Person person) {
        int latestGeneration = person.getGeneration();

        for (Person child : person.getChildren()) {
            int childGeneration = findLatestGeneration(child);
            latestGeneration = Math.max(latestGeneration, childGeneration);
        }

        return latestGeneration;
    }

    public static void printLatestGenerationMembers(Person person, int targetGeneration, int currentGeneration) {
        if (currentGeneration == targetGeneration) {
            System.out.println(person.toString() + ", Generation: " + person.getGeneration());
        }

        for (Person child : person.getChildren()) {
            printLatestGenerationMembers(child, targetGeneration, currentGeneration + 1);
        }
    }
}
