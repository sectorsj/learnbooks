package ru.sectorsj._465_treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        var parts = new TreeSet<Item>();
        parts.add(new Item("Тостер", 1234));
        parts.add(new Item("Виджет", 4562));
        parts.add(new Item("Модем", 9912));
        System.out.println(parts);

        var sortedByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));

        sortedByDescription.addAll(parts);
        System.out.println(sortedByDescription);
    }
}
