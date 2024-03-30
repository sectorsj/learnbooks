package ru.sectorsj._214_abstractClasses;

abstract class Person {
    public abstract String getDescription();

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
