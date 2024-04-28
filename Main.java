package org.example;

import org.example.Model.FamilyTree;
import org.example.Model.Gender;
import org.example.Model.Human;
import org.example.View.ConsoleUI;
import org.example.View.View;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.Start();
    }
}