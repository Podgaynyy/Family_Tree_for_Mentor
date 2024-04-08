package org.example;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human musterman = new Human("Mustermann", LocalDate.of(1982, 2, 9), Gender.Male);
        Human musteroma = new Human("Musteroma", LocalDate.of(1910, 05, 15), Gender.Female,
                LocalDate.of(1990, 8, 10), null, null, null);
        Human musterfrau = new Human("Musterfrau", LocalDate.of(1950, 8, 16), Gender.Female,
                null, musteroma, null, null);

        FamilyTree mustermanTree = new FamilyTree();
        mustermanTree.addHuman(musterman);
        mustermanTree.addHuman(musterfrau);
        mustermanTree.addHuman(musteroma);
        System.out.println(musterman.getAge());
        System.out.println(mustermanTree.toString());
    }
}