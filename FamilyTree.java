package org.example;

public class FamilyTree <E extends FamilyTreeElement> extends Relation<E>{
    private Human root;

    // Конструктор, который принимает корневого человека семейного дерева
    public FamilyTree(Human root) {
        this.root = root;
    }

    // Метод для добавления человека в дерево, теперь уже не нужен, так как Relation управляет связями
    public void addHuman(Human child, Human father, Human mother) {
        if (root == null) {
            root = child;
        }
        child.setFather(father);
        child.setMother(mother);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        printTree(root, stringBuilder, "");
        return stringBuilder.toString();
    }

    // Рекурсивный метод для печати дерева с отступами для лучшего восприятия структуры
    private void printTree(Human current, StringBuilder stringBuilder, String prefix) {
        if (current == null) return;
        stringBuilder.append(prefix).append(current.toString()).append("\n");
        if (current.getFather() != null) {
            stringBuilder.append(prefix).append("Father:\n");
            printTree(current.getFather(), stringBuilder, prefix + "    "); // Увеличиваем отступ для дочерних элементов
        }
        if (current.getMother() != null) {
            stringBuilder.append(prefix).append("Mother:\n");
            printTree(current.getMother(), stringBuilder, prefix + "    ");
        }
    }
}

