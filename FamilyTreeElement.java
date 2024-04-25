package org.example;

import java.time.LocalDate;

public interface FamilyTreeElement {
    String getName();
    LocalDate getDateOfBirth();
    LocalDate getDeathDate();
    Gender getGender();
}