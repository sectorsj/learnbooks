package ru.sectorsj.java_for_biginners._8_using_classes_and_objects._309_anonymous_class_demo;

public abstract class Base {
    private String name;

    Base(String txt) {
        name = txt;
    }

    void show() {
        System.out.println("Имя объекта: " + name);
    }

    abstract void hello();
}
