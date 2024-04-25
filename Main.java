package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] params){
        Human mustermann = new Human("Mustermann",
                LocalDate.of(1982,2,9), Gender.Male);
        Human musteroma = new Human("Musteroma", LocalDate.of(1910, 5, 15),
                Gender.Female, LocalDate.of(1990, 8, 10));
        Human mustermuter = new Human("Mustermuter", LocalDate.of(1950, 8, 16),
                Gender.Female);
        Human musteropa = new Human("Musteropa", LocalDate.of(1912, 5, 20),
                Gender.Male, LocalDate.of(1990, 8, 10));

        mustermuter.setFather(musteropa);
        mustermuter.setMother(musteroma);

        FamilyTree familyTree = new FamilyTree(mustermann);
        familyTree.addHuman(mustermann, null, mustermuter);

        // Вывод информации о семейном дереве
        System.out.println(familyTree);
    }
}