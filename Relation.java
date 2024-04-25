package org.example;

public class Relation {
    private Human root;

    public void addHuman(Human child, Human father, Human mother) {
        if (root == null) {
            root = child;  // Устанавливаем ребенка как корень, если это первый вызов
        }
        child.setFather(father);
        child.setMother(mother);
    }

    private void printTree(Human current) {
        if (current == null) return;
        System.out.println(current);  // Вывод информации о текущем человеке
        if (current.getFather() != null) {
            System.out.println("Father:");
            printTree(current.getFather());  // Рекурсивный вызов для отца
        }
        if (current.getMother() != null) {
            System.out.println("Mother:");
            printTree(current.getMother());  // Рекурсивный вызов для матери
        }
    }

    public void printFamilyTree() {
        printTree(root);
    }
}
